package com.bjsxt.action2;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
//Action实现接口实现自动注入。
public class Action3  implements RequestAware,SessionAware,ApplicationAware{
	Map<String,Object> req;
	Map<String,Object> ses;
	Map<String,Object> app;

	@Override
	public void setApplication(Map<String, Object> application) {
		// TODO Auto-generated method stub
		this.app=application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.ses=session;
		
	}

	@Override
	public void setRequest(Map<String, Object> request) {
		// TODO Auto-generated method stub
		this.req=request;
		
	}
	
	public String execute(){
		
		req.put("map1", "request");
		ses.put("map2", "session");
		app.put("map3", "application");
		
		return "map";
	}

}
