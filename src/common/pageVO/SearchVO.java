package common.pageVO;

import java.util.Date;

public class SearchVO {

	private int pageNumber;
	private int startNumber;
	private int endNumber;

	private int searchType;
	private String searchKeyName;
	private String searchKeyword;

	private Date startDate;
	private Date endDate;
	
	private boolean idType = false;

	public boolean isIdType() {
		return idType;
	}

	public void setIdType(boolean idType) {
		this.idType = idType;
	}

	public int getPageNumber() {
		return pageNumber;
	}

	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}

	public int getStartNumber() {
		return startNumber;
	}

	public void setStartNumber(int startNumber) {
		this.startNumber = startNumber;
	}

	public int getEndNumber() {
		return endNumber;
	}

	public void setEndNumber(int endNumber) {
		this.endNumber = endNumber;
	}

	public int getSearchType() {
		return searchType;
	}

	public void setSearchType(int searchType) {
		this.searchType = searchType;
	}

	public String getSearchKeyword() {
		return searchKeyword;
	}

	public void setSearchKeyword(String searchKeyword) {
		this.searchKeyword = searchKeyword;
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

	public String getSearchKeyName() {
		return searchKeyName;
	}

	public void setSearchKeyName(String searchKeyName) {
		this.searchKeyName = searchKeyName;
	}

}
