package ServletProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ServletProject
 */
@WebServlet("/ServletProject")
public class ServletProject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletProject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*response.getWriter().append("Served at: ").append(request.getContextPath());*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		String u=request.getParameter("user");
		String p=request.getParameter("pass");
		String e=request.getParameter("email");
		//String c=request.getParameter("country");
		PrintWriter out=response.getWriter();
		try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1=DatabasePro.initialDatabase();
	
		PreparedStatement p1=con1.prepareStatement("insert into demo1.dineshporject VALUES(?,?,?)");
		
			p1.setString(1, u);
			p1.setString(2, p);
			p1.setString(3, e);
			//p1.setString(4, c);
			
			int i=p1.executeUpdate();
			
			p1.close();
			con1.close();
 			//out.print("successfully inserted");
			if(i>0) {
				//out.println("form successfully");
				response.sendRedirect("registerFile.html");
			}
			else {
				//out.println("form failure");
			response.sendRedirect("register.html");
			}
			
		}
		catch(Exception e1){
			e1.printStackTrace();
		
	}

}
}
