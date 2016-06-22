package com.ljheee.ajax;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Servlet implementation class MsgServlet
 */
@WebServlet("/msg")
public class MsgServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	/**
	 * 
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		String nick = request.getParameter("nick");
		String msg = request.getParameter("msg");
		
		Message m = new Message(nick,msg);
		
		ArrayList<Message> list = new ArrayList<>();
		list.add(m);
		list.add(m);
		list.add(m);
		
		//数据存储   Object--->gson
		Gson gson = new Gson();
		String json = gson.toJson(m);
		
		//发响应
		response.setContentType("application/json");
		response.getWriter().write(json);
		
		
	}

}
