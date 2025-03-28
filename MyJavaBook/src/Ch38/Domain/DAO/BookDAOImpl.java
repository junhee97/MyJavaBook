package Ch38.Domain.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Ch38.Domain.DTO.BookDTO;

public class BookDAOImpl extends DAO implements BookDAO {

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
	private static BookDAO instance;

	private BookDAOImpl() throws Exception {
		System.out.println("[DAO] BookDAOImpl init...");
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("BookDAOImpl DB Connection Success");

//		connectionPool = ConnectionPool.getInstance();
	};

	public static BookDAO getInstance() throws Exception {
		if (instance == null)
			instance = new BookDAOImpl();
		return instance;
	}

	// CRUD
	@Override
	public int insert(BookDTO bookDto) throws Exception {
		try {
			connectionItem = connectionPool.getConnection();
			Connection conn = connectionItem.getConn();
			pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
			pstmt.setString(1, bookDto.getBookCode());
			pstmt.setString(2, bookDto.getBookName());
			pstmt.setString(3, bookDto.getPublisher());
			pstmt.setString(4, bookDto.getIsbn());

			// connection release
			connectionPool.releaseConnection(connectionItem);

			return pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("BOOKDAO's INSERT SQL EXCEPTION!!");
		} finally {
			try {
				pstmt.close();
			} catch (Exception e2) {
			}
		}
	}

	@Override
	public int update(BookDTO bookDto) throws SQLException {
//		try {
//			pstmt = conn.prepareStatement("");
//
//			return pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			throw new SQLException("BOOKDAO's UPDATE SQL EXCEPTION!!");
//		} finally {
//			try {
//				pstmt.close();
//			} catch (Exception e2) {
//			}
//		}
		return 0;
	}

	@Override
	public int delete(BookDTO bookDto) throws SQLException {
//		try {
//			pstmt = conn.prepareStatement("");
//
//			return pstmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//			throw new SQLException("BOOKDAO's DELETE SQL EXCEPTION!!");
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
	public BookDTO select(BookDTO bookDto) {
		return null;
	}

	// 다건 조회
	@Override
	public List<BookDTO> selectAll() {
		return null;
	}

}
