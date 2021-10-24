package com.rawchen.multitablejoin.entity;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author RawChen
 * @since 2021-10-22
 */
public class Category implements Serializable {

    private Integer id;

    private String categoryName;

    private String categorySlug;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public String getCategorySlug() {
        return categorySlug;
    }

    public void setCategorySlug(String categorySlug) {
        this.categorySlug = categorySlug;
    }

    @Override
    public String toString() {
        return "Category{" +
            "id=" + id +
            ", categoryName=" + categoryName +
            ", categorySlug=" + categorySlug +
        "}";
    }
}
