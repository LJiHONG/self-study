package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servleta")
public class Servleta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Servleta() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*response.setContentType("text/html;charset=utf-8;");
		PrintWriter out=response.getWriter();
		String username=null;
		username=request.getParameter("username");
        username=username+"test";
        System.out.println(username); 
        //out.write(username); 
        out.print(username);
        out.flush();
        out.close();*/
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8;");
		PrintWriter out=response.getWriter();
		String username=null;
		username=request.getParameter("username");
        username=username+"test";
        System.out.println(username); 
        //out.write(username); 
        out.print(username);
        out.flush();
        out.close();
	}

}
