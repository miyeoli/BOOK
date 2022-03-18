package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.BookDAO;
import spring.BookVO;


@Controller
public class SearchController {
	
	private BookDAO bookDAO;
	
	public void setBookDAO (BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	@RequestMapping(value="/search", method=RequestMethod.GET)
	public String handleSearch(Model model, @ModelAttribute("listCommand")ListCommand listCommand) {
		List<BookVO> SearchList = bookDAO.selectByKeyword(listCommand);
		model.addAttribute("SearchList",SearchList);
		return "/books/book_list";

		
	}
	
}
