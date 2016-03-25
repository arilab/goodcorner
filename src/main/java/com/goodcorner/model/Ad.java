package com.goodcorner.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created by alainlay1 on 25/03/16.
 */
public class Ad implements Serializable {
    private static final long serialVersionUID = -7788619177798333712L;

    private int id;
    private String title;
    private String description;
    private BigDecimal price;
    private LocalDate creationDate;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ad ad = (Ad) o;

        if (id != ad.id) return false;
        if (title != null ? !title.equals(ad.title) : ad.title != null) return false;
        if (description != null ? !description.equals(ad.description) : ad.description != null)
            return false;
        if (price != null ? !price.equals(ad.price) : ad.price != null) return false;
        if (creationDate != null ? !creationDate.equals(ad.creationDate) : ad.creationDate != null)
            return false;
        if (name != null ? !name.equals(ad.name) : ad.name != null) return false;
        if (email != null ? !email.equals(ad.email) : ad.email != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (creationDate != null ? creationDate.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }
}
