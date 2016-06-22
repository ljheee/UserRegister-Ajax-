package com.ljheee.ajax;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	//需要修改。不支持多线程修改list数据，同时读问题不大。Victor是线程安全的。
    private ArrayList<String> users = new ArrayList<>();
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	
    	//模拟数据库，查询所有用户名---准备匹配
    	users.add("root");
    	users.add("ljh");
    	users.add("admin");
    }
	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("u");
		String other = request.getParameter("o");
		
		String msg = "可用";
		if(users.contains(name)||name.equals("")){
			msg = "不可用";
		}
		
		//发送数据
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(msg);//发送数据,到浏览器内部，发送到请求页面
		
	}
	
	

	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
