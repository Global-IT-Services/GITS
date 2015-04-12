package kh.com.gits.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/article")
public class ArticleController {
	
	private  static final Logger logger = LoggerFactory.getLogger(ArticleController.class);
	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index(Model model){
		logger.info("Welcome to Articl Controller...");
		model.addAttribute("ARTICLE","I AM ARTICLE CONTROLLER...");
		return "articles/index";
	}

}
