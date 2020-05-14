package com.ecart.item.pojos;

public class ItemAttribute
{
    private Integer itemAttributeId;
    private Integer itemId;
    private String itemAttribute1;
    private String itemAttribute2;
    private String itemAttribute3;
    private String itemAttribute4;
    private String itemAttribute5;
    private String itemDescription;
    private String countryOfOrigin;
    private String inventoryType;

    public ItemAttribute(Integer itemAttributeId,Integer itemId, String itemAttribute1, String itemAttribute2, String itemAttribute3, String itemAttribute4, String itemAttribute5, String itemDescription, String countryOfOrigin, String inventoryType) {
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
        return "ItemAttribute{" +
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
