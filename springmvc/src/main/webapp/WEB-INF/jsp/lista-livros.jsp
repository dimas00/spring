<%--
  Created by IntelliJ IDEA.
  User: Aluno
  Date: 06/07/2022
  Time: 16:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>

    <link href="<c:url value="/css/styles.css"/>" rel="stylesheet" type="text/css" >
    <title>Lista de livros</title>
</head>
<body>
<h1>Lista de livros</h1>
<a href="/app/livro/adicionar" > Add livro  </a>
<table>

    <thead>

    <tr>
        <th>ID</th>
        <th>NOME</th>
        <th> AUTOR </th>
    </tr>

    </thead>
    <tbody>

    <c:forEach items="${livros}" var="livro">

        <tr>
            <td>${livro.id}</td>
            <td>${livro.nome}</td>
            <td>${livro.autor}</td>

        </tr>


    </c:forEach>

    </tbody>

</table>
</body>
</html>
