<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>
<body>

<h1>Aggiungi un cliente:</h1>


<form action="<%= request.getContextPath() + "/aggiungi" %>" method="post">
    <input type="text" name="nome" value="" placeholder="Nome">
    <input type="text" name="cognome" value="" placeholder="Cognome">
    <input type="number" name="eta" value="" placeholder="Eta">
    <button type="submit">Aggiungi</button>
</form>

</body>
</html>