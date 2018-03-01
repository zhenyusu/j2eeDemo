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
	//使用初始化方法获取ServletConfig对象，此对象由服务器创建。
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//方法一
		//根据配置文件中的名字得到值
		String encoding = config.getInitParameter("encoding");
		System.out.println(encoding);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
	}

}

//方法三
	//方法二
	String encoding = super.getInitParameter("encoding");
	System.out.println("encoding");
}
String encoding = this.getServletConfig().getInitParameter("encoding");
System.out.println("encoding");
