package bean.base;

import bean.base.BaseField.Field;

/**
 * jfinal
 * @author LHY
 * @date 2018年6月28日
 */
public abstract class UuidRemovable<M extends UuidRemovable<M>> extends UuidEntity<M> {

	private static final long serialVersionUID = Long.MAX_VALUE;

	public UuidRemovable<M> setRemovable(boolean removable) {

		set(Field.REMOVED.key(), removable);
		return this;
	}

	public boolean isRemovable() {

		return getBoolean(Field.REMOVED.key());
	}
}