package com.example.myapplication.Model;


public class Data {

    private String id;
    private String title;
    private String date;
    private String note;

    public Data() {
    }

    public Data(String id, String title, String date, String note) {
        this.id = id;
        this.title = title;
        this.date = date;
        this.note = note;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
