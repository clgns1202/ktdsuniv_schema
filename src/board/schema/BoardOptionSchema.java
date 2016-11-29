package board.schema;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "boardOptions")
public class BoardOptionSchema {

	@Id
	private String id;
	private boolean replyYN;
	private int accessLevel;
	private String boardInfo;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isReplyYN() {
		return replyYN;
	}

	public void setReplyYN(boolean replyYN) {
		this.replyYN = replyYN;
	}

	public int getAccessLevel() {
		return accessLevel;
	}

	public void setAccessLevel(int accessLevel) {
		this.accessLevel = accessLevel;
	}

	public String getBoardInfo() {
		return boardInfo;
	}

	public void setBoardInfo(String boardInfo) {
		this.boardInfo = boardInfo;
	}

}
