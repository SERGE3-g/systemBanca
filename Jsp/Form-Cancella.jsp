<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>

    <style type="text/css">

        section {
            display: flex;
            flex-wrap: wrap;
            justify-content: space-around;
        }

        .persona {
            display: flex;
            flex-direction: column;
            align-items: center;
            padding:2%;
            margin: 3%;
            background-color: pink;
            width: 30%;
        }

        img {
            width: 80%;
        }

        a{
            text-decoration: none;
            background-color: black;
            color: white;
            padding: 2% 5%;
            margin: 1%;
            border-radius: 8px;

        }

        a:hover{
            background-color: white;
            color: black;
        }
    </style>
</head>
<body>

<h1>Benvenuto in Banca 1.0</h1>
<a href='<%= request.getContextPath() + "/aggiungi" %>'>Aggiungi nuovo cliente</a>

<section>
    <c:forEach var="c" items='<%= request.getAttribute("cliente") %>'>
        <div class="cliente">
            <img src="https://upload.wikimedia.org/wikipedia/commons/7/7c/Profile_avatar_placeholder_large.png?20150327203541" alt="profile-pic">
            <p>${c.getId()}</p>
            <p>Nome: ${c.getNome()}</p>
            <p>Cognome: ${c.getCognome()}</p>
            <p>Eta: ${c.getEta()}</p>

            <a href="${pageContext.servletContext.contextPath}/cancella?id=${c.getId()}" >Elimina</a>
            <a href="${pageContext.servletContext.contextPath}/aggiorna?id=${c.getId()}" >Aggiorna</a>
        </div>
    </c:forEach>
</section>

</body>
</html>