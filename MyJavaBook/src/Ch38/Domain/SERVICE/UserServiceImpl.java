package Ch38.Domain.SERVICE;

import java.sql.SQLException;

import Ch38.Domain.DAO.UserDAOImpl;
import Ch38.Domain.DTO.UserDTO;

public class UserServiceImpl {

	//
	private UserDAOImpl userDao;

	// 싱글톤
	private static UserServiceImpl instance;

	private UserServiceImpl() throws Exception {
		userDao = UserDAOImpl.getInstance();
		System.out.println("[SERVICE] UserServiceImpl init...");
	}

	public static UserServiceImpl getInstance() throws Exception {
		if (instance == null)
			instance = new UserServiceImpl();
		return instance;
	}

	// 회원가입(+Tx 처리필요)
	public boolean userJoin(UserDTO userDto) throws SQLException {
		return userDao.insert(userDto) > 0;
	};

	// 회원조회

	// 회원정보수정

	// 회원탈퇴

	// 로그인

	// 로그아웃

}
