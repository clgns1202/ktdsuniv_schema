package common.mongo.dao.impl;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import category.schema.CategoriesSchema;
import common.mongo.dao.CommonDao;
import common.pageVO.SearchVO;
import common.support.mongo.MongoTemplateSupport;
import user.schema.UsersSchema;

public class CommonDaoImpl extends MongoTemplateSupport implements CommonDao{

	@Override
	public UsersSchema getUserById(String id) {
		Criteria userId = new Criteria("id");
		userId.is(id);
		
		Query query = new Query(userId);
		
		UsersSchema user = getMongo().findOne(query, UsersSchema.class);
		return user;
	}

	@Override
	public CategoriesSchema geCategoriyById(String id) {
		Criteria categoryId = new Criteria("id");
		categoryId.is(id);
		
		Query query = new Query(categoryId);
		
		CategoriesSchema category = getMongo().findOne(query, CategoriesSchema.class);
		return category;
	}

	@Override
	public <T> T getMongoById(String key, String value, Class entityClass) {
		Criteria criteria = new Criteria(key);
		criteria.is(value);
		
		Query query = new Query(criteria);
		
		return (T) getMongo().findOne(query, entityClass);
	}

	@Override
	public <T> List getMongoList(SearchVO search, Class entityClass) {
		
		Criteria criteria = new Criteria();
	
		if(search.getSearchKeyName() != null && search.getSearchKeyName().length() > 0){
			if(search.getSearchKeyword() != null && search.getSearchKeyword().length() > 0){
				criteria = new Criteria(search.getSearchKeyName());			
				criteria.regex(search.getSearchKeyword());
			}
		
		}
		
		Query query = new Query(criteria);
		query.with(new Sort(Sort.Direction.DESC,"_id"));
		query.skip(search.getStartNumber());
		query.limit(search.getEndNumber());
		
		return getMongo().find(query, entityClass);
	}
	
	@Override
	public <T> int getMongoCount(SearchVO search, Class entityClass) {
		
		Criteria criteria = new Criteria();
	
		if(search.getSearchKeyName() != null && search.getSearchKeyName().length() > 0){
			if(search.getSearchKeyword() != null && search.getSearchKeyword().length() > 0){
				criteria = new Criteria(search.getSearchKeyName());
				
				if(search.isIdType()){
					criteria.is(search.getSearchKeyword());
				}else{					
					criteria.regex(search.getSearchKeyword());
				}
			}
		
		}
		
		Query query = new Query(criteria);
		return (int) getMongo().count(query, entityClass);
	}

}
