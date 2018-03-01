package com.itheima.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.dsna.util.images.ValidateCode;

public class ServletDemo4 extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//���߿ͻ��˲�ʹ�û���
		response.setHeader("pragma", "no-cache");
		response.setHeader("cache-control", "no-cache");
		response.setIntHeader("expires", 0);
		ValidateCode vc = new ValidateCode(110, 25, 4, 9);
		vc.write(response.getOutputStream());
	}

	private void test1(HttpServletResponse response) throws IOException {
		//���ڴ��д���һ��ͼ�����
		int width = 110;//ͼ���
		int height = 25;//ͼ���
		BufferedImage img = new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		
		//����һ������
		Graphics g = img.getGraphics();
		//���߿�һ��ɫ
		g.setColor(Color.RED);
		g.drawRect(0, 0, width-1, height-1);
	
		//��ͼƬ��ӱ���ɫ
		g.setColor(Color.PINK);//����һ����ɫ
		g.fillRect(1, 1, width-2, height-2);//�����ɫ
		
		//�����ı���ʽ
		g.setColor(Color.BLUE);
		g.setFont(new Font("����",Font.BOLD|Font.ITALIC,15));
		
		//��ͼƬ����ı�
		Random rand = new Random();
		int position = 20;
		for(int i = 0; i < 4; i++){
			g.drawString(rand.nextInt(10)+"",position,20);//��ͼƬ����ı�
			position += 20;
		}
		//��Ӿ���������
		for(int i = 0; i < 9; i++){
			g.drawLine(rand.nextInt(width), rand.nextInt(height), rand.nextInt(width), rand.nextInt(height));
		}
		//��ͼƬ���������ķ�ʽ������ͻ���
		ImageIO.write(img, "jpg", response.getOutputStream());
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out
				.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
		out.println("<HTML>");
		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
		out.println("  <BODY>");
		out.print("    This is ");
		out.print(this.getClass());
		out.println(", using the POST method");
		out.println("  </BODY>");
		out.println("</HTML>");
		out.flush();
		out.close();
	}

}
