package service;

import com.jfinal.aop.Before;
import com.jfinal.plugin.activerecord.Page;

import Validator.BlogValidator;
import bean.Blog;

/**
 * BlogService.java
 * @author LiHaiyang
 * 2018年6月29日
 */
public class BlogService {

	public static final BlogService me = new BlogService();

	private Blog dao = new Blog().dao();

	public Page<Blog> list(int pageNumber, int pageSize) {

		return dao.paginate(pageNumber, pageSize, "select *", "from blog order by id asc");
	}

	@Before(BlogValidator.class)
	public void update(Blog blog) {

		blog.update();
	}

	@Before(BlogValidator.class)
	public void save(Blog blog) {

		blog.save();
	}

	public Blog findById(Long id) {

		return dao.findById(id);
	}

	public void delete(Long id) {

		dao.deleteById(id);
	}
}