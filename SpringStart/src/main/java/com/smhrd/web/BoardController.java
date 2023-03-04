package com.smhrd.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smhrd.Mapper.BoardMapper;
import com.smhrd.entity.Board;

@Controller
public class BoardController {
	
	@Autowired
	private BoardMapper mapper;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model vo) {
		return "boardList";
	}
	@RequestMapping(value = "/boardList.do", method = RequestMethod.GET)
	public String boardList(Model vo) {
		List<Board> list =  mapper.getList();
		vo.addAttribute("list",list);
		return "boardList";
	}
	
	@GetMapping(value = "/boardForm.do")
	public String boardForm() {
		
		return "boardForm";
	}
	@PostMapping(value = "/boardInsert.do")
	public String boardInsert(Board vo) {
		mapper.boardInsert(vo);
		return "redirect:/boardList.do";
	}

}













