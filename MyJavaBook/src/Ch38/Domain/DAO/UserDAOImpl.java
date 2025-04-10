package Ch38.Domain.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Ch38.Domain.DTO.UserDTO;

public class UserDAOImpl extends DAO implements UserDAO {

	// DB Attr
//	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
//
//	private String id = "root";
//	private String pw = "1234";
//	private String url = "jdbc:mysql://localhost:3306/bookDB";

	// CONNECTION POOL
//	private ConnectionPool connectionPool;
//	private ConnectionItem connectionItem;

	// 싱글톤 패턴처리
	private static UserDAO instance;

	private UserDAOImpl() throws Exception {
		System.out.println("[DAO] UserDAOImpl init...");
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("UserDAOImpl DB Connection Success");

//		connectionPool = ConnectionPool.getInstance();
	};

	public static UserDAO getInstance() throws Exception {
		if (instance == null)
			instance = new UserDAOImpl();
		return instance;
	}

	// CRUD
	@Override
	public int insert(UserDTO userDto) throws Exception {
		try {
			connectionItem = connectionPool.getConnection();
			Connection conn = connectionItem.getConn();
			pstmt = conn.prepareStatement("insert into tbl_user values(?,?,?,?)");
			pstmt.setString(1, userDto.getUserid());
			pstmt.setString(2, userDto.getUsername());
			pstmt.setString(3, userDto.getPassword());
			pstmt.setString(4, "ROLE_USER");

			// Connection release
			connectionPool.releaseConnection(connectionItem);

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("USERDAO's INSERT SQL EXCEPTION!!");
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {
			}
		}
	}

	@Override
	public int update(UserDTO userDto) throws SQLException {
//		try {
//			pstmt = conn.prepareStatement("");
//
//			return pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			throw new SQLException("USERDAO's UPDATE SQL EXCEPTION!!");
//		} finally {
//			try {
//				pstmt.close();
//			} catch (Exception e2) {
//			}
//		}
		return 0;
	}

	@Override
	public int delete(UserDTO userDto) throws SQLException {
//		try {
//			pstmt = conn.prepareStatement("");
//
//			return pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			throw new SQLException("USERDAO's DELETE SQL EXCEPTION!!");
//		} finally {
//			try {
//				pstmt.close();
//			} catch (Exception e2) {
//			}
//		}
		return 0;
	}

	// 단건 조회
	@Override
	public UserDTO select(UserDTO userDto) {
		return null;
	}

	// 다건 조회
	@Override
	public List<UserDTO> selectAll() {
		return null;
	}

}
