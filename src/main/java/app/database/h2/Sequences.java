/*
 * This file is generated by jOOQ.
*/
package app.database.h2;


import javax.annotation.Generated;

import org.jooq.Sequence;
import org.jooq.impl.SequenceImpl;


/**
 * Convenience access to all sequences in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Sequences {

    /**
     * The sequence <code>PUBLIC.SYSTEM_SEQUENCE_FDA3C88B_2DC0_43D6_A226_E9B982551EE6</code>
     */
    public static final Sequence<Long> SYSTEM_SEQUENCE_FDA3C88B_2DC0_43D6_A226_E9B982551EE6 = new SequenceImpl<Long>("SYSTEM_SEQUENCE_FDA3C88B_2DC0_43D6_A226_E9B982551EE6", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);

    /**
     * The sequence <code>PUBLIC.S_AUTHOR_ID</code>
     */
    public static final Sequence<Long> S_AUTHOR_ID = new SequenceImpl<Long>("S_AUTHOR_ID", Public.PUBLIC, org.jooq.impl.SQLDataType.BIGINT);
}
