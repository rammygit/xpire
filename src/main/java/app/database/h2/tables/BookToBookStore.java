/*
 * This file is generated by jOOQ.
*/
package app.database.h2.tables;


import app.database.h2.Keys;
import app.database.h2.Public;
import app.database.h2.tables.records.BookToBookStoreRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BookToBookStore extends TableImpl<BookToBookStoreRecord> {

    private static final long serialVersionUID = -762314735;

    /**
     * The reference instance of <code>PUBLIC.BOOK_TO_BOOK_STORE</code>
     */
    public static final BookToBookStore BOOK_TO_BOOK_STORE = new BookToBookStore();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BookToBookStoreRecord> getRecordType() {
        return BookToBookStoreRecord.class;
    }

    /**
     * The column <code>PUBLIC.BOOK_TO_BOOK_STORE.BOOK_STORE_NAME</code>.
     */
    public final TableField<BookToBookStoreRecord, String> BOOK_STORE_NAME = createField("BOOK_STORE_NAME", org.jooq.impl.SQLDataType.VARCHAR.length(400).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BOOK_TO_BOOK_STORE.BOOK_ID</code>.
     */
    public final TableField<BookToBookStoreRecord, Integer> BOOK_ID = createField("BOOK_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BOOK_TO_BOOK_STORE.STOCK</code>.
     */
    public final TableField<BookToBookStoreRecord, Integer> STOCK = createField("STOCK", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * Create a <code>PUBLIC.BOOK_TO_BOOK_STORE</code> table reference
     */
    public BookToBookStore() {
        this("BOOK_TO_BOOK_STORE", null);
    }

    /**
     * Create an aliased <code>PUBLIC.BOOK_TO_BOOK_STORE</code> table reference
     */
    public BookToBookStore(String alias) {
        this(alias, BOOK_TO_BOOK_STORE);
    }

    private BookToBookStore(String alias, Table<BookToBookStoreRecord> aliased) {
        this(alias, aliased, null);
    }

    private BookToBookStore(String alias, Table<BookToBookStoreRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<BookToBookStoreRecord> getPrimaryKey() {
        return Keys.PK_B2BS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<BookToBookStoreRecord>> getKeys() {
        return Arrays.<UniqueKey<BookToBookStoreRecord>>asList(Keys.PK_B2BS);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<BookToBookStoreRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BookToBookStoreRecord, ?>>asList(Keys.FK_B2BS_BS_NAME, Keys.FK_B2BS_B_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public BookToBookStore as(String alias) {
        return new BookToBookStore(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BookToBookStore rename(String name) {
        return new BookToBookStore(name, null);
    }
}
