package com.bjsxt.action3;

public class JsonAction5 {
	
	Message mesg;
//返回json数据到客户端使用的方法。
	public Message getMesg() {
		return mesg;
	}

	public void setMesg(Message mesg) {
		this.mesg = mesg;
	}
    public String readMes(){
    	System.out.println(mesg.getMsg()+mesg.getId());
    	mesg.setMsg("中华人民共和国");
		
		return "ajaxjson";
	}

}
