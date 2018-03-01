package org.zhenyusu.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		read();

	}
	private static void read() throws IOException{
		String path = "E:\\我的学习\\java web\\代码\\IOProject\\Files\\4.txt";
		File file = new File(path);
		Reader reader = new FileReader(file);
		System.out.println(file.length());
		char []array = new char[36];
		reader.read(array);
		for(char c:array){
			System.out.print(c);
		}
		String str = new String(array);
		System.out.println(str);
		reader.close();
	}

}
