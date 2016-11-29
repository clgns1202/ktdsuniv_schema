package board.schema;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonFormat;

import category.schema.CategoriesSchema;
import user.schema.UsersSchema;

@Document(collection = "boards")
public class BoardsSchema {

	@Id
	private String id;

	private String subject;
	private String content;

	@DateTimeFormat(iso = ISO.NONE, pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createdDate;

	@DateTimeFormat(iso = ISO.NONE, pattern = "yyyy-MM-dd HH:mm:ss")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
	private Date modifiedDate;
	private UsersSchema user;
	private boolean isPublic;
	private MultipartFile file;
	private String displayFileName;
	private String realFileName;

	private BoardOptionSchema boardOption;
	private CategoriesSchema category;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
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

	public UsersSchema getUser() {
		return user;
	}

	public void setUser(UsersSchema user) {
		this.user = user;
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getDisplayFileName() {
		return displayFileName;
	}

	public void setDisplayFileName(String displayFileName) {
		this.displayFileName = displayFileName;
	}

	public String getRealFileName() {
		return realFileName;
	}

	public void setRealFileName(String realFileName) {
		this.realFileName = realFileName;
	}

	public BoardOptionSchema getBoardOption() {
		return boardOption;
	}

	public void setBoardOption(BoardOptionSchema boardOption) {
		this.boardOption = boardOption;
	}

	public CategoriesSchema getCategory() {
		return category;
	}

	public void setCategory(CategoriesSchema category) {
		this.category = category;
	}

}
