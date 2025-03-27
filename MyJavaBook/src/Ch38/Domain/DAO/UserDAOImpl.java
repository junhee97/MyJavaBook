package Ch38.Domain.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Ch38.Domain.DTO.UserDTO;

public class UserDAOImpl {

	// DB Attr
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	private String id = "root";
	private String pw = "1234";
	private String url = "jdbc:mysql://localhost:3306/bookDB";

	// 싱글톤 패턴처리
	private static UserDAOImpl instance;

	private UserDAOImpl() throws SQLException, ClassNotFoundException {
		System.out.println("[DAO] UserDAOImpl init...");
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("UserDAOImpl DB Connection Success");
	};

	public static UserDAOImpl getInstance() throws ClassNotFoundException, SQLException {
		if (instance == null)
			instance = new UserDAOImpl();
		return instance;
	}

	// CRUD
	public int insert(UserDTO userDto) throws SQLException {
		try {
			pstmt = conn.prepareStatement("insert into tbl_user values(?,?,?,?)");
			pstmt.setString(1, userDto.getUserid());
			pstmt.setString(2, userDto.getUsername());
			pstmt.setString(3, userDto.getPassword());
			pstmt.setString(4, userDto.getRole());
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

	public int update(UserDTO userDto) throws SQLException {
		try {
			pstmt = conn.prepareStatement("");

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("USERDAO's UPDATE SQL EXCEPTION!!");
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {
			}
		}
	}

	public int delete(UserDTO userDto) throws SQLException {
		try {
			pstmt = conn.prepareStatement("");

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("USERDAO's DELETE SQL EXCEPTION!!");
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {
			}
		}
	}

	// 단건 조회
	public UserDTO select(UserDTO userDto) {
		return null;
	}

	// 다건 조회
	public List<UserDTO> selectAll() {
		return null;
	}

}
