package com.bjsxt.action2;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
/**
 * 这里保存的属性信息  保存在了map中、不直接通过servlet API获取、将处理数据耦合的事情交给了 struts2 框架处理。
 *我们只需要直接使用 ActionContext 对象即可、通过ActionContext对象中的数据{装饰模式}
 * */
public class Action2 {
	
	
	public String execute(){
		
		//请求范围的属性保存 映射为map
		ActionContext  ac=ActionContext.getContext();
		ac.put("request","req");
        //会话范围的属性保存 映射为map		
		Map<String,Object> ses=ac.getSession();
		ses.put("session", "good session");
        //应用范围内的属性保存、映射为map
		Map<String,Object> app=ac.getApplication();
		app.put("app", "app good");
		return "tcontext";
	}

}
