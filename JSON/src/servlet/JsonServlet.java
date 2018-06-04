package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jms.Session;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.http.HTTPException;

import net.sf.json.JSONObject;
import net.sf.json.util.JSONTokener;

@WebServlet("/JsonServlet")
public class JsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public JsonServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Student stu=new Student();
		try{
			JSONObject jsonObject=new JSONObject();
			jsonObject.put("id","2015121029");
			jsonObject.put("name","¡ıºÃ∫Ï");
			jsonObject.put("age","20");
			String json=jsonObject.toString();
			
			JSONTokener jsonTokener=new JSONTokener(json);
			JSONObject jo=(JSONObject) jsonTokener.nextValue();
			out.println(jo.getString("id"));
			stu.setName(jo.getString("name"));
			stu.setAge(jo.getString("age"));
			HttpSession session=request.getSession();
			session.setAttribute("stu","stu");
			response.sendRedirect("ajax.jsp");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
