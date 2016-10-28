package com.bjsxt.action;



public class UserAction {
private String username;
private String password;

public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
//StrutsPrepareAndExecuteFilter
public String execute(){
	
	if("admin".equals(username)){
		
		return "upackage";
	}
	if("admin".equals(username)&&"000".equals(password)){
		System.out.println("action==1");
		return "userAction2";
	}else if("admin".equals(username)&&"chong".equals(password)){
		
	return "jsp";	
	}else if("admin".equals(username)&&"action3".equals(password)){
		System.out.println("u3====");
		return "action3";
	}else{
		return "userLogin";
	}
	
	
}

public String  Login(){
	
	return "good";
}

}
