package com.ecart.item.entities;

import javax.persistence.*;

@Entity
@Table(name = "item_attribute")
public class ItemAttributeEntity
{
    @Id
    @GeneratedValue
    @Column(name = "itemAttributedId")
    private Integer itemAttributeId;

    @Column(name = "itemId")
    private Integer itemId;

    @Column(name = "itemattribute1")
    private String itemAttribute1;

    @Column(name = "itemattribute2")
    private String itemAttribute2;

    @Column(name = "itemattribute3")
    private String itemAttribute3;

    @Column(name = "itemattribute4")
    private String itemAttribute4;

    @Column(name = "itemattribute5")
    private String itemAttribute5;

    @Column(name = "itemDescription")
    private String itemDescription;

    @Column(name = "countryOfOrigin")
    private String countryOfOrigin;

    @Column(name = "inventoryType")
    private String inventoryType;

    public ItemAttributeEntity(Integer itemAttributeId, Integer itemId, String itemAttribute1, String itemAttribute2, String itemAttribute3, String itemAttribute4, String itemAttribute5, String itemDescription, String countryOfOrigin, String inventoryType) {
        this.itemAttributeId = itemAttributeId;
        this.itemId = itemId;
        this.itemAttribute1 = itemAttribute1;
        this.itemAttribute2 = itemAttribute2;
        this.itemAttribute3 = itemAttribute3;
        this.itemAttribute4 = itemAttribute4;
        this.itemAttribute5 = itemAttribute5;
        this.itemDescription = itemDescription;
        this.countryOfOrigin = countryOfOrigin;
        this.inventoryType = inventoryType;
    }

    public Integer getItemAttributeId() {
        return itemAttributeId;
    }

    public void setItemAttributeId(Integer itemAttributeId) {
        this.itemAttributeId = itemAttributeId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemAttribute1() {
        return itemAttribute1;
    }

    public void setItemAttribute1(String itemAttribute1) {
        this.itemAttribute1 = itemAttribute1;
    }

    public String getItemAttribute2() {
        return itemAttribute2;
    }

    public void setItemAttribute2(String itemAttribute2) {
        this.itemAttribute2 = itemAttribute2;
    }

    public String getItemAttribute3() {
        return itemAttribute3;
    }

    public void setItemAttribute3(String itemAttribute3) {
        this.itemAttribute3 = itemAttribute3;
    }

    public String getItemAttribute4() {
        return itemAttribute4;
    }

    public void setItemAttribute4(String itemAttribute4) {
        this.itemAttribute4 = itemAttribute4;
    }

    public String getItemAttribute5() {
        return itemAttribute5;
    }

    public void setItemAttribute5(String itemAttribute5) {
        this.itemAttribute5 = itemAttribute5;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    @Override
    public String toString() {
        return "ItemAttributeEntity{" +
                "itemAttributeId=" + itemAttributeId +
                ", itemId=" + itemId +
                ", itemAttribute1='" + itemAttribute1 + '\'' +
                ", itemAttribute2='" + itemAttribute2 + '\'' +
                ", itemAttribute3='" + itemAttribute3 + '\'' +
                ", itemAttribute4='" + itemAttribute4 + '\'' +
                ", itemAttribute5='" + itemAttribute5 + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
                ", countryOfOrigin='" + countryOfOrigin + '\'' +
                ", inventoryType='" + inventoryType + '\'' +
                '}';
    }
}
