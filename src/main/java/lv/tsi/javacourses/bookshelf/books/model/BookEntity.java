package lv.tsi.javacourses.bookshelf.books.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class BookEntity implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "title", length = 200, unique = true , nullable = false)
    private String title;
    @Column(name = "isbn",length = 50, unique = true , nullable = false)
    private String isbn;
    @Column(name = "author",length = 200, unique = true , nullable = false)
    private String author;
    @Column(name = "year", unique = true , nullable = false)
    private int year;
    @Column(name ="description",length = 1000)
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getSear() {
        return year;
    }

    public void setSear(int sear) {
       this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
