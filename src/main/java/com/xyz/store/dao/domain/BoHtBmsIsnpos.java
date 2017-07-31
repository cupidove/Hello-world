package com.xyz.store.dao.domain;

import java.util.Date;

public class BoHtBmsIsnpos {
	private Long id;
	private String sn;
	private String whsid;
	private String locid;
	private String lpn;
	private String iagroup;
	private char stillhere;
	private Date inwhen;
	private Long intrxnid;
	private Date outwhen;
	private Long outtrxnid;
	private String addwho;
	private Date addwhen;
	private String editwho;
	private Date editwhen;
	private String barcodetype;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getWhsid() {
		return whsid;
	}
	public void setWhsid(String whsid) {
		this.whsid = whsid;
	}
	public String getLocid() {
		return locid;
	}
	public void setLocid(String locid) {
		this.locid = locid;
	}
	public String getLpn() {
		return lpn;
	}
	public void setLpn(String lpn) {
		this.lpn = lpn;
	}
	public String getIagroup() {
		return iagroup;
	}
	public void setIagroup(String iagroup) {
		this.iagroup = iagroup;
	}
	public char getStillhere() {
		return stillhere;
	}
	public void setStillhere(char stillhere) {
		this.stillhere = stillhere;
	}
	public Date getInwhen() {
		return inwhen;
	}
	public void setInwhen(Date inwhen) {
		this.inwhen = inwhen;
	}
	public Long getIntrxnid() {
		return intrxnid;
	}
	public void setIntrxnid(Long intrxnid) {
		this.intrxnid = intrxnid;
	}
	public Date getOutwhen() {
		return outwhen;
	}
	public void setOutwhen(Date outwhen) {
		this.outwhen = outwhen;
	}
	public Long getOuttrxnid() {
		return outtrxnid;
	}
	public void setOuttrxnid(Long outtrxnid) {
		this.outtrxnid = outtrxnid;
	}
	public String getAddwho() {
		return addwho;
	}
	public void setAddwho(String addwho) {
		this.addwho = addwho;
	}
	public Date getAddwhen() {
		return addwhen;
	}
	public void setAddwhen(Date addwhen) {
		this.addwhen = addwhen;
	}
	public String getEditwho() {
		return editwho;
	}
	public void setEditwho(String editwho) {
		this.editwho = editwho;
	}
	public Date getEditwhen() {
		return editwhen;
	}
	public void setEditwhen(Date editwhen) {
		this.editwhen = editwhen;
	}
	public String getBarcodetype() {
		return barcodetype;
	}
	public void setBarcodetype(String barcodetype) {
		this.barcodetype = barcodetype;
	}

}
