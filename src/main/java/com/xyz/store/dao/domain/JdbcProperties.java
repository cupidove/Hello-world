package com.xyz.store.dao.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JdbcProperties {
	@Value("${jdbc.driverClassName}")
	private String jdbcDriverClazzName;
	
	@Value("${jdbc.url}")
	private String jdbcUrl;
	
	@Value("${jdbc.username}")
	private String jdbcUsername;
	
	@Value("${jdbc.password}")
	private String jdbcPassword;
	
	public String toString(){
		return "jdbcDriverClazzName:" + jdbcDriverClazzName + "; jdbcUrl:" + jdbcUrl + "; jdbcUsername:" + jdbcUsername + "; jdbcPassword:" + jdbcPassword;
	}
//	public String getJdbcDriverClazzName() {
//		return jdbcDriverClazzName;
//	}
//	public void setJdbcDriverClazzName(String jdbcDriverClazzName) {
//		this.jdbcDriverClazzName = jdbcDriverClazzName;
//	}
//	public String getJdbcUrl() {
//		return jdbcUrl;
//	}
//	public void setJdbcUrl(String jdbcUrl) {
//		this.jdbcUrl = jdbcUrl;
//	}
//	public String getJdbcUsername() {
//		return jdbcUsername;
//	}
//	public void setJdbcUsername(String jdbcUsername) {
//		this.jdbcUsername = jdbcUsername;
//	}
//	public String getJdbcPassword() {
//		return jdbcPassword;
//	}
//	public void setJdbcPassword(String jdbcPassword) {
//		this.jdbcPassword = jdbcPassword;
//	}

}
