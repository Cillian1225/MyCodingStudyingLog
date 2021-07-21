package kh.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import kh.spring.dao.MessagesDAO;
import kh.spring.dto.MessagesDTO;

@Controller
public class HomeController {

	@Autowired
	private MessagesDAO dao;

	@RequestMapping("/")
	public String home() {

		return "home";

		
	}

	@RequestMapping("inputForm")
	public String inputForm() {
		return "inputForm";
	}
	
	@RequestMapping("inputProc")
	public String inputProc(MessagesDTO dto) throws Exception{
		System.out.println(dto.getWriter()+":"+dto.getMessage());
		int result = dao.insert(dto);
		
		return "redirect:/";
		
	}
	@RequestMapping("outputForm")
	public String outputForm(Model model)throws Exception {
		List<MessagesDTO>list =dao.selectAll();
		model.addAttribute("list",list);
		return "outputForm";
	}
	
	@RequestMapping("modifyProc")
	public String modifyProc(MessagesDTO dto) throws Exception{
	System.out.println("수정요청");
		int result = dao.modify(dto);
		
		return "redirect:outputForm";
		
	}
	
	@RequestMapping("deleteProc")
	public String modifyProc(int delid) throws Exception{
	System.out.println("삭제요청");
		int result = dao.delete(delid);
		
		return "redirect:outputForm";
		
	}
	
	
	
	@ExceptionHandler
	public String exceptionHandler(Exception e) {
		e.printStackTrace();
		return "error";
	}
}
