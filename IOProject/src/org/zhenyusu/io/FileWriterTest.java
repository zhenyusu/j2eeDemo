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
		copyFile("E:\\�ҵ�ѧϰ\\java web\\����\\IOProject\\Files\\6.txt","E:\\�ҵ�ѧϰ\\java web\\����\\IOProject\\Files\\7.txt");
	}
	
	private static void write() throws IOException{
		String str = "�ҽ�������-zhenyusu";
		String path = "E:\\�ҵ�ѧϰ\\java web\\����\\IOProject\\Files\\6.txt";
		//��������ָ��Ŀ���ļ�
		Writer writer = new FileWriter(path);
		//д������
		writer.write(str);
		writer.close();
	}
	
	private static void copyFile(String path1,String path2) throws IOException{
		char []array = new char[1024];
		int ch = -1;
		// ��ȡpath1���ļ�����
		Reader reader = new FileReader(path1);
		//д�뵽path2���ļ���ȥ
		Writer writer = new FileWriter(path2);
		while((ch =reader.read(array)) != -1){
			writer.write(array,0,ch);
		}
		//�ر���
		reader.close();
		writer.close();
	}

}
