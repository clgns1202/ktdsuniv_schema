package project.schema;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

import lecture.schema.LecturesSchema;

@Document(collection = "projects")
public class ProjectsSchema {

	@Id
	private String id;

	private TeamsSchema team;
	private LecturesSchema lecture;
	private List<ProjectWorksSchema> projectWorks;

	private String projectName;
	private String projectInfo;

	@DateTimeFormat(iso = ISO.NONE, pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date startDate;

	@DateTimeFormat(iso = ISO.NONE, pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date endDate;

	@DateTimeFormat(iso = ISO.NONE, pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createdDate;

	@DateTimeFormat(iso = ISO.NONE, pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date modifiedDate;

	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public TeamsSchema getTeam() {
		return team;
	}

	public void setTeam(TeamsSchema team) {
		this.team = team;
	}

	public LecturesSchema getLecture() {
		return lecture;
	}

	public void setLecture(LecturesSchema lecture) {
		this.lecture = lecture;
	}

	public List<ProjectWorksSchema> getProjectWorks() {
		return projectWorks;
	}

	public void setProjectWorks(List<ProjectWorksSchema> projectWorks) {
		this.projectWorks = projectWorks;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectInfo() {
		return projectInfo;
	}

	public void setProjectInfo(String projectInfo) {
		this.projectInfo = projectInfo;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}
