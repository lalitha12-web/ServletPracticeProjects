

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HomeController extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		
		String path=req.getServletPath();
		if(path.equals("")) {
		RequestDispatcher rd=req.getRequestDispatcher("/index.html");
		rd.forward(req, res);
	}
		else if(path.equals("/Login")) {
			RequestDispatcher rd=req.getRequestDispatcher("/login.html");
			rd.forward(req, res);
		}
		else if(path.equals("/Registration")) {
			RequestDispatcher rd=req.getRequestDispatcher("/register.html");
			rd.forward(req, res);
		}
 

}
}
