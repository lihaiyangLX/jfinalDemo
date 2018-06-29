package bean.base;

import java.util.Date;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

import bean.base.BaseField.Field;

/**
 * jfinal
 * @author LHY
 * @date 2018年6月28日
 */
public abstract class IdEntity<M extends IdEntity<M>> extends Model<M> implements IBean {

	private static final long serialVersionUID = Long.MAX_VALUE;

	public IdEntity<M> setId(Long id) {

		set(Field.ID.key(), id);
		return this;
	}

	public Long getId() {

		return getLong(Field.ID.key());
	}

	public IdEntity<M> setCreateDate() {

		set(Field.CREATE_DATE.key(), new Date());
		return this;
	}

	public Date getCreateDate() {

		return getDate(Field.CREATE_DATE.key());
	}

	public IdEntity<M> setUpdateDate() {

		set(Field.UPDATE_DATE.key(), new Date());
		return this;
	}

	public Date getUpdateDate() {

		return getDate(Field.UPDATE_DATE.key());
	}
}