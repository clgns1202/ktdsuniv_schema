package common.mongo.biz.impl;

import category.schema.CategoriesSchema;
import common.mongo.biz.CommonBiz;
import common.mongo.dao.CommonDao;
import user.schema.UsersSchema;

public class CommonBizImpl implements CommonBiz{

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

}
