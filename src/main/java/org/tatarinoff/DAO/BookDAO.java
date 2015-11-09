package org.tatarinoff.DAO;


import java.sql.SQLException;
import java.util.List;

public interface BookDAO {
    List getBookByTitle(String title) throws SQLException;

    List getAllBooks() throws SQLException;

}