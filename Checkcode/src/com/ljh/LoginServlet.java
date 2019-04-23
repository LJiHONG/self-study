package com.ljh;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String picode=(String) request.getSession().getAttribute("picode");
		String checkcode=request.getParameter("checkcode");
		//checkcode=checkcode.toUpperCase();���û�������ȫ��ת��Ϊ��д
		if(picode.equals(checkcode)){
			System.out.println("��֤�ɹ�");
		}else{
			System.out.println("��֤���������");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
