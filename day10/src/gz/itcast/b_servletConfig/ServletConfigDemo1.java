package gz.itcast.b_servletConfig;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletConfigDemo1 extends HttpServlet {

	private ServletConfig config;
	//ʹ�ó�ʼ��������ȡServletConfig���󣬴˶����ɷ�����������
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//����һ
		//���������ļ��е����ֵõ�ֵ
		String encoding = config.getInitParameter("encoding");
		System.out.println(encoding);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

}

//������
	//������
	String encoding = super.getInitParameter("encoding");
	System.out.println("encoding");
}
String encoding = this.getServletConfig().getInitParameter("encoding");
System.out.println("encoding");
