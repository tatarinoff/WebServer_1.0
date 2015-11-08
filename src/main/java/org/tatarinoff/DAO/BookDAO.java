package org.tatarinoff.DAO;


import java.sql.SQLException;
import java.util.List;

public interface BookDAO {
    public List getBookByTitle(String title) throws SQLException;

    public List getAllBooks() throws SQLException;

}