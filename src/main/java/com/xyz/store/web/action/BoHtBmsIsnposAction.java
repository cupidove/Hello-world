package com.xyz.store.web.action;

import java.util.List;

import org.apache.struts2.dispatcher.mapper.ActionMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.xyz.store.dao.domain.BoHtBmsIsnpos;
import com.xyz.store.dao.domain.Pager;
import com.xyz.store.dao.service.ServiceManager;

@Controller
public class BoHtBmsIsnposAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private ServiceManager serviceManager;
	
	private BoHtBmsIsnpos boHtBmsIsnpos;
	private List<BoHtBmsIsnpos> isnposList;
	private Pager pager;
	
//	public String execute() throws Exception {
//		HttpServletResponse response = ServletActionContext.getResponse();
//		
////		BoHtBmsIsnpos boHtBmsIsnpos = serviceManager.getBoHtBmsIsnposService().getBoHtBmsIsnpos("LWG1440W7045726DTU51");
////		response.getWriter().print("[" + boHtBmsIsnpos.getSn() + ","  + boHtBmsIsnpos.getWhsid() + ", " + boHtBmsIsnpos.getLocid() + "]");
//		
//		BoHtBmsIsnpos boHtBmsIsnpos = new BoHtBmsIsnpos();
//		boHtBmsIsnpos.setWhsid("KF08");
//		BoHtBmsIinvatt iinvatt = new BoHtBmsIinvatt();
//		iinvatt.setSaploc("D");
//		boHtBmsIsnpos.setBoHtBmsIinvatt(iinvatt);
//		List<BoHtBmsIsnpos> isnposList = serviceManager.getBoHtBmsIsnposService().getBoHtBmsIsnposList(boHtBmsIsnpos);
//		
////		List<BoHtBmsIsnpos> isnposList = serviceManager.getBoHtBmsIsnposService().getBoHtBmsIsnposList2("KF08");
//		if(isnposList !=null && !isnposList.isEmpty()){
//			StringBuffer resp = new StringBuffer();
//			for(BoHtBmsIsnpos s : isnposList){
//				resp.append("[" + s.getSn() + ","  + s.getWhsid() + ", " + s.getLocid() + ", " + s.getBoHtBmsIinvatt().getSku() + ", " + s.getBoHtBmsIinvatt().getSaploc() + "] \n");
//			}
//			response.getWriter().print(resp.toString());
//		} else {
//			response.getWriter().print("serviceManager.getBoHtBmsIsnposService().getBoHtBmsIsnposList(boHtBmsIsnpos) not return");
//		}
//		
//        return null;
//    }
	
	public String execute() throws Exception {
		if(this.boHtBmsIsnpos != null){
			List<BoHtBmsIsnpos> list = serviceManager.getBoHtBmsIsnposService().getBoHtBmsIsnposList(boHtBmsIsnpos);
			Pager pager2 = new Pager();
			pager2.setTotalRecord(list.size());
			setPager(pager2);
			setIsnposList(list);
			System.err.println(boHtBmsIsnpos.getWhsid() + isnposList.size());
		}
		return SUCCESS;
		
	}
	

	public BoHtBmsIsnpos getBoHtBmsIsnpos() {
		return boHtBmsIsnpos;
	}

	public void setBoHtBmsIsnpos(BoHtBmsIsnpos boHtBmsIsnpos) {
		this.boHtBmsIsnpos = boHtBmsIsnpos;
	}

	public List<BoHtBmsIsnpos> getIsnposList() {
		return isnposList;
	}

	public void setIsnposList(List<BoHtBmsIsnpos> isnposList) {
		this.isnposList = isnposList;
	}

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

}
