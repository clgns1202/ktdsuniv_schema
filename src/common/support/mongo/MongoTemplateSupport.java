package common.support.mongo;

import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @author mcjan
 *
 */
public class MongoTemplateSupport {

	private MongoTemplate mongoTemplate;
	
	public MongoTemplate getMongo() {
		return mongoTemplate;
	}

	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
	
	
}
