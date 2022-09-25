package com.example.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.team.TeamDao;
import com.example.demo.service.TeamService;
import com.example.demo.web.dto.CMRespDto;
import com.example.demo.web.dto.request.team.SaveDto;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class TeamController {

	private final TeamDao taemDao;
	private final TeamService teamService;
	
	@GetMapping("/teamList")
	public String teamList(Model model){
		model.addAttribute("team", teamService.팀목록보기());
		return "/team/teamList";
	}
	
	@GetMapping("/teamSaveForm")
	public String teamSaveForm(){
		return "/team/teamSaveForm";
	}
	
	@PostMapping("/team/save")
	public @ResponseBody CMRespDto<?> insert(@RequestBody SaveDto saveDto) {
		teamService.팀등록하기(saveDto);
		return new CMRespDto<>(1, "팀 등록이 완료되었습니다.", null);
	}
}
