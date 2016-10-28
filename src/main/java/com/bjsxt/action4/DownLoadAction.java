package com.bjsxt.action4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class DownLoadAction {
//	文件流
	private InputStream input;
//	下载的路径
	private String path;
//	下载的文件名
	 private String filename="111.txt";
	public InputStream getInput() {
		return input;
	}
	public void setInput(InputStream input) {
		this.input = input;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getFilename() {
		return filename;
	}
	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	
	public String downMethod(){
//		拼接 请求资源的位置
		String path1=path+"\\"+filename;
		File file1=new File(path1);
		System.out.println(path1);
		try {
//			资源文件流
			input=new FileInputStream(file1);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return "downgood";
	}

}
