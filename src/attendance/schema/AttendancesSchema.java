package attendance.schema;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lecture.schema.LecturesSchema;
import user.schema.UsersSchema;

@Document(collection="attendances")
public class AttendancesSchema {

	@Id
	private String id;
	private Date dateTime;
	private String nowDate;
	private String userId;
	private String lectureId;
	private String result;
	private String cause;
	
	
	public String getNowDate() {
		return nowDate;
	}
	public void setNowDate(String nowDate) {
		this.nowDate = nowDate;
	}
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
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getLectureId() {
		return lectureId;
	}
	public void setLectureId(String lectureId) {
		this.lectureId = lectureId;
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
