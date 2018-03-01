package com.itheima.servlet;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itheima.entity.User;

public class ServletDemo3 extends HttpServlet {

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
		request.setCharacterEncoding("UTF-8");
		test3(request);
		
//		test4(request);
		
	}

	private void test4(HttpServletRequest request) {
		try {
			User u = new User();
			System.out.println("��װ֮ǰ"+u);
			BeanUtils.populate(u, request.getParameterMap());
			System.out.println("��װ���ݺ�:"+u);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void test3(HttpServletRequest request) {
		try {
			User u = new User();
			System.out.println("��װ֮ǰ"+u);
			//��ȡ��������
			Map<String,String[]> map = request.getParameterMap();
			for(Map.Entry<String, String[]> m:map.entrySet()){
				String name = m.getKey();
				String[] value = m.getValue();
				//����һ������������
				PropertyDescriptor pd = new PropertyDescriptor(name, User.class);//����name��User������get set����
				//�õ�setter����
				Method setter = pd.getWriteMethod();
				if(value.length == 1){
					setter.invoke(u, value[0]);//��һ��ֵ�ı�����ֵ
				}else{
					setter.invoke(u, (Object)value);//�൱�ڸ���ѡ��ֵ
				}
			}
			System.out.println("��װ���ݺ�:"+u);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void test2(HttpServletRequest request)
			throws UnsupportedEncodingException {
		//��ȡ���б���name
		request.setCharacterEncoding("UTF-8");
		Enumeration names = request.getParameterNames();
		while(names.hasMoreElements()){
			String name = (String)names.nextElement();//�õ�ÿһ��name��
			
			String [] values = request.getParameterValues(name);//����name�õ�valueֵ
			for(String value:values){
				System.out.println(name+"\t"+value);
			}
		}
	}

	private void test1(HttpServletRequest request)
			throws UnsupportedEncodingException {
		//doGet(request, response);
		//���߷�����Ҫʹ��ʲô���룬ע�������ʹ�õ���ʲô���봫�����ľ���ʲô���� 
		request.setCharacterEncoding("UTF-8");
		//���ݱ�����name���Ի�ȡvalue���Ե�ֵ
		String userName = request.getParameter("userName");
		String pwd = request.getParameter("pwd");
		String sex = request.getParameter("sex");
		String []hobbys = request.getParameterValues("hobby");
		String city = request.getParameter("city");
		System.out.println(userName);
		System.out.println(pwd); 
		System.out.println(sex);
		for(int i = 0; hobbys != null && i < hobbys.length; i++){
			System.out.println(hobbys[i]+"\t");
		}
		System.out.println();
		System.out.println(city);
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
	
		doGet(request, response);
}}
	