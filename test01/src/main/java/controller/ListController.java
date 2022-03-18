package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.BookDAO;
import spring.BookVO;

@Controller
public class ListController {
	
	private BookDAO bookDAO;
	
	public void setBookDAO(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
   @RequestMapping("/list")
	public String list(Model model) {
		List<BookVO> list = bookDAO.selectAll();
		model.addAttribute("list",list);
		return "/books/book_list";
	}
	
	
	

}


