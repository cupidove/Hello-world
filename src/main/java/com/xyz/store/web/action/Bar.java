package com.xyz.store.web.action;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
import com.xyz.store.dao.domain.JdbcProperties;
import com.xyz.store.dao.domain.MessageStore;

public class Bar extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MessageStore messageStore;
	
	@Autowired
	private JdbcProperties jdbcProperties;
	

    public String execute() throws Exception {
//        jdbcProperties = new JdbcProperties();
//        jdbcProperties.setJdbcDriverClazzName(jdbcDriverClazzName);
        HttpServletResponse response = ServletActionContext.getResponse();
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print(jdbcProperties.toString());
        return null;
        
//        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

	public void setJdbcProperties(JdbcProperties jdbcProperties) {
		this.jdbcProperties = jdbcProperties;
	}

}
