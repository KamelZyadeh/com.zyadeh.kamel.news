package com.zyadeh.kamel.entities;

import java.time.LocalDate;
import java.util.Objects;


public class News extends Entity {

    private String fullText;
    private String shortText;
    private String title;
    private LocalDate publishedIn;
    private LocalDate createdIn;
    private Author author;

    public String getFullText() {
        return fullText;
    }
    public void setFullText(String fullText) {
        this.fullText = fullText;
    }

    public String getShortText() {
        return shortText;
    }
    public void setShortText(String shortText) {
        this.shortText = shortText;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getPublishedIn() {
        return publishedIn;
    }
    public void setPublishedIn(LocalDate publishedIn) {
        this.publishedIn = publishedIn;
    }

    public LocalDate getCreatedIn() {
        return createdIn;
    }
    public void setCreatedIn(LocalDate createdIn) {
        this.createdIn = createdIn;
    }

    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        News news = (News) o;
        return Objects.equals(fullText, news.fullText) &&
                Objects.equals(shortText, news.shortText) &&
                Objects.equals(title, news.title) &&
                Objects.equals(publishedIn, news.publishedIn) &&
                Objects.equals(createdIn, news.createdIn) &&
                Objects.equals(author, news.author);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), fullText, shortText, title, publishedIn, createdIn, author);
    }
}
