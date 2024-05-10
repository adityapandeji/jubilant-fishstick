package com.pande;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class AddServlet extends HttpServlet
{
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		double k=0;
		String S=req.getParameter("op");
		if(S.equals("+"))
			 k=i+j;
		if(S.equals("-"))
			 k=i-j;
		if(S.equals("*"))
			 k=i*j;
		if(S.equals("/"))
			 k=i/j;
		
		//System.out.println(k);
	PrintWriter out = res.getWriter();
	out.println(k);
	}
}
