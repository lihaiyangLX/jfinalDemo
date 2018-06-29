package Validator;

import com.jfinal.core.Controller;
import com.jfinal.validate.Validator;

import bean.Blog;

/**
 * jfinal
 * @author LHY
 * @date 2018年6月28日
 */
public class BlogValidator extends Validator {

	/* (non-Javadoc)
	 * @see com.jfinal.validate.Validator#handleError(com.jfinal.core.Controller)
	 */
	@Override
	protected void handleError(Controller controller) {
		validateRequiredString("blog.title", "titleMsg", "请填写blog标题!");
		validateRequiredString("blog.content", "contentMsg", "请填写blog内容!");
	}

	/* (non-Javadoc)
	 * @see com.jfinal.validate.Validator#validate(com.jfinal.core.Controller)
	 */
	@Override
	protected void validate(Controller contrller) {
		// TODO Auto-generated method stub
		controller.keepModel(Blog.class);
	}
}