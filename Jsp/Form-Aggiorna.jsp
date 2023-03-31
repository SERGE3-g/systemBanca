<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<form action="<%= request.getContextPath() + "/aggiorna" %>" method="post">

    <input type="text" name="nome" value="${cliente.getNome()}" />
    <input type="text" name="cognome" value="${cliente.getCognome()}" />
    <input type="number" name="eta" value="${cliente.getEta()}" />
    <input type="hidden" name="id" value="${cliente.getId()}"/>
    <button type="submit">Aggiorna</button>
</form>
</body>
</html>