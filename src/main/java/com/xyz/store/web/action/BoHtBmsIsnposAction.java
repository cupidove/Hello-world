package com.xyz.store.web.action;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.xyz.store.dao.domain.BoHtBmsIsnpos;
import com.xyz.store.dao.service.ServiceManager;

@Controller
public class BoHtBmsIsnposAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	private ServiceManager serviceManager;
	
	public String execute() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		
//		BoHtBmsIsnpos boHtBmsIsnpos = serviceManager.getBoHtBmsIsnposService().getBoHtBmsIsnpos("LWG1440W7045726DTU51");
//		response.getWriter().print("[" + boHtBmsIsnpos.getSn() + ","  + boHtBmsIsnpos.getWhsid() + ", " + boHtBmsIsnpos.getLocid() + "]");
		
		BoHtBmsIsnpos boHtBmsIsnpos = new BoHtBmsIsnpos();
		boHtBmsIsnpos.setWhsid("KF08");
		List<BoHtBmsIsnpos> isnposList = serviceManager.getBoHtBmsIsnposService().getBoHtBmsIsnposList(boHtBmsIsnpos);
		
//		List<BoHtBmsIsnpos> isnposList = serviceManager.getBoHtBmsIsnposService().getBoHtBmsIsnposList2("KF08");
		if(isnposList !=null && !isnposList.isEmpty()){
			StringBuffer resp = new StringBuffer();
			for(BoHtBmsIsnpos s : isnposList){
				resp.append("[" + s.getSn() + ","  + s.getWhsid() + ", " + s.getLocid() + ", " + s.getBoHtBmsIinvatt().getSku() + "] \n");
			}
			response.getWriter().print(resp.toString());
		} else {
			response.getWriter().print("serviceManager.getBoHtBmsIsnposService().getBoHtBmsIsnposList(boHtBmsIsnpos) not return");
		}
		
        return null;
    }

}
