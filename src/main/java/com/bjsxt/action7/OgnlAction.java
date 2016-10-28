package com.bjsxt.action7;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
/**1\ognl需要配合  struts的标签使用
 * 2、当前的action实例  的数据 不需要使用  #标记
 * 3、非valuestatck对象中的数据  需要使用 #标记。
 * 4、ognl congtext 设置为actioncontext  上下文对象、
 * 5、action是多例的  每一个action实例都会有一个 actioncontext对象。
 * 
 * 
 * 
 * */
public class OgnlAction {
	private User user;
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	private String  name;
	private int age;
	private String address;
	private List<String> list;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	
	public  String M1(){
		
		ActionContext ac=ActionContext.getContext();
		Map<String,Object> m1=ac.getSession();
		m1.put("chengxiang", "wangzheng");
		ac.put("good", "cheng");
		
		
		
		return "ognldisplay";
	}
	

}
