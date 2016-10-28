package com.bjsxt.action;

public class UserAction2 {
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
	
	public String execute(){
		if("admin".equals(username)&&"000".equals(password)){
			System.out.println("====2");
			return "success";
		}else{
			System.out.println("====2==else");
			return "userLogin";
		}
		
		
	}

}
