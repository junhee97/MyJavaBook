package Ch38.Tests.DAO;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Ch38.Domain.DAO.BookDAOImpl;
import Ch38.Domain.DAO.UserDAOImpl;
import Ch38.Domain.DTO.BookDTO;
import Ch38.Domain.DTO.UserDTO;

class DAOTests {

	@Test
	@Disabled
	void test1() throws Exception {
		UserDAOImpl userDaoImpl = UserDAOImpl.getInstance();
	}

	@Test
	@Disabled
	void test2() throws Exception {
		UserDAOImpl userDaoImpl = UserDAOImpl.getInstance();
		userDaoImpl.insert(new UserDTO("aaa", "홍길동", "1234", ""));
	}

	@Test
	void test3() throws Exception {
		BookDAOImpl bookDaoImpl = BookDAOImpl.getInstance();
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
