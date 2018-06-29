/**
 * 
 */
package bean;

import bean.base.BaseField.Field;
import bean.base.UuidRemovable;

/**
 * jfinal
 * @author LHY
 * @date 2018年6月28日
 */
public class Blog extends UuidRemovable<Blog> {

	public Blog setTitle(String title) {

		set(Field.TITLE.key(), title);
		return this;
	}

	public String getTitle() {

		return getStr(Field.TITLE.key());
	}

	public Blog setContent(String content) {

		set(Field.CONTENT.key(), content);
		return this;
	}

	public String getContent() {

		return getStr(Field.CONTENT.key());
	}
}