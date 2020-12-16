package com.project.service.dao;
import java.util.List;

import com.project.vo.ProjectVO;

public interface ProjectDAO {
	List<ProjectVO> selectProjectList() throws Exception;

	void insertProject(ProjectVO projectVO);

	void updateProject(ProjectVO projectVO);
	
	void deleteProject(int proId);

}
