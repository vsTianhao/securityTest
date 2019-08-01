package com.example.demo.controller;

/**
 * Created by Tianhao on 2019-08-01.
 */
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/common")
public class testController {

	@GetMapping("/index")
	public String index(){
		return "index";
	}

	@GetMapping("/inner")
	public String inner(){
		return "inner";
	}
}