 package SpringBoot.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
	
	@ResponseBody
	@RequestMapping("/hello")
	public String helloController() {
		return "Hello World Quick!";
	}
	
	@RequestMapping("/success")
	public String success(Map<String, Object> map) {
		map.put("hello", "你好");
		map.put("users", Arrays.asList("zhangsan", "lisi", "wangwu")); 
		return "success";
	}
}
