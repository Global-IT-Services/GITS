package kh.com.gits.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/user")
public class UserController {
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Map<String, Object> map){
		map.put("USER","I AM USER CONTROLLER");
		return "users/index";
	}
}