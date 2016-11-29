package grades.schema;

import java.util.List;

import user.schema.UsersSchema;

public class Scores {

	private UsersSchema user;
	private List<Tests> test;

	public UsersSchema getUser() {
		return user;
	}

	public void setUser(UsersSchema user) {
		this.user = user;
	}

	public List<Tests> getTest() {
		return test;
	}

	public void setTest(List<Tests> test) {
		this.test = test;
	}

}
