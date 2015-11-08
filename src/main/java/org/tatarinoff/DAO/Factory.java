package org.tatarinoff.DAO;

public class Factory {
    private static BookDAO bookDAO = null;
    private static Factory instance = null;

    public static synchronized Factory getInstance() {
        if (instance == null) {
            instance = new Factory();

        }
        return instance;
    }

    public BookDAO getBookDAO() {
        if (bookDAO == null) {
            bookDAO = new BookDAOImpl();
        }
        return bookDAO;
    }
}
