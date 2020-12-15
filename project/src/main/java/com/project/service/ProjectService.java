package com.project.service;

import java.util.List;
import com.project.vo.ProjectVO;

public interface ProjectService {
	List<ProjectVO> selectProjectList() throws Exception;
	
	void insertProject(ProjectVO projectVO);

	void updateProject(ProjectVO projectVO);

}
