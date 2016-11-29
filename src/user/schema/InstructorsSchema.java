package user.schema;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="instructors")
public class InstructorsSchema {
	
	@Id
	private String id;
	
	private UsersSchema user;
	private String agency;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public UsersSchema getUser() {
		return user;
	}
	public void setUser(UsersSchema user) {
		this.user = user;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	
	
}
