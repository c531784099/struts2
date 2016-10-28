package com.bjsxt.action1;

import java.util.List;

public class UserAction2 {
	private Integer id;
	
	private List<String > hobby;
	public List<String> getHobby() {
		return hobby;
	}

	public void setHobby(List<String> hobby) {
		this.hobby = hobby;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}


	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	public String addUser(){
		System.out.println(id);
		System.out.println(user.getName()+"\\"+user.getUpwd()+"\\"+user.getAge());
//		遍历输出从页面传过来的数据
		for (int i = 0; i < hobby.size(); i++) {
			System.out.println(hobby.get(i));
		}
		return "user";
		
	}

}
