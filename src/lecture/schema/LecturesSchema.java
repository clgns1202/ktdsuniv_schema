package lecture.schema;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;

import room.schema.RoomsSchema;
import user.schema.AdminsSchema;
import user.schema.InstructorsSchema;
import user.schema.UsersSchema;

@Document(collection = "lectures")
public class LecturesSchema {

	@Id
	private String id;
	private String lectureName;
	private String lectureContent;

	@DateTimeFormat(iso = ISO.NONE, pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date startDate;

	@DateTimeFormat(iso = ISO.NONE, pattern = "yyyy-MM-dd")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date endDate;

	@DateTimeFormat(iso = ISO.NONE, pattern = "HH:mm")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
	private Date startTime;

	@DateTimeFormat(iso = ISO.NONE, pattern = "HH:mm")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "HH:mm")
	private Date endTime;

	private List<UsersSchema> user;
	private InstructorsSchema instructor;
	private AdminsSchema admin;
	private RoomsSchema room;
	
	private String beaconId;
	private int beaconMajor;
	private int beaconMinor;
	
	

	public String getBeaconId() {
		return beaconId;
	}

	public void setBeaconId(String beaconId) {
		this.beaconId = beaconId;
	}

	public int getBeaconMajor() {
		return beaconMajor;
	}

	public void setBeaconMajor(int beaconMajor) {
		this.beaconMajor = beaconMajor;
	}

	public int getBeaconMinor() {
		return beaconMinor;
	}

	public void setBeaconMinor(int beaconMinor) {
		this.beaconMinor = beaconMinor;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLectureName() {
		return lectureName;
	}

	public void setLectureName(String lectureName) {
		this.lectureName = lectureName;
	}

	public String getLectureContent() {
		return lectureContent;
	}

	public void setLectureContent(String lectureContent) {
		this.lectureContent = lectureContent;
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

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public List<UsersSchema> getUser() {
		return user;
	}

	public void setUser(List<UsersSchema> user) {
		this.user = user;
	}

	public InstructorsSchema getInstructor() {
		return instructor;
	}

	public void setInstructor(InstructorsSchema instructor) {
		this.instructor = instructor;
	}

	public AdminsSchema getAdmin() {
		return admin;
	}

	public void setAdmin(AdminsSchema admin) {
		this.admin = admin;
	}

	public RoomsSchema getRoom() {
		return room;
	}

	public void setRoom(RoomsSchema room) {
		this.room = room;
	}

}
