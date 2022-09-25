package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.stadium.StadiumDao;
import com.example.demo.service.StadiumService;
import com.example.demo.web.dto.CMRespDto;
import com.example.demo.web.dto.request.expulsion.SaveDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class StadiumController {

	private final StadiumDao stadiumDao;
	private final StadiumService stadiumService;

	@GetMapping({"/", "/stadiumList"})
	public String stadiumList(Model model) {
		model.addAttribute("stadium", stadiumService.경기장목록보기());
		return "stadium/stadiumList";
	}
	
	@PostMapping("/stadium/save")
	public @ResponseBody CMRespDto<?> insert(@RequestBody SaveDto saveDto) {
		stadiumService.경기장등록하기(saveDto);
		return new CMRespDto<>(1, "경기장등록성공", null);
	}
	
	@GetMapping("/stadium/stadiumSaveForm")
	public String stadiumSaveForm() {
		return "stadium/stadiumSaveForm";
	}
	
}
