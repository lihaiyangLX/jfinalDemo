package bean.base;

/**
 * 基础字段枚举
 * @author LHY
 * @date 2018年6月28日
 */
public class BaseField {

	public static enum Field {

		UUID("uuid"),
		ID("id"),
		NAME("name"),
		TITLE("title"),
		CREATE_DATE("name"),
		REMOVED("removed"),
		UPDATE_DATE("updateDate"),
		CONTENT("content");

		private String key;

		Field(String key) {

			this.key = key;
		}
		/**
		 * @return the key
		 */
		public String key() {
			return key;
		}
	}
}