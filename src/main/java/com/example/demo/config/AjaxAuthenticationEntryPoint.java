package com.example.demo.config;

/**
 * Created by Tianhao on 2019-08-01.
 */
import com.alibaba.fastjson.JSON;
import com.example.demo.bean.AjaxResponseBody;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class AjaxAuthenticationEntryPoint implements AuthenticationEntryPoint {

	@Override
	public void commence(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, AuthenticationException e) throws IOException, ServletException {
		AjaxResponseBody responseBody = new AjaxResponseBody();

		responseBody.setStatus("000");
		responseBody.setMsg("Need Authorities!");

		httpServletResponse.getWriter().write(JSON.toJSONString(responseBody));
	}
}