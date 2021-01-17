package com.project.controller;

import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.project.service.MemberService;
import com.project.vo.MemberVO;
import com.project.vo.ProjectVO;


@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService service;

	// 회원가입 get
	@RequestMapping(value = "/singup", method = RequestMethod.GET)
	public String getSingup(@ModelAttribute("memberVO") MemberVO memberVO, Model model) {
		
		logger.info(" ==============>>> Get SingUp Start !!!");
		
		return "member/singup";
	}
	
	// 회원가입 post
	@RequestMapping(value = "/singup", method = RequestMethod.POST)
	public String postSingup(@ModelAttribute("memberVO") MemberVO memberVO, Model model) {
		
		logger.info(" ==============>>> Post SingUp Start !!!");
		
		service.insertMember(memberVO);
		
		return "home";
	}
	
	// 로그인 get
	@RequestMapping(value = "/singin", method = RequestMethod.GET)
	public String getSingin(@ModelAttribute("memberVO") MemberVO memberVO, Model model) {
		
		logger.info(" ==============>>> Get SingUp Start !!!");
		
		return "member/singin";
	}

}
