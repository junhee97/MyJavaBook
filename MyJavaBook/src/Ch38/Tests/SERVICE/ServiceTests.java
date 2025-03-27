package Ch38.Tests.SERVICE;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Ch38.Domain.DTO.BookDTO;
import Ch38.Domain.DTO.UserDTO;
import Ch38.Domain.SERVICE.BookServiceImpl;
import Ch38.Domain.SERVICE.UserServiceImpl;

class ServiceTests {

	@Test
	@Disabled
	void test1() throws Exception {
		UserServiceImpl userService = UserServiceImpl.getInstance();
		userService.userJoin(new UserDTO("bbb", "남길동", "1234", "ROLE_USER"));
	}

	@Test
	@Disabled
	void test2() throws Exception {
		BookServiceImpl bookService = BookServiceImpl.getInstance();
		bookService.bookJoin(new BookDTO("2222", "이것이", "한빛미디어", "222-222"));
	}

}
