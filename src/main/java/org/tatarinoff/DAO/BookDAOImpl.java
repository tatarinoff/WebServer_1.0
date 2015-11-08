package org.tatarinoff.DAO;

import org.hibernate.Session;
import org.tatarinoff.entity.Book;
import org.tatarinoff.util.HibernateUtil;

import javax.swing.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookDAOImpl implements BookDAO {

    @Override
    public List getBookByTitle(String title) throws SQLException {
        Session session = null;
        List books = new ArrayList<Book>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            books = session.createCriteria(Book.class).list();
            int size = books.size();
            for (int i = 0; i < size; i++) {
                if (!((Book) books.get(i)).getTitle().contains(title)) {
//                if (!((Book) books.get(i)).getTitle().equals(title)) {
                    books.remove(i);
                    size--;
                    i--;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return books;
    }

    @Override
    public List getAllBooks() throws SQLException {
        Session session = null;
        List books = new ArrayList<Book>();
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            books = session.createCriteria(Book.class).list();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка I/O", JOptionPane.ERROR_MESSAGE);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return books;
    }

}
