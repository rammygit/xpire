/*
 * This file is generated by jOOQ.
*/
package app.database.h2.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class BookStore implements Serializable {

    private static final long serialVersionUID = 1413168009;

    private String name;

    public BookStore() {}

    public BookStore(BookStore value) {
        this.name = value.name;
    }

    public BookStore(
        String name
    ) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BookStore (");

        sb.append(name);

        sb.append(")");
        return sb.toString();
    }
}
