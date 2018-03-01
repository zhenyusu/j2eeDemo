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
		String name = "E:\\�ҵ�ѧϰ\\java web\\����\\IOProject\\Files\\7.txt";
		File file = new File(name);
		FileInputStream in = new FileInputStream(file);
		//�ֽ���ת��Ϊ�ַ���
		InputStreamReader reader = new InputStreamReader(in);
		//BufferedReader �����������ַ���
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
