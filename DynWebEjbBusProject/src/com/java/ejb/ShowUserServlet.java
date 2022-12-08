package com.java.ejb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowUserServlet
 */
@WebServlet("/ShowUserServlet")
public class ShowUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BusBeanRemote service=null;
		PrintWriter out=response.getWriter();
		
			try {
				service=(BusBeanRemote) new InitialContext().lookup("BusBean/remote");
				List<User> userList=service.showUserBean();
				out.println("<table border=1");
				 out.println("<tr><th>userId</th>"
				 		+ "<th>full_name</th>"
				 		+ "<th>contact_no</th>"
				 		+ "<th>email</th>"
				 		+ "<th>username</th>"
				 		+ "<th>psswd</th></tr>");
				for (User user : userList) {
					
			
		out.println("<tr><td>"+user.getUser_id()
            + "</td><td>"+user.getFull_name()+"</td>"
            		+ "<td>"+user.getContact_no()+"</td>"
            				+ "<td>"+user.getEmail()
			+"</td><td>"+user.getUsername()+"</td>"
					+ "<td>"+user.getPsswd()+"</td></tr>");
					
				}out.println("</table>"); 
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
