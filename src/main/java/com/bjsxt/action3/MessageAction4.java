package com.bjsxt.action3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

public class MessageAction4 {
	private Message mesg;
	private InputStream input;
	public Message getMesg() {
		return mesg;
	}
	public void setMesg(Message mesg) {
		this.mesg = mesg;
	}
	public InputStream getInput() {
		return input;
	}
	public void setInput(InputStream input) {
		this.input = input;
	}
	
//	public String readMes(){
//		Message m1=new Message();
//		m1.setId(1);
//		m1.setMsg("中华人民共和国");
//		Map<String,Object> sin=ActionContext.getContext().getSession();
//		sin.put("info", m1);
//		
//		Message m2=(Message) sin.get("info");
//		
//		input=new ByteArrayInputStream(m2.getMsg().getBytes());
//		
//		return "ajaxResp";
//	}
	
	public  String readMes(){
		
//		通过前台的数据传送到后台 并传送到前台。
		input=new ByteArrayInputStream(mesg.getMsg().getBytes());
		return "ajaxResp";	
	}
	
	

}
