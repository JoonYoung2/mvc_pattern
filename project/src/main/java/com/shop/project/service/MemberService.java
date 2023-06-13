package com.shop.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.project.dto.MemberDTO;
import com.shop.project.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository repo;
	
	public void memberInsert(MemberDTO member) {
		repo.memberInsert(member);
		
	}

	public MemberDTO getInfo(String user_id) {
		return repo.selectInfo(user_id);
		
	}

	public String joinInsert(MemberDTO dto) {
		String msg = "";
		if(dto.getUser_name() == null || dto.getUser_name().equals("")) {
			msg = "이름을 입력해주세요.";
			return msg;
		}
		return msg;
	}

}
