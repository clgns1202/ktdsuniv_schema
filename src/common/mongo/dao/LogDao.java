package common.mongo.dao;

import common.mongo.schema.LogSchema;

public interface LogDao {

	public void writeLog(LogSchema loggerVO);
}
