package com.xyz.store.dao.domain;

import java.io.Serializable;
import java.util.Date;

public class BoHtBmsIinvatt implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -972844483883183680L;
	
	private Long id;
	private String iagroup;
	private String sku;
	private String mrnum;
	private Date mnfdate;
	private Date rcvdate;
	private String ibref;
	private String sapfactory;
	private String saploc;
	private String sapcontrol;
	private String qstate;
	private String addwho;
	private Date addwhen;
	private String editwho;
	private Date editwhen;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIagroup() {
		return iagroup;
	}
	public void setIagroup(String iagroup) {
		this.iagroup = iagroup;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getMrnum() {
		return mrnum;
	}
	public void setMrnum(String mrnum) {
		this.mrnum = mrnum;
	}
	public Date getMnfdate() {
		return mnfdate;
	}
	public void setMnfdate(Date mnfdate) {
		this.mnfdate = mnfdate;
	}
	public Date getRcvdate() {
		return rcvdate;
	}
	public void setRcvdate(Date rcvdate) {
		this.rcvdate = rcvdate;
	}
	public String getIbref() {
		return ibref;
	}
	public void setIbref(String ibref) {
		this.ibref = ibref;
	}
	public String getSapfactory() {
		return sapfactory;
	}
	public void setSapfactory(String sapfactory) {
		this.sapfactory = sapfactory;
	}
	public String getSaploc() {
		return saploc;
	}
	public void setSaploc(String saploc) {
		this.saploc = saploc;
	}
	public String getSapcontrol() {
		return sapcontrol;
	}
	public void setSapcontrol(String sapcontrol) {
		this.sapcontrol = sapcontrol;
	}
	public String getQstate() {
		return qstate;
	}
	public void setQstate(String qstate) {
		this.qstate = qstate;
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

}
