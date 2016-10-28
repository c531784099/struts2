package com.bjsxt.action6;

import java.util.Map;

import ognl.DefaultTypeConverter;
/*
 * 自定义的类型转换器
 * 1、继承DefaultTypeConverter 这个类、由struts框架来调用。
 * 
 * */
public class ColorTypeConvertor extends DefaultTypeConverter {

	@Override
	public Object convertValue(Map context, Object value, Class toType) {
		if(value!=null){
		
//		将前台的数据封装
		Color colr=null;
		String[] str=(String[])value;
//		判断配置的  要转换的数据类型   根据判断来选择转换格式  并返回数据对象
//		局部的配置文件在本包下ColorAction-conversion.properties     col=com.bjsxt.action6.ColorTypeConvertor
//		全局的在src下   xwork-conversion.properties   com.bjsxt.action6.Color=com.bjsxt.action6.ColorAction
//		目的都是  查找  需要的转换类型。
		if(toType.equals(Color.class)){
			System.out.println("==================");
			String cls=str[0];			
			String[] str2=cls.split(",");
//			封装为color对象
			colr=new Color();			
			colr.setR(Integer.parseInt(str2[0]));
			colr.setG(Integer.parseInt(str2[1]));
			colr.setB(Integer.parseInt(str2[2]));
//			返回封装后的对象
			return colr;			
		}else{	
//			返回默认值、返回字符串
			return value.toString();
		}
		}
//		没有值返回  不需要转换
 		return null;
	}
	
	

}
