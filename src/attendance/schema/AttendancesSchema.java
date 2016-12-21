package attendance.schema;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lecture.schema.LecturesSchema;
import user.schema.UsersSchema;

@Document
public class AttendancesSchema {

	@Id
	private String id;
	private Date dateTime;
	private UsersSchema usersSchema;
	private LecturesSchema lecturesSchema;
	private String result;
	private String cause;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public UsersSchema getUsersSchema() {
		return usersSchema;
	}
	public void setUsersSchema(UsersSchema usersSchema) {
		this.usersSchema = usersSchema;
	}
	public LecturesSchema getLecturesSchema() {
		return lecturesSchema;
	}
	public void setLecturesSchema(LecturesSchema lecturesSchema) {
		this.lecturesSchema = lecturesSchema;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}

}
