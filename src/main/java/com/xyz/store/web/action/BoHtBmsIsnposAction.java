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
		List<BoHtBmsIsnpos> isnposList = serviceManager.getBoHtBmsIsnposService().getBoHtBmsIsnposList("KF08");
		if(isnposList !=null && !isnposList.isEmpty()){
			StringBuffer resp = new StringBuffer();
			for(BoHtBmsIsnpos s : isnposList){
				resp.append("[" + s.getSn() + ","  + s.getWhsid() + ", " + s.getLocid() + "]");
			}
			response.getWriter().print(resp.toString());
		}
		
        return null;
    }

}
