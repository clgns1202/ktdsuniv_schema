package common.mongo.dao;

import category.schema.CategoriesSchema;
import user.schema.UsersSchema;

public interface CommonDao {

	public UsersSchema getUserById(String id);
	
	public CategoriesSchema geCategoriyById(String id);
	
}
