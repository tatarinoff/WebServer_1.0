<%@ page import="org.tatarinoff.entity.Book" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: k-labs
  Date: 08.11.2015
  Time: 10:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>TS-labs webserv</title>
    <link rel="stylesheet" href="css/books.css">
</head>
<body>
<h1>Books result set</h1>

<h2>Now we have such books, which are equal to your querry</h2>
<table width="650" cellpadding="5" cellspacing="0">
    <thead>
    <tr>
        <td class="col1">#id</td>
        <td class="col2">Title</td>
        <td class="col3">Author</td>
    </tr>
    </thead>
    <tbody>
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
</body>
</html>