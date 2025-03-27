package Ch38.Domain.SERVICE;

import java.sql.SQLException;

import Ch38.Domain.DAO.BookDAOImpl;
import Ch38.Domain.DTO.BookDTO;

public class BookServiceImpl {

	//
	private BookDAOImpl bookDao;

	// 싱글톤
	private static BookServiceImpl instance;

	private BookServiceImpl() throws Exception {
		bookDao = BookDAOImpl.getInstance();
		System.out.println("[SERVICE] BookServiceImpl init...");
	}

	public static BookServiceImpl getInstance() throws Exception {
		if (instance == null)
			instance = new BookServiceImpl();
		return instance;
	}

	// 도서 등록
	public boolean bookJoin(BookDTO bookDto) throws SQLException {
		return bookDao.insert(bookDto) > 0;
	}

	// 도서 조회

	// 도서 수정

	// 도서 삭제

}
