package com.bjsxt.action5;

import com.opensymphony.xwork2.ActionContext;

/**
 * 表单的重复提交
 * 需要的效果：返回一个页面只能提交服务器一次、第二次提交就会跳转到  指定的提示页面。
 * 每一个token都会 生成一个标记 保存在session中、每次提交都会 比较保存的session中的标记。
 * 
 * 1、设置 web.xml中的过滤路径、让请求页面经过struts的分发器。
 * 2、在请求页面 导入   struts-tags标签。
 * 3、使用<s:token>标签在  表单域中。
 * 4、在struts.xml 中配置  token\basicStatk拦截器。设置  invalid.token逻辑视图的视图。
 * 5、表单不可以重复提交。
 * */
public class TokenAction {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String executek(){
//		数据存放在 request范围中
	ActionContext ac=ActionContext.getContext();
	ac.put("user", user);
			
		return "tokenresult";
	}

}
