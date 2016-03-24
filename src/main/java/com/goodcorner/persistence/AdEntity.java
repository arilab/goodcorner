package com.goodcorner.persistence;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by alainlay1 on 23/03/16.
 */
@Entity
@Table(name = "ad", schema = "", catalog = "thegoodcorner")
public class AdEntity {
    private int id;
    private String title;
    private String description;
    private BigDecimal price;
    private Date creationDate;
    private String name;
    private String email;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "creation_date")
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email")
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

        AdEntity adEntity = (AdEntity) o;

        if (id != adEntity.id) return false;
        if (title != null ? !title.equals(adEntity.title) : adEntity.title != null) return false;
        if (description != null ? !description.equals(adEntity.description) : adEntity.description != null)
            return false;
        if (price != null ? !price.equals(adEntity.price) : adEntity.price != null) return false;
        if (creationDate != null ? !creationDate.equals(adEntity.creationDate) : adEntity.creationDate != null)
            return false;
        if (name != null ? !name.equals(adEntity.name) : adEntity.name != null) return false;
        if (email != null ? !email.equals(adEntity.email) : adEntity.email != null) return false;

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
