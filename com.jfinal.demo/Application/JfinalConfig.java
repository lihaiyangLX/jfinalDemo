/**
 * 
 */
package Application;

import com.jfinal.core.JFinal;

/**
 * jfinal
 * @author LHY
 * @date 2018年6月28日
 */
public class JfinalConfig {

	public static void main(String[] args) {

		JFinal.start("src/main/webapp", 80, "/", 5);
	}
}