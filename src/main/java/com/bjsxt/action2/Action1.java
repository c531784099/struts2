package com.bjsxt.action2;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;
/**
 * 我们这里直接获tomcat 提供的  HttpServletRequest对象。直接和Tomcat耦合。
 * */
public class Action1 {
	
	public String  execute(){
		
		HttpServletRequest  req=ServletActionContext.getRequest();
		HttpServletResponse res=ServletActionContext.getResponse();
		HttpSession         ses=req.getSession();
		ServletContext      app=ses.getServletContext();
		
		req.setAttribute("cheng", "xiang");
	    ses.setAttribute("wang", "zheng");
	    app.setAttribute("heng", "bo");
		
		
		return "servlet";
	}
	
	

}
