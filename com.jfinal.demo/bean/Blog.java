package bean;

import javax.persistence.*;

import bean.base.BaseField.Field;
import bean.base.UuidRemovable;

/**
 * jfinal
 * @author LHY
 * @date 2018年6月28日
 */
@Entity
@Table(name = "blog")
public class Blog extends UuidRemovable<Blog> {

	private static final long serialVersionUID = Long.MAX_VALUE;

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