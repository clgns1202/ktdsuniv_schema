package common.mongo.dao.impl;

import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import category.schema.CategoriesSchema;
import common.mongo.dao.CommonDao;
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

}
