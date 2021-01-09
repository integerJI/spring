package com.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.project.service.MemberService;
import com.project.service.dao.MemberDAO;
import com.project.vo.MemberVO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO membertMapper;

	@Override
	public void insertMember(MemberVO memberVO) {
		membertMapper.insertMember(memberVO);
	}
	
}