package com.project.vo;

import java.util.Date;

public class MemberVO {
	private Integer userNum;
	private String userId;
	private String userPassward;
	private Date regDate;
	
	public Integer getUserNum() {
		return userNum;
	}
	public void setUserNum(Integer userNum) {
		this.userNum = userNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPassward() {
		return userPassward;
	}
	public void setUserPassward(String userPassward) {
		this.userPassward = userPassward;
	}	
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
}
