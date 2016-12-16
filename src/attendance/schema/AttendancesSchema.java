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
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}

}
