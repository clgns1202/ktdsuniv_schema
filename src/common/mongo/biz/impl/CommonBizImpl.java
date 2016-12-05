package common.mongo.biz.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import category.schema.CategoriesSchema;
import common.mongo.biz.CommonBiz;
import common.mongo.dao.CommonDao;
import common.pageVO.PageListVO;
import common.pageVO.SearchVO;
import common.util.pager.Pager;
import user.schema.UsersSchema;

public class CommonBizImpl implements CommonBiz{

	private Logger logger = LoggerFactory.getLogger(CommonBizImpl.class);
	
	private CommonDao commonDao;
		
	public void setCommonDao(CommonDao commonDao) {
		this.commonDao = commonDao;
	}

	@Override
	public UsersSchema getUserById(String id) {
		return commonDao.getUserById(id);
	}

	@Override
	public CategoriesSchema geCategoriyById(String id) {
		return commonDao.geCategoriyById(id);
	}

	@Override
	public <T> T getMongoById(String key, String value, Class entityClass) {
		return (T) commonDao.getMongoById(key, value, entityClass);
	}

	@Override
	public <T> PageListVO getMongoList(SearchVO search, Pager pager, Class entityClass) {
		
		int count = commonDao.getMongoCount(search, entityClass);
		
		pager.setTotalArticleCount(count);
		pager.setPageNumber(search.getPageNumber());
		
		search.setStartNumber(pager.getStartArticleNumber());
		search.setEndNumber(pager.getEndArticleNumber());
		
		List list = commonDao.getMongoList(search, entityClass);
		
		PageListVO mongoList = new PageListVO();
		mongoList.setPageList(list);
		mongoList.setPager(pager);
		
		return mongoList;
	}


}
