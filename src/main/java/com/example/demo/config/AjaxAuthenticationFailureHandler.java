package com.example.demo.config;

/**
 * Created by Tianhao on 2019-08-01.
 */
import com.alibaba.fastjson.JSON;
import com.example.demo.bean.AjaxResponseBody;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AjaxAuthenticationFailureHandler implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
		AjaxResponseBody responseBody = new AjaxResponseBody();

		responseBody.setStatus("400");
		responseBody.setMsg("Login Failure!");

		httpServletResponse.getWriter().write(JSON.toJSONString(responseBody));
	}
}
