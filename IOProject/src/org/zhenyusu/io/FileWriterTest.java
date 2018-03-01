package org.zhenyusu.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileWriterTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//write();
		copyFile("E:\\我的学习\\java web\\代码\\IOProject\\Files\\6.txt","E:\\我的学习\\java web\\代码\\IOProject\\Files\\7.txt");
	}
	
	private static void write() throws IOException{
		String str = "我叫苏振宇-zhenyusu";
		String path = "E:\\我的学习\\java web\\代码\\IOProject\\Files\\6.txt";
		//创建流，指向目的文件
		Writer writer = new FileWriter(path);
		//写入数据
		writer.write(str);
		writer.close();
	}
	
	private static void copyFile(String path1,String path2) throws IOException{
		char []array = new char[1024];
		int ch = -1;
		// 读取path1的文件内容
		Reader reader = new FileReader(path1);
		//写入到path2的文件中去
		Writer writer = new FileWriter(path2);
		while((ch =reader.read(array)) != -1){
			writer.write(array,0,ch);
		}
		//关闭流
		reader.close();
		writer.close();
	}

}
