package com.daelim;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class helloController {
	@RequestMapping("/where")
	@ResponseBody
	public String where() {
		return "�ȳ��Ͻʴϱ� ~�ʺ��������Դϴ�.";
	}
}