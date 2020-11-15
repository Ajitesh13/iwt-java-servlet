package com.ajitesh;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisterServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws  ServletException, IOException {
		res.setContentType("text/html"); 
		PrintWriter out = res.getWriter(); 
		String name = req.getParameter("name");
		String gender = req.getParameter("gender");
		String phone = req.getParameter("phone");
		String branch = req.getParameter("branch");
		String room = req.getParameter("room");
		
		out.println("Name: <b>" + name + "</b> Gender: <b>"+ gender +  "</b><br>");
		out.println("Phone: <b>" + phone + "</b><br>");
		out.println("Branch: <b>" + branch + "</b> Room: <b>"+ room +  "</b><br>");

		out.close();

	}
}
