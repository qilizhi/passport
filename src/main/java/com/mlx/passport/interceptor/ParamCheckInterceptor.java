package com.mlx.passport.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/**
 * 拦截器处理
 * @author chenfh 2016年4月11日 上午10:08:11
 */
public class ParamCheckInterceptor extends HandlerInterceptorAdapter {

	private static Logger log = LoggerFactory.getLogger(ParamCheckInterceptor.class);

	private static final String OPTIONAL = "^\\[\\w+\\]$";

	private static final String MIDBRACKETS = "\\[|\\]";

	private static final String PRE = "req.";


	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		MDC.put("type", "detail");
		this.checkParam(request);
		return super.preHandle(request, response, handler);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		super.afterCompletion(request, response, handler, ex);
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		super.postHandle(request, response, handler, modelAndView);
	}

	private void checkParam(HttpServletRequest request) throws Exception {

	}

}
