package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.BookDAO;
import spring.BookVO;

@Controller
public class DetailController {
	
	private BookDAO bookDAO;
	
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	@RequestMapping("/detail/{num}")
	public String detail(@PathVariable("num") Long num, Model model ) {
		
		BookVO bookVO = bookDAO.selectByNum(num);
		
		model.addAttribute("list", bookVO);
		return "/books/book_detail";
	}
	
	

}


