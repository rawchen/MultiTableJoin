package com.rawchen.multitablejoin.service.impl;

import com.rawchen.multitablejoin.entity.vo.BlogDetail;
import com.rawchen.multitablejoin.mapper.BlogMapper;
import com.rawchen.multitablejoin.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author RawChen
 * @since 2021-10-22
 */
@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogMapper mapper;

	@Override
	public List<BlogDetail> selectAllBlogs() {
		return mapper.selectAllBlogs();
	}
}
