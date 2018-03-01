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
		String path = "E:\\�ҵ�ѧϰ\\java web\\����\\IOProject\\Files\\1.txt";
		File file = new File(path);

		//����һ���ļ��ֽ�������
		FileInputStream inputStream = new FileInputStream(file);
		int b ;
		while((b = inputStream.read())!= -1){
			System.out.print((char)b);
			
		}
		//�ر���
		inputStream.close();
	}
	
	private static void read_v2() throws IOException{
		String path = "E:\\�ҵ�ѧϰ\\java web\\����\\IOProject\\Files\\1.txt";
		File file = new File(path);
		
		//����һ���ļ��ֽ�������
		FileInputStream inputStream = new FileInputStream(file);
		
		//����һ�����ݣ��洢�ļ�����
		byte[] byteArray = new byte[(int)file.length()];
		byte[] array = new byte[3];
		inputStream.read(byteArray);
		String str = new String(byteArray);
		System.out.println(str);
		inputStream.close();
	}

}
