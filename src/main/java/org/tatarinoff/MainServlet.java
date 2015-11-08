package org.tatarinoff;

import org.tatarinoff.DAO.Factory;
import org.tatarinoff.entity.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainServlet extends HttpServlet {

    private static List bookList = new ArrayList<Book>();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            //Factory.getInstance().getBookDAO().addBook(b1);
            //Factory.getInstance().getBookDAO().addBook(b2);
            bookList = Factory.getInstance().getBookDAO().getAllBooks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        HttpSession session = req.getSession();
        session.setAttribute("bookList", bookList);
        RequestDispatcher reqDisp = getServletContext().getRequestDispatcher("/result.jsp");
        reqDisp.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Book b1 = new Book("Alice in WonderLand","Lewis Carrol");
        //Book b2 = new Book("Physics for newbs", "Issac Newton");

        try {
            //Factory.getInstance().getBookDAO().addBook(b1);
            //Factory.getInstance().getBookDAO().addBook(b2);
            bookList = Factory.getInstance().getBookDAO().getAllBooks();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        HttpSession session = req.getSession();
        session.setAttribute("bookList", bookList);
        RequestDispatcher reqDisp = getServletContext().getRequestDispatcher("/index.jsp");
        reqDisp.forward(req, resp);
    }
}
