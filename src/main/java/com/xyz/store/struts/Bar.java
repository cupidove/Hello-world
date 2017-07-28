package com.xyz.store.struts;

import com.opensymphony.xwork2.ActionSupport;
import com.xyz.store.dao.domain.MessageStore;

public class Bar extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MessageStore messageStore;

    public String execute() {
        messageStore = new MessageStore() ;
        
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }

}
