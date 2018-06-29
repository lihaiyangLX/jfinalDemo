/**
 * 
 */
package controller;

import com.jfinal.aop.Before;
import com.jfinal.core.Controller;

import Intercept.BlogInterceptor;
import Validator.BlogValidator;
import bean.Blog;

/**
 * jfinal
 * @author LHY
 * @date 2018年6月28日
 */
@Before(BlogInterceptor.class)
public class BlogController extends Controller {

  public void index() {
    setAttr("blogList", new Blog().dao().find("select * from blog"));
//	    setAttr("blogList", Blog.FILTER_BY_UPDATE..find("select * from blog"));
  }
 
  public void add() {
  }
 
  @Before(BlogValidator.class)
  public void save() {
    getModel(Blog.class).save();
  }
 
  public void edit() {
    setAttr("blog", new Blog().dao().findById(getParaToInt()));
  }
 
  @Before(BlogValidator.class)
  public void update() {
    getModel(Blog.class).update();
  }
 
  public void delete() {
	  new Blog().dao().deleteById(getParaToInt());
  }
}