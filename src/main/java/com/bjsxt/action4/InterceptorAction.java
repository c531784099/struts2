package com.bjsxt.action4;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class InterceptorAction {
//	多文件的上传、设置为数组
	private List<File> img;
	private List<String> imgFileName;
	private List<String> imgContentType;
	private String path;
	

	
	public List<File> getImg() {
		return img;
	}
	public void setImg(List<File> img) {
		this.img = img;
	}
	public List<String> getImgFileName() {
		return imgFileName;
	}
	public void setImgFileName(List<String> imgFileName) {
		this.imgFileName = imgFileName;
	}
	public List<String> getImgContentType() {
		return imgContentType;
	}
	public void setImgContentType(List<String> imgContentType) {
		this.imgContentType = imgContentType;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	
	public String upLoad(){
		System.out.println("FileName:"+imgFileName+"===="+"FileContentTypes:"+imgContentType);
//		path 保存在 服务器的文件名和路径
		
		String path1=path;	
		try {
//			多文件的上传。
			for (int i = 0; i < img.size(); i++) {	
//				"/"这是反斜杠
					path1=path+"/"+imgFileName.get(i);
					File target=new File(path1);
					FileUtils.copyFile(img.get(i), target);			
			}
//			源文件拷贝到 目标文件		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return "success";
	}

}
