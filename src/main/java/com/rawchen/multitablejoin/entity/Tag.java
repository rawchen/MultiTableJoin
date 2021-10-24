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
public class Tag implements Serializable {

    private Integer id;

    private String tagName;

    private Integer tagCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    public Integer getTagCount() {
        return tagCount;
    }

    public void setTagCount(Integer tagCount) {
        this.tagCount = tagCount;
    }

    @Override
    public String toString() {
        return "Tag{" +
            "id=" + id +
            ", tagName=" + tagName +
            ", tagCount=" + tagCount +
        "}";
    }
}
