package com.itheima.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo2 extends HttpServlet {

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
//		test1(request);
//		test2(request);
		//������name����Ϣͷ
		Enumeration headers = request.getHeaders("accept-language");
		while(headers.hasMoreElements()){
			String e = (String)headers.nextElement();
			System.out.println(e+":"+request.getHeader(e));
			System.out.println(e);
		}
	}

	private void test2(HttpServletRequest request) {
		//��ȡ����������Ϣͷ��name
		Enumeration names = request.getHeaderNames();
		while(names.hasMoreElements()){
			String e = (String)names.nextElement();
			System.out.println(e+":"+request.getHeader(e));
		}
	}

	private void test1(HttpServletRequest request) {
		//���������Ϣͷ����Ϣ
		//��ȡ���������
		String header = request.getHeader("User-Agent");
		System.out.println(header);
		if(header.toLowerCase().contains("msie")){
			System.out.println("IE�����");
		}else if(header.toLowerCase().contains("firefox")){
			System.out.println("��������");
		}else if(header.toLowerCase().contains("chrome")){
			System.out.println("�ȸ������");
		}else{
			System.out.println("���������");
		}
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