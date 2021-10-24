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
public class Blog implements Serializable {

    private Integer id;

    private String title;

    private String content;

    private String description;

    private Integer views;

    private Integer categoryId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public Integer getViews() {
        return views;
    }

    public void setViews(Integer views) {
        this.views = views;
    }
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Blog{" +
            "id=" + id +
            ", title=" + title +
            ", content=" + content +
            ", description=" + description +
            ", views=" + views +
            ", categoryId=" + categoryId +
        "}";
    }
}
