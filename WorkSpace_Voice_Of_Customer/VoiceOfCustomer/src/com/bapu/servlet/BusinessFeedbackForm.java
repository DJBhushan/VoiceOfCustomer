package com.bapu.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bapu.java.ConstructForm;

/**
 * Servlet implementation class for Servlet: BusinessFeedbackForm
 *
 */
 public class BusinessFeedbackForm extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
   static final long serialVersionUID = 1L;
   
    /* (non-Java-doc)
	 * @see javax.servlet.http.HttpServlet#HttpServlet()
	 */
	public BusinessFeedbackForm() {
		super();
	}   	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		

		
        String ctype = "BUSINESS";
		
		ConstructForm cf = new ConstructForm();
		
		ArrayList<String> li =   cf.getQuestion(ctype);
		
		System.out.println("SERVLET = "+li);
		
		request.setAttribute("questions", li);
		
		RequestDispatcher rd = request.getRequestDispatcher("BusinessPhoneFeedbackForm.jsp");
		rd.forward(request, response);
		
		
		
		
		
		
	}  	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}   	  	    
}