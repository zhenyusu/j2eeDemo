package org.zhenyusu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//read();
		read_v2();
	}
	private static void read() throws IOException{
		String path = "E:\\我的学习\\java web\\代码\\IOProject\\Files\\1.txt";
		File file = new File(path);

		//创建一个文件字节流对象
		FileInputStream inputStream = new FileInputStream(file);
		int b ;
		while((b = inputStream.read())!= -1){
			System.out.print((char)b);
			
		}
		//关闭流
		inputStream.close();
	}
	
	private static void read_v2() throws IOException{
		String path = "E:\\我的学习\\java web\\代码\\IOProject\\Files\\1.txt";
		File file = new File(path);
		
		//创建一个文件字节流对象
		FileInputStream inputStream = new FileInputStream(file);
		
		//创建一个数据，存储文件数据
		byte[] byteArray = new byte[(int)file.length()];
		byte[] array = new byte[3];
		inputStream.read(byteArray);
		String str = new String(byteArray);
		System.out.println(str);
		inputStream.close();
	}

}
