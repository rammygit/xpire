/*
 * This file is generated by jOOQ.
*/
package app.database.h2.tables.pojos;


import java.io.Serializable;
import java.sql.Timestamp;

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
public class Item implements Serializable {

    private static final long serialVersionUID = 1493582148;

    private Integer   id;
    private String    name;
    private String    description;
    private String    storeinfo;
    private Timestamp purchasedon;
    private Timestamp bestby;

    public Item() {}

    public Item(Item value) {
        this.id = value.id;
        this.name = value.name;
        this.description = value.description;
        this.storeinfo = value.storeinfo;
        this.purchasedon = value.purchasedon;
        this.bestby = value.bestby;
    }

    public Item(
        Integer   id,
        String    name,
        String    description,
        String    storeinfo,
        Timestamp purchasedon,
        Timestamp bestby
    ) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.storeinfo = storeinfo;
        this.purchasedon = purchasedon;
        this.bestby = bestby;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStoreinfo() {
        return this.storeinfo;
    }

    public void setStoreinfo(String storeinfo) {
        this.storeinfo = storeinfo;
    }

    public Timestamp getPurchasedon() {
        return this.purchasedon;
    }

    public void setPurchasedon(Timestamp purchasedon) {
        this.purchasedon = purchasedon;
    }

    public Timestamp getBestby() {
        return this.bestby;
    }

    public void setBestby(Timestamp bestby) {
        this.bestby = bestby;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Item (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(description);
        sb.append(", ").append(storeinfo);
        sb.append(", ").append(purchasedon);
        sb.append(", ").append(bestby);

        sb.append(")");
        return sb.toString();
    }
}
