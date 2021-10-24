package com.rawchen.multitablejoin.service;

import com.rawchen.multitablejoin.entity.vo.BlogDetail;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author RawChen
 * @since 2021-10-22
 */
public interface BlogService {
	List<BlogDetail> selectAllBlogs();

}
