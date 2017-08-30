package com.xyz.store.dao.domain;

import java.io.Serializable;

/**
 * 分页类
 * @author guo
 *
 */
public class Pager implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long recordCount;//总记录数
	private long pageCount;//总页数
	private long pageSize;//每页记录数
	private long nextPage;//下一页
	private long currentPage;//当前页
	private long prePage;//前一页
	
	public long getRecordCount() {
		return recordCount;
	}
	public void setRecordCount(long recordCount) {
		this.recordCount = recordCount;
	}
	public long getPageCount() {
		return pageCount;
	}
	public void setPageCount(long pageCount) {
		this.pageCount = pageCount;
	}
	public long getPageSize() {
		return pageSize;
	}
	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}
	public long getNextPage() {
		return nextPage;
	}
	public void setNextPage(long nextPage) {
		this.nextPage = nextPage;
	}
	public long getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(long currentPage) {
		this.currentPage = currentPage;
	}
	public long getPrePage() {
		return prePage;
	}
	public void setPrePage(long prePage) {
		this.prePage = prePage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
