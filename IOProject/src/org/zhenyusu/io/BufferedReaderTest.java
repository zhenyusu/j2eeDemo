package org.zhenyusu.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedReaderTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		copy("E:\\�ҵ�ѧϰ\\java web\\����\\IOProject\\Files\\8.txt","E:\\�ҵ�ѧϰ\\java web\\����\\IOProject\\Files\\9.txt");
	}

	public static void copy(String src,String desc) throws IOException{
		File file = new File(src);
		File descFile = new File(desc);
		
		//�ַ���
		Reader in = new FileReader(file);
		Writer out = new FileWriter(descFile);
		
		//�ַ�������
		BufferedReader bufferRead = new BufferedReader(in);
		BufferedWriter bufferWrite = new BufferedWriter(out);
		String line;
		while((line = bufferRead.readLine())!=null){
			bufferWrite.write(line);
			//����
			bufferWrite.newLine();
		}
		bufferRead.close();
		in.close();
		bufferWrite.close();
		out.close();
	}
}
