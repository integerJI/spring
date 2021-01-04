package com.project.vo;

import java.util.Date;

public class MemberVO {
	private Integer userNum;
	private String userId;
	private String userPassward;
	private Date REG_DATE;
	
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
	public Date getREG_DATE() {
		return REG_DATE;
	}
	public void setREG_DATE(Date rEG_DATE) {
		REG_DATE = rEG_DATE;
	}
	
}
