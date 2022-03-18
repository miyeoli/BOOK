package spring;

import java.util.List;

import controller.ListCommand;

public interface BookDAO {
	
	
	public void insert(BookVO bookVO);
	public BookVO selectByNum(Long num);
	public List<BookVO> selectAll();
	public List<BookVO> selectByKeyword(ListCommand listCommand);
	public Object selectByIsbn(String isbn);
	
	


}
