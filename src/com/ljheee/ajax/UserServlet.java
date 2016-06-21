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
      
	//��Ҫ�޸ġ���֧�ֶ��߳��޸�list���ݣ�ͬʱ�����ⲻ��Victor���̰߳�ȫ�ġ�
    private ArrayList<String> users = new ArrayList<>();
    
    @Override
    public void init(ServletConfig config) throws ServletException {
    	super.init(config);
    	
    	//ģ�����ݿ⣬��ѯ�����û���---׼��ƥ��
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
		
		String msg = "����";
		if(users.contains(name)){
			msg = "������";
		}
		
		//��������
		response.setCharacterEncoding("UTF-8");
		response.getWriter().write(msg);//��������,��������ڲ������͵�����ҳ��
		
	}
	
	

	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
