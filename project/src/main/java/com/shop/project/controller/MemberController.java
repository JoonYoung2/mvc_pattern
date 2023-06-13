package com.shop.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shop.project.dto.MemberDTO;
import com.shop.project.service.MemberService;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService service;

	@GetMapping("/join")
	public String join() {
		return "join";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/join.do")
	public String join(MemberDTO dto, Model model) {
		String msg = service.joinInsert(dto);
		System.out.println("msg ==========> " + msg);
		if(!msg.equals("")) {
			model.addAttribute("msg", msg);
			return "join";
		}
		return "index";
	}
	
}
