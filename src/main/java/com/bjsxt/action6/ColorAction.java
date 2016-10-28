package com.bjsxt.action6;
/**
 * 测试自定义的类型转换器
 * 将页面的数据转换为自己需要的数据类型、获这封装为  需要的对象  承载数据。
 * 
 * */
public class ColorAction {
	private String  name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	private Color col;

	public Color getCol() {
		return col;
	}

	public void setCol(Color col) {
		this.col = col;
	}
	
	
	 public String executeh(){
		 System.out.println("000000000000000000");
		 
		 System.out.println(col.getB()+"=="+col.getG()+"=="+col.getR());
		 return "conver";
	 }

}
