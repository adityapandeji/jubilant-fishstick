package bhim;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class temp extends HttpServlet{
	
		public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
			String name = req.getParameter("n1");
			String pass = req.getParameter("n2");
			
			res.getWriter().println(name + pass);

		}

}
