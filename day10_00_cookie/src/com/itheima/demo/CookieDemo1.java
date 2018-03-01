package com.itheima.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieDemo1 extends HttpServlet {

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
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		//��ȡ�ͻ��˱����������ʱ��
		Cookie[] cookies = request.getCookies();//��ÿͻ��˵�����Cookie����
		for(int i = 0;cookies!=null && i<cookies.length;i++){
			if("lastAccessTime".equals(cookies[i].getName())){//�жϵ�ǰCookie��name�Ƿ�����Ҫ��cookie
				long l = Long.parseLong(cookies[i].getValue());
				out.write("�����ķ���ʱ��Ϊ:"+new Date(l).toLocaleString());//תΪyyyy-MM-dd��ʽ
			}
		}
		out.print("<a href ='"+request.getContextPath()+"/ClearCookie' >clear</a>");
		//����һ��cookie ������Ϣд�ص��ͻ���
		Cookie ck = new Cookie("lastAccessTime",System.currentTimeMillis()+"");
		//����cookie����Чʱ�䣬��λ����
		ck.setMaxAge(60*5);//����ʱ��Ϊ5����
		//����Cookie��·��
//		ck.setPath("/day10_00_cookie");
//		ck.setPath(request.getContextPath());
		ck.setPath("/");
		//������Ϣд�ص��ͻ���
		response.addCookie(ck);
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