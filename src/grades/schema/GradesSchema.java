package grades.schema;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lecture.schema.LecturesSchema;

@Document(collection = "grades")
public class GradesSchema {

	@Id
	private String id;
	private LecturesSchema lecture;
	private List<Scores> score;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public LecturesSchema getLecture() {
		return lecture;
	}

	public void setLecture(LecturesSchema lecture) {
		this.lecture = lecture;
	}

	public List<Scores> getScore() {
		return score;
	}

	public void setScore(List<Scores> score) {
		this.score = score;
	}

}
