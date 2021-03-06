/*
 * This file is generated by jOOQ.
*/
package app.database.h2;


import app.database.h2.tables.Author;
import app.database.h2.tables.Book;
import app.database.h2.tables.BookStore;
import app.database.h2.tables.BookToBookStore;
import app.database.h2.tables.Item;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>PUBLIC.ITEM</code>.
     */
    public static final Item ITEM = app.database.h2.tables.Item.ITEM;

    /**
     * The table <code>PUBLIC.AUTHOR</code>.
     */
    public static final Author AUTHOR = app.database.h2.tables.Author.AUTHOR;

    /**
     * The table <code>PUBLIC.BOOK</code>.
     */
    public static final Book BOOK = app.database.h2.tables.Book.BOOK;

    /**
     * The table <code>PUBLIC.BOOK_STORE</code>.
     */
    public static final BookStore BOOK_STORE = app.database.h2.tables.BookStore.BOOK_STORE;

    /**
     * The table <code>PUBLIC.BOOK_TO_BOOK_STORE</code>.
     */
    public static final BookToBookStore BOOK_TO_BOOK_STORE = app.database.h2.tables.BookToBookStore.BOOK_TO_BOOK_STORE;
}
