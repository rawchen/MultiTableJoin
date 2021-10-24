package com.rawchen.multitablejoin.entity.vo;

import com.rawchen.multitablejoin.entity.Category;
import com.rawchen.multitablejoin.entity.Tag;

import java.io.Serializable;
import java.util.List;

/**
 * @author RawChen
 * @since 2021-10-23 0:01
 */
public class BlogDetail implements Serializable {

	private Integer id;
	private String title;
	private String content;//文章正文
	private String description;
	private Integer views;//浏览次数

	private Category category;//文章分类
	private List<Tag> tags;//文章标签

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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public List<Tag> getTags() {
		return tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}

	@Override
	public String toString() {
		return "BlogDetail{" +
				"id=" + id +
				", title='" + title + '\'' +
				", content='" + content + '\'' +
				", description='" + description + '\'' +
				", views=" + views +
				", category=" + category +
				", tags=" + tags +
				'}';
	}
}
