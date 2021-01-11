package com.project.controller;

import javax.inject.Inject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.project.service.MemberService;
import com.project.vo.MemberVO;


@Controller
public class MemberController {

	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	@Inject
	MemberService service;
	
	// 회원가입 get
	@RequestMapping(value = "/singup.do", method = RequestMethod.GET)
	public String singup(Model model) {
		logger.info(" ==============>>> SingUp Start !!!");
		
		return "member/singup";
	}
	
	// 회원가입 post
	@RequestMapping(value = "/singup", method = RequestMethod.POST)
	public String postRegister(MemberVO vo) throws Exception {
		logger.info("post register");
		
		service.insertMember(vo);
		
		return null;
	}

}
