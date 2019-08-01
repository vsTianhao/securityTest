package com.example.demo.bean;

import java.io.Serializable;

/**
 * Created by Tianhao on 2019-08-01.
 */
public class AjaxResponseBody implements Serializable {

	private String status;
	private String msg;
	private Object result;
	private String jwtToken;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getResult() {
		return result;
	}

	public void setResult(Object result) {
		this.result = result;
	}

	public String getJwtToken() {
		return jwtToken;
	}

	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
	}
}