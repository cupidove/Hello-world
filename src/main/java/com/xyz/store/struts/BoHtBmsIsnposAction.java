package com.xyz.store.struts;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
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
	
	private ServiceManager serviceManager;
	
	public String execute() throws Exception {
		HttpServletResponse response = ServletActionContext.getResponse();
		
		BoHtBmsIsnpos boHtBmsIsnpos = serviceManager.getBoHtBmsIsnposService().getBoHtBmsIsnpos("");
		response.getWriter().print("[" + boHtBmsIsnpos.getSn() + ","  + boHtBmsIsnpos.getWhsid() + ", " + boHtBmsIsnpos.getLocid() + "]");
        return null;
    }

}
