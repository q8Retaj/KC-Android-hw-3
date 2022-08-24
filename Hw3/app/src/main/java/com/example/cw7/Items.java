package com.example.cw7;

import java.io.Serializable;

public class Items implements Serializable {
   private String itemName;
   private int itemImg;
   private double itemPrice;
   private String itemDetails;

   public Items(String itemName, int itemImg, double itemPrice, String itemDetails) {
      this.itemName = itemName;
      this.itemImg = itemImg;
      this.itemPrice = itemPrice;
      this.itemDetails = itemDetails;
   }

   public String getItemName() {
      return itemName;
   }

   public void setItemName(String itemName) {
      this.itemName = itemName;
   }

   public int getItemImg() {
      return itemImg;
   }

   public void setItemImg(int itemImg) {
      this.itemImg = itemImg;
   }

   public double getItemPrice() {
      return itemPrice;
   }

   public void setItemPrice(double itemPrice) {
      this.itemPrice = itemPrice;
   }

   public String getItemDetails() {
      return itemDetails;
   }

   public void setItemDetails(String itemDetails) {
      this.itemDetails = itemDetails;
   }
}
