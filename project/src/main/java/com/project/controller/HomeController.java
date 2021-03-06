package com.project.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.activation.CommandMap;
import javax.annotation.Resource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

	/**
	 * 글을 상세 페이지.
	 * @return projectDetailForm
	 */
	@RequestMapping(value = "/projectDetailForm.do")
	public String detailProject(@ModelAttribute("projectVO") ProjectVO projectVO, Model model) {
	
		// 조회수 증가
		projectService.viewCount(projectVO.getProId());
		
	    List<ProjectVO> list = projectService.detailProject(projectVO.getProId());
	
	    model.addAttribute("list", list);
	    
		return "projectDetailForm";
	}
	
	/**
	 * 게시판 수정폼
	 * @param projectVO
	 * @param model
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/projectUpdateForm.do")
	public String projectUpdateForm(@ModelAttribute("projectVO") ProjectVO projectVO, Model model) throws Exception {

	    return "projectUpdateForm";
	}
	
	/**
	 * 글을 수정합니다.
	 * @return
	 */
	@RequestMapping(value = "/projectUpdate.do")
	public String projectUpdate(@ModelAttribute("projectVO") ProjectVO projectVO, Model model) {

		projectService.updateProject(projectVO);
		
		return "redirect:/projectList.do";
	}

	/**
	 * 글을 삭제합니다.
	 * @return
	 */
	@RequestMapping(value = "/projectDelete.do")
	public String projectDelete(int proId) {

		projectService.deleteProject(proId);
		
		return "redirect:/projectList.do";
	}
	
}
