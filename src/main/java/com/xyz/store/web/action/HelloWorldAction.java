package com.xyz.store.web.action;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.xyz.store.dao.domain.MessageStore;

public class HelloWorldAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private MessageStore messageStore;

    public String execute() throws Exception {
        messageStore = new MessageStore() ;
        String url="http://192.168.2.234:18080/webservice/KonkaR3StoreTerminalMateriel.do?method=syncBoothData&fdStoreId=1&fdStoreAddress=大润发&fdTx=U型&fdMj=20&fdZc=30&fdMonth=3&fdMoney=3000.0&fdTime=2017-08-07&fdPark=KF12&fdMonthFrom=2017-07-01&fdMonthTo=2017-09-01&fdType=zt";
//        String url="http://localhost:18080/konka-wd/webservice/KonkaR3StoreTerminalMateriel.do?method=syncBoothData&fdStoreId=123&fdStoreAddress=大润发&fdTx=U型&fdMj=20&fdZc=30&fdMonth=3&fdMoney=3000.0&fdTime=2017-08-07&fdPark=KF12&fdMonthFrom=2017-07-01&fdMonthTo=2017-09-01&fdType=zt";
        
        URL url2 = new URL(url);
        URLConnection connection = url2.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));   
        HttpServletResponse response = ServletActionContext.getResponse();
        response.getWriter().println(in.readLine());
        return null;
//        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
    
    public static void main(String[] args) throws Exception{
    	   String url="http://192.168.2.234:18080/webservice/KonkaR3StoreTerminalMateriel.do?method=syncBoothData&fdStoreId=1&fdStoreAddress=" + URLEncoder.encode("大润发","UTF-8") + "&fdTx=x型&fdMj=20&fdZc=30&fdMonth=3&fdMoney=3000.0&fdTime=2017-08-07&fdPark=KF12&fdMonthFrom=2017-07-01&fdMonthTo=2017-09-01&fdType=zt";
//         String url="http://localhost:18080/konka-wd/webservice/KonkaR3StoreTerminalMateriel.do?method=syncBoothData&fdStoreId=123&fdStoreAddress=大润发&fdTx=U型&fdMj=20&fdZc=30&fdMonth=3&fdMoney=3000.0&fdTime=2017-08-07&fdPark=KF12&fdMonthFrom=2017-07-01&fdMonthTo=2017-09-01&fdType=zt";
         
         URL url2 = new URL(url);
         URLConnection connection = url2.openConnection();
         BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream())); 
         System.out.println(in.readLine());
    }

}
