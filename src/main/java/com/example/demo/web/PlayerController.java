package com.example.demo.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.domain.player.PlayerDao;
import com.example.demo.service.PlayerService;
import com.example.demo.web.dto.CMRespDto;
import com.example.demo.web.dto.request.player.SaveDto;
import com.example.demo.web.dto.response.PlayerDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class PlayerController {
	
	private final PlayerDao playerDao;
	private final PlayerService playerService;
	
	@GetMapping("/playerList")
	public String playerList(Model model) {
		List<PlayerDto> playerList = playerService.선수목록보기();
		model.addAttribute("playerList",playerList);
		return "/player/playerList";
	}
	
	@PostMapping("/player/save")
	public @ResponseBody CMRespDto<?> insert(@RequestBody SaveDto saveDto) {
		playerService.선수등록하기(saveDto);
		return new CMRespDto<>(1, "선수등록성공", null);
	}
	
	@GetMapping("/player/playerSaveForm")
	public String playerSaveForm() {
		return "/player/playerSaveForm";
	}
}
