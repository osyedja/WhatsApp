package com.example.snapgroup7.whatsosyedapp;

public class ContactNames {

    private String contactGrOrPer;
    private String senderName;
    private String lastMassage;
    private String imageUrl;


    public ContactNames(String contactGrOrPer, String senderName, String imageUrl, String lastMassage) {
        this.contactGrOrPer = contactGrOrPer;
        this.senderName = senderName;
        this.imageUrl = imageUrl;
        this.lastMassage = lastMassage;
    }


    public String getContactGrOrPer() {
        return contactGrOrPer;
    }

    public void setContactGrOrPer(String contactGrOrPer) {
        this.contactGrOrPer = contactGrOrPer;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getLastMassage() {
        return lastMassage;
    }

    public void setLastMassage(String lastMassage) {
        this.lastMassage = lastMassage;
    }
}
