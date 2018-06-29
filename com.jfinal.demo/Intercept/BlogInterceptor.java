package Intercept;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;

/**
 * jfinal
 * @author LHY
 * @date 2018年6月28日
 */
public class BlogInterceptor implements Interceptor {

	/* (non-Javadoc)
	 * @see com.jfinal.aop.Interceptor#intercept(com.jfinal.aop.Invocation)
	 */
	public void intercept(Invocation inv) {
		System.out.println("before invoking " + inv.getActionKey());
		inv.invoke();
		System.out.println("after invoking " + inv.getActionKey());
	}
}