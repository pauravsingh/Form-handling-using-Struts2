<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>			<!-- PAURAV SURENDRA G01003778-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>THANK YOU</title>
<link rel="stylesheet" href="css/styles.css" type="text/css">
<link rel="stylesheet" href="css/jquery-ui.css" type="text/css">
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/jquery-ui.js" type="text/javascript"></script>
<script src="js/survey.js" type="text/javascript"></script>

							
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
    <div>
    <p>Thank You for your feedback!<br/>
    	Your data has been saved. <br/>
    	
    	Mean = <s:property value="cData.mean"/> <br/>
    	Standard Deviation = <s:property value="cData.deviation"/>
    </p>
     
    <ol>
    <s:iterator status="stat" value="list">
        
    <li><a href="getDetails?student_id=<s:property/>"><s:property/></a></li>
    </s:iterator>
     </ol>
    </div>
</div>
<div class="err" style="display:none"></div>
 
</body> 
<div class="logo">
  	<a href="https://www2.gmu.edu/" target="_blank"><img src="Images/GMU_logo.jpg"></a>
</div>
</html>
