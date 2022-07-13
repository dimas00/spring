<%--
  Created by IntelliJ IDEA.
  User: Aluno
  Date: 08/07/2022
  Time: 16:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Adicionar Livros</title>
</head>
<body>

<c:if test="${addSucesso}">

  <h2>Livro ${livroSalvo.nome} adicionado! </h2>

  </c:if>

<form:form method="post" action="/app/livro/adicionar" modelAttribute="livro">

  <form:label path="id">id</form:label>
  <form:input path="id"  type="text"></form:input>

  <form:label path="nome">nome</form:label>
  <form:input path="nome"  type="text"></form:input>

  <form:label path="autor">nome</form:label>
  <form:input path="autor"  type="text"></form:input>

  <input type="submit" value="CADASTRAR">


</form:form>

<c:if test="${addSucesso}">

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

</c:if>


</body>
</html>
