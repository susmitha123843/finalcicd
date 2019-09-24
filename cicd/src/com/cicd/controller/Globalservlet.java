package com.cicd.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cicd.entity.CicdEmployee;
import com.cicd.entity2.CicdEmployee2;
import com.cicd.service.CicdServiceInterface;
import com.cicd.service.Cicdservice;
import com.cicd.service2.Cicdservice2;
import com.cicd.service2.CicdserviceInterface2;

@WebServlet("/Globalservlet")
public class Globalservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/Html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		String option=request.getParameter("ac");
		if(option.equals("register")) {
			String name=request.getParameter("name");
			String pass=request.getParameter("pass");
			String email=request.getParameter("email");
		
		CicdEmployee ce=new CicdEmployee();
		ce.setName(name);
		ce.setPass(pass);
		ce.setEmail(email);
		CicdServiceInterface cs=Cicdservice.createServiceObject();
		int i=cs.createProfile(ce);
		if(i>=0) {
			
			out.println("successfully registred and login into cicd");
		}
		else
		{
		out.println("register not done");
		}
		}
	if(option.equals("sign in")){
			response.setContentType("text/Html");
			out.println("<html><body>");
			if(option.equals("register")) {
				String name=request.getParameter("name");
				String pass=request.getParameter("pass");CicdEmployee2 ce2=new CicdEmployee2();
				ce2.setName(name);
				ce2.setPass(pass);
				CicdserviceInterface2 cs=Cicdservice2.createServiceObject2();
				int i2=cs.createProfile2(ce2);
				if(i2>0){
			System.out.println("successfully sign in into cicd");
		}
		else{
			System.out.println("login not done");
		}

        out.println("</body></html>");
		}
	
	}
	}
}
	


	


