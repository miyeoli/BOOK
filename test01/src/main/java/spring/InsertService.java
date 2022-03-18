package spring;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.web.multipart.MultipartFile;



public class InsertService {
	private BookDAO bookDAO;
	
	public InsertService() {
	}
	
	public InsertService(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}
	
	public void insert(InsertVO reg, HttpServletRequest request) throws IOException {
		
		String filename = null;

		MultipartFile image = reg.getImage(); //file
		if (!image.isEmpty()) {
			UUID uuid = UUID.randomUUID();
			String originalFilename = image.getOriginalFilename();
			String ext = FilenameUtils.getExtension(originalFilename);
			String webpath = "/resources/upload";
			String realpath = request.getServletContext().getRealPath(webpath)+"/";
					
			filename = uuid + "." + ext;
			
			image.transferTo(new File(realpath + filename));

		}

		reg.setFilename(filename);

		if(reg != null) {	
			BookVO bookVO = new BookVO(
					reg.getIsbn(),		
					reg.getName(), 
					reg.getWriter(), 
					reg.getPublisher(), 		
					reg.getPrice(),
					reg.getFilename(),
					reg.getContent());
			System.out.println("insertService _ bookVO : " + bookVO );

			bookDAO.insert(bookVO);

		}
	}
	
	public Boolean isbnCheck(String isbn) {
		String tmpIsbn = (String) bookDAO.selectByIsbn(isbn);
		
		Boolean result = true;
		if (tmpIsbn != null) {
			//System.out.println("isbn중복");

			result = true;
			
		} else if(tmpIsbn == null) {
			result = false;
		}
		
		return result;
	}
	

	

}
