package servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONException;
import net.sf.json.JSONObject;
@WebServlet("/Servletajax")
public class Servletajax extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Servletajax() {
		super();
	}
	public void destroy() {
		super.destroy(); 
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	   response.setContentType("text/html;charset=UTF-8");
	   JSONObject json=new JSONObject();
       JSONObject temp1=new JSONObject();
       try {
           temp1.put("id", 20180603);
           temp1.put("name", "Test");
           temp1.put("age", "20");
           json.put("people", temp1); 
           PrintWriter out = response.getWriter();
           out.print(json);
       } catch (JSONException e) {
           e.printStackTrace();
       }
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text");  
        PrintWriter out = response.getWriter();  
        out.flush();  
        out.close(); 
	}
	public void init() throws ServletException {
	}

}
