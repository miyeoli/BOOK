
package spring;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import controller.ListCommand;


public class BookDAOImpl implements BookDAO{
	
	private SqlSessionTemplate sqlSessionTemplate;
	
	public BookDAOImpl(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}
	@Override
	public void insert(BookVO bookVO) {
		sqlSessionTemplate.insert("insert", bookVO);
	}
	@Override
	public List<BookVO> selectAll() {
		return sqlSessionTemplate.selectList("list");
	}
	@Override
	public BookVO selectByNum(Long num) {
		return sqlSessionTemplate.selectOne("selectByNum", num);
	}
	@Override
	public List<BookVO>  selectByKeyword(ListCommand listCommand) {
		return sqlSessionTemplate.selectList("selectByKeyword", listCommand);
	}

	@Override
	public Object selectByIsbn(String isbn) {
		return sqlSessionTemplate.selectOne("selectByIsbn", isbn);
	}



}
