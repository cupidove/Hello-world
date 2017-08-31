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
	private long totalRecord;//总记录数
	private long totalPage;//总页数
	private long pageSize;//每页记录数
	private long pageOffset;//分页的开始值
	private long currentPage;//当前页
	private long prePage;//前一页
	public long getTotalRecord() {
		return totalRecord;
	}
	public void setTotalRecord(long totalRecord) {
		this.totalRecord = totalRecord;
	}
	public long getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(long totalPage) {
		this.totalPage = totalPage;
	}
	public long getPageSize() {
		return pageSize;
	}
	public void setPageSize(long pageSize) {
		this.pageSize = pageSize;
	}
	public long getPageOffset() {
		return pageOffset;
	}
	public void setPageOffset(long pageOffset) {
		this.pageOffset = pageOffset;
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
