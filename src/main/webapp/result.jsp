<%@ page import="org.tatarinoff.DAO.BookDAO" %>
<%@ page import="org.tatarinoff.entity.Book" %>
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
<table width="650" cellpadding="5" cellspacing="0">
    <thead>
    <tr><h2>Now we have such books, equal you querry</h2></tr>
    <tr>
        <td class="col1">#id</td>
        <td class="col2">Title</td>
        <td class="col3">Author</td>
    </tr>
    </thead>
    <tbody>
    <% try {
        for (Object book : BookDAO.BOOKS_DAO_INST.getBookByTitle(request.getParameter("title"))) {%>
    <tr>
        <td class="col1"><%=((Book) book).getBookId()%>
        </td>
        <td class="col2"><%=((Book) book).getTitle()%>
        </td>
        <td class="col3"><%=((Book) book).getAuthor()%>
        </td>
    </tr>
    <%
            }
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    %>
    </tbody>
</table>
</body>
</html>
