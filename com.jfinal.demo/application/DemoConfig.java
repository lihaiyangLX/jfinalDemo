package application;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.JFinalConfig;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.core.JFinal;
import com.jfinal.kit.PropKit;
import com.jfinal.kit.StrKit;
import com.jfinal.plugin.activerecord.ActiveRecordPlugin;
import com.jfinal.plugin.druid.DruidPlugin;
import com.jfinal.template.Engine;
import com.jfinal.template.source.ClassPathSourceFactory;

import controller.BlogController;
import controller.index.IndexController;

/**
 * API引导配置
 * @author LHY
 * @date 2018年6月28日
 */
public class DemoConfig extends JFinalConfig {

	public static void main(String[] args) {

		JFinal.start("src/main/webapp", 8088, "/", 5);
	}

	@Override
	public void configConstant(Constants me) {
		PropKit.use("a_little_config.txt");
		me.setDevMode(PropKit.getBoolean("devMode", false));
	}

	@Override
	public void configEngine(Engine me) {

//		me.setDevMode(true);
		me.addSharedFunction("/common/_layout.html");
		me.addSharedFunction("/common/_paginate.html");
	}

	@Override
	public void configHandler(Handlers me) {

	}

	@Override
	public void configInterceptor(Interceptors me) {

	}

	@Override
	public void configPlugin(Plugins me) {

		DruidPlugin dp = new DruidPlugin(PropKit.get("jdbcUrl").trim(), PropKit.get("user").trim(), PropKit.get("password").trim());
		me.add(dp);

		ActiveRecordPlugin arp = new ActiveRecordPlugin(dp);
		Engine engine = arp.getEngine();
		// 上面的代码获取到了用于 sql 管理功能的 Engine 对象，接着就可以开始配置了
		engine.setSourceFactory(new ClassPathSourceFactory());
		engine.addSharedMethod(new StrKit());
		me.add(arp);

	}

	@Override
	public void configRoute(Routes me) {

		me.add("/", IndexController.class, "/index");
		me.add("/blog", BlogController.class);
	}
}