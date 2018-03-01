package org.zhenyusu.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		test();
	}

	public static void test() throws IOException{
		String name = "E:\\我的学习\\java web\\代码\\IOProject\\Files\\7.txt";
		File file = new File(name);
		FileInputStream in = new FileInputStream(file);
		//字节流转化为字符流
		InputStreamReader reader = new InputStreamReader(in);
		//BufferedReader 对象来缓冲字符流
		BufferedReader buffer = new BufferedReader(reader);
		String line = null;
		while((line = buffer.readLine())!=null){
			System.out.println(line);
		}
		buffer.close();
		in.close();
		reader.close();
	}
}
