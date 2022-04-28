package com.daelim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class helloController {
	@RequestMapping("/where")
	@ResponseBody
	public String where() {
		return "안녕하십니까 ~초보개발자입니다.";
	}
}