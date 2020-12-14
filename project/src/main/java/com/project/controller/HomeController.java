package com.project.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.project.service.ProjectService;
import com.project.vo.ProjectVO;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Resource(name = "projectService")
	private ProjectService projectService;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value = "/projectList.do")
	public String projectList(Model model) throws Exception {

	    List<ProjectVO> list = projectService.selectProjectList();

	    logger.info(list.toString());

	    model.addAttribute("list", list);
	    
	    return "projectList";
	}
	
	/**
	 * 게시판 등록폼
	 * @param projectVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/projectRegisterForm.do")
	public String projectRegisterForm(@ModelAttribute("projectVO") ProjectVO projectVO, Model model) throws Exception {

	    return "projectRegisterForm";
	}
	
	/**
	 * 글을 등록합니다.
	 * @return
	 */
	@RequestMapping(value = "/projectInsert.do")
	public String projectInsert(@ModelAttribute("projectVO") ProjectVO projectVO, Model model) {

		projectService.insertProject(projectVO);
		
		return "redirect:/projectList.do";
	}
	
}
