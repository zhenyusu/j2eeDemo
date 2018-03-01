package org.zhenyusu.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferInputStreamTest {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		copy("E:\\我的学习\\java web\\代码\\IOProject\\Files\\7.txt","E:\\我的学习\\java web\\代码\\IOProject\\Files\\8.txt");
	}
	
	private static void copy(String src,String desc) throws IOException{
		File file = new File(src);
		File descFile = new File(desc);
		if(!descFile.exists()){
			descFile.createNewFile();
		}
		//字节写出流
		InputStream in = new FileInputStream(file);
		//字节写入流
		OutputStream out = new FileOutputStream(desc);
		//写入缓冲流
		BufferedOutputStream bufferOut = new BufferedOutputStream(out);
		//写出缓冲流
		BufferedInputStream bufferIn = new BufferedInputStream(in);
		int b;
		while((b = bufferIn.read()) != -1){
			bufferOut.write(b);
		}
		bufferIn.close();
		in.close();
		bufferOut.close();
		out.close();
	}

}
