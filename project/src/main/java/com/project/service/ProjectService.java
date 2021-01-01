package com.project.service;

import java.util.List;
import java.util.Map;

import com.project.vo.ProjectVO;

public interface ProjectService {
	List<ProjectVO> selectProjectList() throws Exception;
	
	void insertProject(ProjectVO projectVO);

	void updateProject(ProjectVO projectVO);
	
	void deleteProject(int proId);
	
	List<ProjectVO> detailProject(int proId);
	
	void viewCount(int proId);

}
