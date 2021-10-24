package com.rawchen.multitablejoin.mapper;

import com.rawchen.multitablejoin.entity.vo.BlogDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author RawChen
 * @since 2021-10-22
 */
@Mapper
public interface BlogMapper {
	List<BlogDetail> selectAllBlogs();

}
