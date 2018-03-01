package gz.itcast.c_servletContext;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletContextDemo3 extends HttpServlet {

	
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		test3();
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}
	
	private void test3() throws IOException{
		ServletContext sc = this.getServletContext();
		String path = sc.getRealPath("/WEB-INF/b.properties");//参数一定要以/开头
		//创建一个properties
		Properties prop = new Properties();
		//创建输入流，读取文件内容
		InputStream in = new FileInputStream(path);
		prop.load(in);
		System.out.println(prop.getProperty("key"));
	}

}
