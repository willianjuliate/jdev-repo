<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ERR!</title>
    </head>
    <body>
        <h1>MENSAGEM DE ERRO, ENTRE EM CONTATO COM A EQUIPE DE SUPORTE DO SISTEMA.</h1>
        <%
            out.print(request.getAttribute("err"));        
        %>
    </body>
</html>
