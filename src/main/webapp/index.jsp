<%@ page import="org.tatarinoff.entity.Book" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>TS-labs webserv</title>
    <link rel="stylesheet" href="css/books.css">
</head>
<body>
<h1>Maven + Hibernate + MySQL</h1>
<table width="650" cellpadding="5" cellspacing="0">
    <thead>
    <tr><h2>Now we have such books</h2></tr>
    <tr>
        <td class="col1">#id</td>
        <td class="col2">Title</td>
        <td class="col3">Author</td>
    </tr>
    </thead>
    <tbody>
    <%--<% try {--%>
    <%--for (Object book : BookDAO.BOOKS_DAO_INST.getAllBooks()) {%>--%>
    <% for (Object book : (List) session.getAttribute("bookList")) {%>
    <tr>
        <td class="col1"><%=((Book) book).getBookId()%>
        </td>
        <td class="col2"><%=((Book) book).getTitle()%>
        </td>
        <td class="col3"><%=((Book) book).getAuthor()%>
        </td>
    </tr>
    <%}%>
    </tbody>
</table>

<h2>Find book by title</h2>

<form action="uri" method="post">
    Title: <input type="text" name="title"/>
    <br/>
    <%--Author: <input type="text" name="author" />--%>
    <input type="submit" value="Submit"/>
</form>
</body>
</html>
