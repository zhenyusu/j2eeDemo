package com.itheima.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo1 extends HttpServlet {

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

		//��������Ĭ�ϵı�����ISO-8859-1,���ǲ�֧�����ĵģ�tomcat�涨�ġ�
		//���߷�����Ӧ��ʹ��UTF-8�����ı�
		/*response.setCharacterEncoding("UTF-8");
		//���߿ͻ���Ҫʹ��ʲô����
		response.setHeader("content-type", "text/html;charset=UTF-8");*/
		//���߷�����Ӧ��ʹ��UTF-8�����ı�;���߿ͻ���Ҫʹ��ʲô����
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();//�ĵ�һ���ַ������
		out.write("���");//��ͻ�����Ӧ�ı�����
		response.getWriter().write("���");
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