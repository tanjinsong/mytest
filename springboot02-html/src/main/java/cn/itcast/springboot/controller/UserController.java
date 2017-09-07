package cn.itcast.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * UserController
 * @author LEE.SIU.WAH
 * @email lixiaohua7@163.com
 * @date 2017年9月4日 下午4:47:43
 * @version 1.0
 */
@Controller
public class UserController {
	
	@GetMapping("/user")
	public String user(){
		return "/html/user.html";
	}
}
