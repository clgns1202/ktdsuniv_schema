package common.mongo.biz;

import java.util.List;

import category.schema.CategoriesSchema;
import common.pageVO.PageListVO;
import common.pageVO.SearchVO;
import common.util.pager.Pager;
import user.schema.UsersSchema;

public interface CommonBiz {

	public UsersSchema getUserById(String id);
	
	public CategoriesSchema geCategoriyById(String id);
	
	public <T> T getMongoById(String key, String value, Class entityClass);
	
	public <T> PageListVO getMongoList(SearchVO search, Pager pager, Class entityClass);
	
}
