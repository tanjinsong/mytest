package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot启动类(入口)
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年9月4日 下午3:19:46
 * @version 1.0
 */
@SpringBootApplication( // 代表是SpringBoot的启动类
		scanBasePackages={"cn.itcast.springboot"}) // 扫描的基础包
public class Application {
	
	public static void main(String[] args) {
		
		/** 第二种方式： 运行SpringBoot的应用 (关闭Banner横幅) */
		SpringApplication springApplication = new SpringApplication(Application.class);
		/** 设置Banner横幅为关闭模式 */
		springApplication.setBannerMode(Mode.OFF);
		/** 运行 */
		springApplication.run(args);
	}
}