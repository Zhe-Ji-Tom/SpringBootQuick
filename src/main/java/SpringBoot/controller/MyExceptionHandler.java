package SpringBoot.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import SpringBoot.exception.UserNotExistException;

@ControllerAdvice
public class MyExceptionHandler {
	
//	@ResponseBody
//	@ExceptionHandler(UserNotExistException.class) 
//	public Map<String, Object> handlerException(Exception e) {
//		
//		Map<String, Object> map = new HashMap<>();
//		
//		map.put("code", "user.notexist");
//		map.put("message", e.getMessage());
//		
//		return map;
//	}
	
	@ExceptionHandler(UserNotExistException.class) 
	public String handlerException(Exception e, HttpServletRequest request) {
		
		Map<String, Object> map = new HashMap<>();
		
		request.setAttribute("javax.servlet.error.status_code", 500);
		
		map.put("code", "user.notexist");
		map.put("message", e.getMessage());
		
		return "forward:/error";
	}
}
