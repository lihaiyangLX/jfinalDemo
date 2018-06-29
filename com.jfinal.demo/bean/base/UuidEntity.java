package bean.base;

import java.util.UUID;

import org.apache.commons.lang.StringUtils;

import bean.base.BaseField.Field;

/**
 * jfinal
 * @author LHY
 * @date 2018年6月28日
 */
public abstract class UuidEntity<M extends UuidEntity<M>> extends IdEntity<M> {

	private static final long serialVersionUID = Long.MAX_VALUE;

	public UuidEntity<M> setUuid() {

		set(Field.UUID.key(), getRandomUuid());
		return this;
	}

	private String getRandomUuid() {

		return StringUtils.remove(UUID.randomUUID().toString(), "-");
	}
}