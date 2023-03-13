package com.smhrd.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.smhrd.Mapper.BoardMapper;
import com.smhrd.entity.Board;

@Controller
public class BoardController {
	
	@Autowired
	private BoardMapper mapper;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(Model vo) {
		return "redirect:/boardList.do";
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
	
	@GetMapping(value = "/boardContent.do")
	public String boardContent(@RequestParam("idx") int idx, Model model) {
		Board vo = mapper.boardContent(idx);
		model.addAttribute("vo", vo);
		return "boardContent";
	}
	
	@GetMapping(value = "/boardDelete.do")
	public String boardDelete(@RequestParam("idx") int idx) {
		mapper.boardDelete(idx);
		return "redirect:/boardList.do";
	}
	@PostMapping(value = "/boardUpdate.do")
	public String boardUpdate(Model model, Board vo) {
		mapper.boardUpdate(vo);
		return "redirect:/boardList.do";
	}

}













