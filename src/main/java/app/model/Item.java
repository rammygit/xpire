package app.model;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Created by ramkumarsundarajan on 5/5/17.
 * @Data is used from project Lombok.
 * represents item information
 */
@Data
public class Item {

    private int id;
    private String name;
    private String description;
    private LocalDateTime bestByDate;
    private String storeInfo;
    private LocalDateTime purchasedBy;

}
