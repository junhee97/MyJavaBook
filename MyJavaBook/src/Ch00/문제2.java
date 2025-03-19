package Ch00;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class 문제2 {

	// DB CONN DATA
	private static String id = "root";
	private static String pw = "1234";
	private static String url = "jdbc:mysql://localhost:3306/tmpdb";

	// JDBC 참조변수
	private static Connection conn;
	private static PreparedStatement pstmt;
	private static ResultSet rs;

	public static void conn() throws SQLException, ClassNotFoundException {
		// DB 연결 코드
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Loading Success...");
		conn = DriverManager.getConnection(url, id, pw);
		System.out.println("DB CONNECTED...");

	}

	public static List<BookDto> selectAll() throws SQLException {
		// 전체 조회
		pstmt = conn.prepareStatement("select * from tbl_book");
		rs = pstmt.executeQuery();

		List<BookDto> allBook = new ArrayList();
		if (rs != null) {
			while (rs.next()) {
				Long bookCode = rs.getLong("bookCode");
				String bookName = rs.getString("bookName");
				String publisher = rs.getString("publisher");
				String isbn = rs.getString("isbn");
				allBook.add(new BookDto(bookCode, bookName, publisher, isbn));
			}
		}
		return allBook;
	}

	public static BookDto select(Long bookCode) throws SQLException {
		// 단건 조회
		pstmt = conn.prepareStatement("select * from tbl_book where bookCode = ?");
		pstmt.setLong(1, bookCode);
		rs = pstmt.executeQuery();

		if (rs.next()) {
			String bookName = rs.getString("bookName");
			String publisher = rs.getString("publisher");
			String isbn = rs.getString("isbn");

			return new BookDto(bookCode, bookName, publisher, isbn);
		}
		return null;
	}

	public static int insertBook(BookDto bookDto) throws SQLException {
		// 내용 입력
		pstmt = conn.prepareStatement("insert into tbl_book values(?,?,?,?)");
		pstmt.setLong(1, bookDto.getBookCode());
		pstmt.setString(2, bookDto.getBookName());
		pstmt.setString(3, bookDto.getPublisher());
		pstmt.setString(4, bookDto.getIsbn());

		return pstmt.executeUpdate();
	}

	public static int updateBook(BookDto bookDto) throws SQLException {
		// 내용 수정
		String query = "update tbl_book set bookName = ?, publisher = ?, isbn = ? where bookCode = ?";
		pstmt = conn.prepareStatement(query);

		pstmt.setString(1, bookDto.getBookName());
		pstmt.setString(2, bookDto.getPublisher());
		pstmt.setString(3, bookDto.getIsbn());
		pstmt.setLong(4, bookDto.getBookCode());

		return pstmt.executeUpdate();
	}

	public static int deleteBook(Long bookCode) throws SQLException {
		// 내용 삭제
		pstmt = conn.prepareStatement("delete from tbl_book where bookCode = ?");
		pstmt.setLong(1, bookCode);

		return pstmt.executeUpdate();
	}

	public static void main(String[] args) {
		try {
			// DB Conn
			conn();

			// Tx start
			conn.setAutoCommit(false); // 자동 커밋 비활성화

			// Insert
			insertBook(new BookDto(1L, "도서명1", "출판사명1", "isbn-1"));
			insertBook(new BookDto(2L, "도서명2", "출판사명2", "isbn-2"));
			insertBook(new BookDto(3L, "도서명3", "출판사명3", "isbn-3"));

			// SelectAll
			List<BookDto> allBook = selectAll();
			System.out.println("selectAll : ");
			allBook.forEach(el -> System.out.println(el));

			// Select
			BookDto dto = select(1L);
			System.out.println("select : " + dto);

			// Update
			dto.setBookName("수정도서명-2");
			dto.setPublisher("수정출판사명-2");
			int r1 = updateBook(dto);
			if (r1 > 0)
				System.out.println("수정완료 : " + r1);

			// Delete
			int r2 = deleteBook(2L);
			if (r2 > 0)
				System.out.println("삭제완료 : " + r2);

			// Tx End
			conn.commit(); // 트랜잭션 커밋

		} catch (Exception e) {
			// Tx RollbackAll
			try {
				conn.rollback(); // 오류 발생시 롤백
			} catch (SQLException e1) {
				e1.printStackTrace(); // 롤백 오류 출력
			}
			e.printStackTrace(); // 메인 오류 출력
		} finally {
			// 자원해제
			try {
				rs.close();
			} catch (Exception e2) {}
			try {
				pstmt.close();
			} catch (Exception e2) {}
			try {
				conn.close();
			} catch (Exception e2) {}
		}
	}

}
