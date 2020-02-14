package SpringBoot.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginHandlerInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		Object user = request.getSession().getAttribute("loginUser");
		if(user == null) {
			request.setAttribute("msg", "没有权限请登录");
			request.getRequestDispatcher("/index.html").forward(request, response);
			return false;
		} else {
			return true;
		}
	}
	
}
