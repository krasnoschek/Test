package org.krasnoschek.model;

public class Post extends BaseModel {


    public Post() {
    }

    public Post(String author, String text) {
        this.author = author;
        this.text = text;
    }

    private String author;
    private String text;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
