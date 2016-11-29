package project.schema;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

import user.schema.UsersSchema;

@Document(collection = "projectWorks")
public class ProjectWorksSchema {

	@Id
	private String id;
	private String workDetail;
	private int processLevel;
	private String comment;

	@DateTimeFormat(iso = ISO.NONE, pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date complatedDate;

	private UsersSchema user;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getWorkDetail() {
		return workDetail;
	}

	public void setWorkDetail(String workDetail) {
		this.workDetail = workDetail;
	}

	public int getProcessLevel() {
		return processLevel;
	}

	public void setProcessLevel(int processLevel) {
		this.processLevel = processLevel;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getComplatedDate() {
		return complatedDate;
	}

	public void setComplatedDate(Date complatedDate) {
		this.complatedDate = complatedDate;
	}

	public UsersSchema getUser() {
		return user;
	}

	public void setUser(UsersSchema user) {
		this.user = user;
	}

}
