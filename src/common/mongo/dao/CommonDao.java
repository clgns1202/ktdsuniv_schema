package common.mongo.dao;

import java.util.List;

import category.schema.CategoriesSchema;
import common.pageVO.SearchVO;
import user.schema.UsersSchema;

public interface CommonDao {

	public UsersSchema getUserById(String id);
	
	public CategoriesSchema geCategoriyById(String id);
	
	public <T> T getMongoById(String key, String value, Class entityClass);
	
	public <T> int getMongoCount(SearchVO search, Class entityClass);
	public <T> List getMongoList(SearchVO search, Class entityClass);
}
