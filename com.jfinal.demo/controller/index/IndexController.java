package controller.index;

import com.jfinal.core.Controller;

/**
 * IndexController.java
 * @author LiHaiyang
 * 2018年6月29日
 */
public class IndexController extends Controller {

	public void index() {

		render("index.html");
	}
}