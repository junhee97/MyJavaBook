package Ch38.Tests.DAO;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Ch38.Domain.DAO.BookDAO;
import Ch38.Domain.DAO.BookDAOImpl;
import Ch38.Domain.DAO.UserDAO;
import Ch38.Domain.DAO.UserDAOImpl;
import Ch38.Domain.DTO.BookDTO;
import Ch38.Domain.DTO.UserDTO;

class DAOTests {

	@Test
	@Disabled
	void test1() throws Exception {
		UserDAO userDaoImpl = UserDAOImpl.getInstance();
	}

	@Test
	@Disabled
	void test2() throws Exception {
		UserDAO userDaoImpl = UserDAOImpl.getInstance();
		userDaoImpl.insert(new UserDTO("ddddds", "홍길동", "1234", ""));
	}

	@Test
	@Disabled
	void test3() throws Exception {
		BookDAO bookDaoImpl = BookDAOImpl.getInstance();
		bookDaoImpl.insert(new BookDTO("1111", "리눅스다", "한빛미디어", "111-111"));
	}

	@Test
	@Disabled
	void test4() {
	}
	
	@Test
	@Disabled
	void test5() {
	}

}
