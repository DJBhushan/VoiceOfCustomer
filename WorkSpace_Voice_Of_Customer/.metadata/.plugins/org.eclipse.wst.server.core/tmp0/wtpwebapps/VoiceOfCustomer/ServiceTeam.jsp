
<html>
<head>

<title>SERVICE TEAM MAIN MENU</title>

<%

     session = request.getSession();
     String s = (String)session.getAttribute("E");
     
     if(s==null)
     {
    	 response.sendRedirect("EmployeeLogin.jsp");
     }
     

%>




<script type="text/javascript">



  function Service()
  {
	  
  window.open(f.t1.value);

    
  }



  function Logout()
  {
	   window.close();
	   window.open("Logout.jsp");
    
  }


</script>


</head>
<body background="Images\pdf.jpg" width="200" height="228" >

<form name="f">

<pre>                                                                                                   <input type="button" name="b1" value="LOG-OUT" onClick="Logout()"> 
 </pre>
 
<fieldset>
		<legend><font size="5" color="#2E9AFE"><i>REPORT MENU&nbsp; </i></font> </legend>
                  <br>
                  
SERVICE FEEDBACK REPORT &nbsp;<input type="button" name="b1" value="VIEW PDF" name="SERVICE PHONE REPORT" onClick="Service(f)"><br><br><br>
<input type="hidden" name="t1" value="file:\\127.0.0.1\Voice_Of_Customer_PDF_Reports\PDF_Report_ServiceFeedback" />


   
    
</fieldset>
  
</form>


</body>
</html>