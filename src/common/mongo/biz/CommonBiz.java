package common.mongo.biz;

import category.schema.CategoriesSchema;
import user.schema.UsersSchema;

public interface CommonBiz {

	public UsersSchema getUserById(String id);
	
	public CategoriesSchema geCategoriyById(String id);
	
}
