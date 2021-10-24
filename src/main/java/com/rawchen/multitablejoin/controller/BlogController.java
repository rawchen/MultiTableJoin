package com.rawchen.multitablejoin.controller;


import com.rawchen.multitablejoin.entity.dto.Result;
import com.rawchen.multitablejoin.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author RawChen
 * @since 2021-10-22
 */
@Controller
public class BlogController {

	@Autowired
	BlogService service;

	@ResponseBody
	@GetMapping("/blogs")
	public Result selectAllBlogs() {
		return Result.ok(service.selectAllBlogs());
	}

}
