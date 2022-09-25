package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.domain.expulsion.ExpulsionDao;
import com.example.demo.service.ExpulsionService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class ExpulsionController {
	private final ExpulsionDao expulsionDao;
	private final ExpulsionService expulsionService;
	
	@GetMapping("/expulsionList")
	public String expulsionList(Model model) {
		model.addAttribute("expulsion",expulsionService.팀목록보기());
		return "/expulsion/expulsionList";
	}
}
