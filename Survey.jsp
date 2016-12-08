<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<html>			<!-- PAURAV SURENDRA G01003778-->
<s:head/>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>SURVEY FORM</title>
<link rel="stylesheet" href="css/styles.css" type="text/css">
<link rel="stylesheet" href="css/jquery-ui.css" type="text/css">
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/jquery-ui.js" type="text/javascript"></script>
<script src="js/survey.js" type="text/javascript"></script>
<script>
window.onload = welcomeUser();
</script>
							
</head>

<body>

<a href="index.html" style="text-decoration:none">
<div class="header" align="center">
	<h2>GEORGE MASON UNIVERSITY</h2>
	<h2>COMPUTER SCIENCE DEPARTMENT</h2>
</div></a>
<div align="right" onClick="setCookie()" style="text-decoration:underline; cursor:pointer; color:#00F">Change Username</div>

<div class="content">
	<h1> SURVEY</h1><br/>
    <div class="formTable" align="center" >
    <table class="formtable">
    <s:form action="runmain" namespace="/" method="POST" autocomplete="on" focusElement="student_id">
    
       	<tr class="field" align="center"><td>STUDENT ID</td></tr>
        <tr align="center"><td><s:textfield name="student_id" size="30" /></td></tr>
        
        <tr class="field" align="center"><td>NAME</td></tr>
        <tr align="center"><td><s:textfield name="student_name" size="30"/></td></tr>
    
    	<tr class="field" align="center"><td>STREET ADDRESS</td></tr>
        <tr align="center"><td><s:textfield name="student_address" size="30" /></td></tr>
    
    	<tr class="field" align="center"><td>CITY</td></tr>
        <tr align="center"><td><s:textfield name="student_city" size="30" /></td></tr>
    
    	<tr class="field" align="center"><td>STATE</td></tr>
        <tr align="center"><td><s:textfield name="student_state" size="15" /></td></tr>
    
    	<tr class="field" align="center"><td>ZIPCODE</td></tr>
        <tr align="center"><td><s:textfield name="student_zipcode" size="10" onBlur= "zipCheck(this.value)" /></td></tr>
    
    	<tr class="field" align="center"><td>PHONE NUMBER</td></tr>
        <tr align="center"><td><s:textfield name="student_phone" size="30"/></td></tr>
    
    	<tr class="field" align="center"><td>EMAIL ID</td></tr>
        <tr align="center"><td><s:textfield name="student_email" size="30" /></td></tr>
    
    	<tr class="field" align="center"><td>URL</td></tr>
        <tr align="center"><td><s:textfield name="student_url" size="30" /></td></tr>
    
    	<tr class="field" align="center"><td>DATE OF VISIT</td></tr>
        <tr align="center"><td><s:textfield name="student_date" size="30" /></td></tr>
    
    	<tr class="field" align="center"><td>BEST FEATURES </td></tr>
        <tr align="center"><td><s:checkboxlist name="gmu_features" list="{'Students','Location','Campus','Atmosphere','Dorm Rooms','Sports'}"/></td></tr>
   
    	<tr class="field" align="center"><td>FOUND COLLEGE VIA</td></tr>
        <tr align="center"><td><s:radio name="student_source" list="{'TV','Friends','Internet','Other'}"/></tr>
    
    	<tr class="field" align="center"><td>GRAD DATE</td></tr>
        <tr align="center"><td><s:select name="student_month" list="{'JANUARY','FEBRUARY','MARCH','APRIL','MAY','JUNE','JULY','AUGUST','SEPTEMBER','OCTOBER','NOVEMBER','DECEMBER'}"  />
        	           			 <s:textfield name="student_year" /></td></tr>
    
    	<tr class="field" align="center"><td>RECOMMEND COLLEGE</td></tr>
        <tr align="center"><td><s:select name="student_recom" list="{'Very Likely','Likely','Unlikely'}"/></td></tr>
    
    	<tr class="field" align="center"><td>DATA</td></tr>
        <tr align="center"><td><s:textfield name="data" id='data' /></td></tr>
      
    	<tr class="field" align="center"><td>ANY COMMENTS</td></tr>
    	<tr align="center"><td><s:textarea name="student_comments" rows="8" cols="50"/></td></tr>
    
    	<tr></tr>
    	<tr align="center"><td><s:reset name="reset" value="RESET"/>
        <s:submit name="submit" value="SUBMIT" onClick="return validate();"/></td></tr>
 
    </s:form>
  </table> 
 </div>
</div>
<div class="err" style="display:none"></div>
 
</body> 
<div class="logo">
  	<a href="https://www2.gmu.edu/" target="_blank"><img src="Images/GMU_logo.jpg"></a>
</div>
</html>
