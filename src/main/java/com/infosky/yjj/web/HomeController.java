package com.infosky.yjj.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infosky.yjj.dto.Movies;
import com.infosky.yjj.dto.UserInfo;
import com.infosky.yjj.utils.ApplicationContextUtils;
import com.infosky.yjj.utils.ApplicationContextHolder;
import com.infosky.yjj.utils.ServiceLocator;

@Controller
@RequestMapping("home")
public class HomeController {
	@RequestMapping("/movie")
	public ModelAndView showMovie(
			@RequestParam(required = false) String message) {
		UserInfo user=ApplicationContextUtils.getBean(ApplicationContextHolder.getApplicationContext(), "defaultUserBean", UserInfo.class);
		//System.out.println(user.getUserName());
		Movies movie=ApplicationContextUtils.getBean(ApplicationContextHolder.getApplicationContext(), "MovieBean", Movies.class);
		System.out.println(movie.getNameCn()+"|"+movie.getNameEn());
		return new ModelAndView("hello");
	}
	@RequestMapping("/hello")
	public ModelAndView helloWorld(@RequestParam(required=false)String message){
		Movies movie=(Movies) ServiceLocator.getService("MovieBean", Movies.class);
		System.out.println(movie.getNameCn()+"|"+movie.getNameEn());
		return null;
	}
}
