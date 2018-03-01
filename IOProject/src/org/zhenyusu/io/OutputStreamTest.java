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
		copy("E:\\�ҵ�ѧϰ\\java web\\����\\IOProject\\Files\\3.txt","E:\\�ҵ�ѧϰ\\java web\\����\\IOProject\\Files\\5.txt");
	}
	private static void writeTextFile() throws IOException{
		String path = "E:\\�ҵ�ѧϰ\\java web\\����\\IOProject\\Files\\2.txt";
		//1.���ļ������������Ŀ�ĵ���ָ�����ļ�
		FileOutputStream fos = new FileOutputStream(path);
		
		//2.ͨ�����ļ�д����
		fos.write('a');
		fos.write('b');
		fos.write('c');
		fos.write('Z');
		
		//3.�ر���
		fos.close();

	}
	
	private static void writeTextFile2() throws IOException{
		String data = "\n�ҽ�������----zhenyusu";
		byte[] dataArray = data.getBytes();//�ַ���ת��Ϊ�ֽ�
		String path = "E:\\�ҵ�ѧϰ\\java web\\����\\IOProject\\Files\\3.txt";
		//1.�����������ָ��ָ�����ļ�
		FileOutputStream fos = new FileOutputStream(path);
		//2.ͨ�����ļ�д����
		fos.write(dataArray);
		//3.�ر���
		fos.close();
		}
	private static void writeTextFile3() throws IOException{
		String data = "\n�ҽ�������----zhenyusu";
		byte[] dataArray = data.getBytes();//�ַ���ת��Ϊ�ֽ�
		String path = "E:\\�ҵ�ѧϰ\\java web\\����\\IOProject\\Files\\4.txt";
		//1.�����������ָ��ָ�����ļ�
		FileOutputStream fos = new FileOutputStream(path,true);
		//2.ͨ�����ļ�д����
		fos.write(dataArray);
		//3.�ر���
		fos.close();
		}
	
	private static void copy(String src,String desc) throws IOException{
		File file = new File(src);
		//����һ���ֽ�������
		InputStream input = new FileInputStream(file);
		byte[] arr = new byte[(int) (file.length())];
		input.read(arr);
		//�رն�ȡ��
		input.close();
		
		//д
		File descFile = new File(desc);
		
		//�ļ������ڴ���
		if(!descFile.exists()){
			descFile.createNewFile();
		}
		OutputStream fos = new FileOutputStream(descFile);
		fos.write(arr);
		
		//�ر�д����
		fos.close();
		
	}

}
