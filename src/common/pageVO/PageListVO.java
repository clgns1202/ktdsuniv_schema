package common.pageVO;

import java.util.List;

import common.util.pager.Pager;

public class PageListVO {

	private List pageList;
	private Pager pager;

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	public List getPageList() {
		return pageList;
	}

	public void setPageList(List pageList) {
		this.pageList = pageList;
	}

}
