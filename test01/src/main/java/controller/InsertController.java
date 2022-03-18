package controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import spring.BookVO;
import spring.InsertService;
import spring.InsertVO;

@Controller
public class InsertController {
	
	private InsertService insertService;
	
	public void setInsertService(InsertService insertService) {
		this.insertService = insertService;
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String handle1(@ModelAttribute("formData") BookVO bookVO){
		return "/books/book_reg_form";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String handle2(@ModelAttribute("formData") InsertVO insertVO, Errors errors, HttpServletRequest request) throws IOException{
		
		new insertValidator().validate(insertVO, errors);
		
		if(errors.hasErrors()) {
			//System.out.println("모두 입력해주세요");
			return "/error/errorForm";
		}

		if (insertService.isbnCheck(insertVO.getIsbn()) == true) {
			//System.out.println("insertCon :  isbn 중복");
			return "/error/error_isbn";
		} 
		
		insertService.insert(insertVO, request);

		return "redirect:/list";
	}
}
