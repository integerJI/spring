package com.project.vo;

import java.util.Date;

public class ProjectVO {
	private Integer proId;
	private String proTitle;
	private String proBody;
	private Date proDate;
	
	public Integer getProId() {
		return proId;
	}
	public void setProId(Integer proId) {
		this.proId = proId;
	}
	public String getProTitle() {
		return proTitle;
	}
	public void setProTitle(String proTitle) {
		this.proTitle = proTitle;
	}
	public String getProBody() {
		return proBody;
	}
	public void setProBody(String proBody) {
		this.proBody = proBody;
	}
	public Date getProDate() {
		return proDate;
	}
	public void setProDate(Date proDate) {
		this.proDate = proDate;
	}
	
}
