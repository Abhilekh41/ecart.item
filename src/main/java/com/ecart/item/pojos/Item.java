package com.ecart.item.pojos;

public class Item
{
    private Integer itemId;
    private String itemBarcode;
    private String packUOM;
    private Integer packQuantity;
    private ItemAttribute itemAttribute;

    public Item(Integer itemId, String itemBarcode, String packUOM, Integer packQuantity, ItemAttribute itemAttribute) {
        this.itemId = itemId;
        this.itemBarcode = itemBarcode;
        this.packUOM = packUOM;
        this.packQuantity = packQuantity;
        this.itemAttribute = itemAttribute;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemBarcode() {
        return itemBarcode;
    }

    public void setItemBarcode(String itemBarcode) {
        this.itemBarcode = itemBarcode;
    }

    public String getPackUOM() {
        return packUOM;
    }

    public void setPackUOM(String packUOM) {
        this.packUOM = packUOM;
    }

    public Integer getPackQuantity() {
        return packQuantity;
    }

    public void setPackQuantity(Integer packQuantity) {
        this.packQuantity = packQuantity;
    }

    public ItemAttribute getItemAttribute() {
        return itemAttribute;
    }

    public void setItemAttribute(ItemAttribute itemAttribute) {
        this.itemAttribute = itemAttribute;
    }
}
