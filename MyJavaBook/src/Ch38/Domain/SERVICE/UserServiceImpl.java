package Ch38.Domain.SERVICE;

import java.sql.SQLException;

import Ch38.Domain.DAO.UserDAO;
import Ch38.Domain.DAO.UserDAOImpl;
import Ch38.Domain.DAO.ConnectionPool.ConnectionPool;
import Ch38.Domain.DTO.UserDTO;

public class UserServiceImpl {

	//
	private UserDAO userDao;
	private ConnectionPool connectionPool;

	// 싱글톤
	private static UserServiceImpl instance;

	private UserServiceImpl() throws Exception {
		userDao = UserDAOImpl.getInstance();
		connectionPool = ConnectionPool.getInstance();
		System.out.println("[SERVICE] UserServiceImpl init...");
	}

	public static UserServiceImpl getInstance() throws Exception {
		if (instance == null)
			instance = new UserServiceImpl();
		return instance;
	}

	// 회원가입(+Tx 처리필요)
	public boolean userJoin(UserDTO userDto) throws Exception {
		boolean isJoin = false;
		try {
			connectionPool.beginTransaction();

			isJoin = userDao.insert(userDto) > 0; // sql 질의 다수
//			userDao.insert(new UserDTO("aaaaa", "", "", ""));
//			userDao.insert(new UserDTO("aaaab", "", "", ""));
//			userDao.insert(new UserDTO("aaaaa", "", "", "")); // PK 중복 오류!

			connectionPool.commitTransaction();
		} catch (SQLException e) {
			// rollback
			connectionPool.rollbackTransaction();
		}
		return isJoin;
	};

	// 회원조회

	// 회원정보수정

	// 회원탈퇴

	// 로그인

	// 로그아웃

}
