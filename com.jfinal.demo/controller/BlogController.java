package controller;

import service.BlogService;
import Intercept.BlogInterceptor;
import bean.Blog;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

/**
 * jfinal
 * @author LHY
 * @date 2018年6月28日
 */
@Before(BlogInterceptor.class)
public class BlogController extends Controller {

	BlogService service = BlogService.me;

	public void index() {

		setAttr("blogPage", service.list(getParaToInt(0, 1), 10));
		render("blog.html");
	}

	public void save() {
	
		service.save(getBean(Blog.class));
		redirect("/blog");
	}
 
	public void edit() {

		setAttr("blog", service.findById(getParaToLong()));
	}

	public void update() {

		getModel(Blog.class).update();
		redirect("/blog");
	}
 
	public void delete() {

		service.delete(getParaToLong());
		redirect("/blog");
	}
}