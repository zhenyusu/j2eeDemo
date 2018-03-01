package org.zhenyusu.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//writeTextFile();
		//writeTextFile2();
		//writeTextFile3();
		copy("E:\\我的学习\\java web\\代码\\IOProject\\Files\\3.txt","E:\\我的学习\\java web\\代码\\IOProject\\Files\\5.txt");
	}
	private static void writeTextFile() throws IOException{
		String path = "E:\\我的学习\\java web\\代码\\IOProject\\Files\\2.txt";
		//1.打开文件输出流，流的目的地是指定的文件
		FileOutputStream fos = new FileOutputStream(path);
		
		//2.通过流文件写数据
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.write('Z');
		
		//3.关闭流
		fos.close();

	}
	
	private static void writeTextFile2() throws IOException{
		String data = "\n我叫苏振宇----zhenyusu";
		byte[] dataArray = data.getBytes();//字符串转化为字节
		String path = "E:\\我的学习\\java web\\代码\\IOProject\\Files\\3.txt";
		//1.创建输出流，指向指定的文件
		FileOutputStream fos = new FileOutputStream(path);
		//2.通过流文件写数据
		fos.write(dataArray);
		//3.关闭流
		fos.close();
		}
	private static void writeTextFile3() throws IOException{
		String data = "\n我叫苏振宇----zhenyusu";
		byte[] dataArray = data.getBytes();//字符串转化为字节
		String path = "E:\\我的学习\\java web\\代码\\IOProject\\Files\\4.txt";
		//1.创建输出流，指向指定的文件
		FileOutputStream fos = new FileOutputStream(path,true);
		//2.通过流文件写数据
		fos.write(dataArray);
		//3.关闭流
		fos.close();
		}
	
	private static void copy(String src,String desc) throws IOException{
		File file = new File(src);
		//创建一个字节流对象
		InputStream input = new FileInputStream(file);
		byte[] arr = new byte[(int) (file.length())];
		input.read(arr);
		//关闭读取流
		input.close();
		
		//写
		File descFile = new File(desc);
		
		//文件不存在创建
		if(!descFile.exists()){
			descFile.createNewFile();
		}
		OutputStream fos = new FileOutputStream(descFile);
		fos.write(arr);
		
		//关闭写入流
		fos.close();
		
	}

}
