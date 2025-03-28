package Ch38.Domain.DAO;

import java.sql.SQLException;
import java.util.List;

import Ch38.Domain.DTO.BookDTO;

public interface BookDAO {

	// CRUD
	int insert(BookDTO bookDto) throws Exception;

	int update(BookDTO bookDto) throws SQLException;

	int delete(BookDTO bookDto) throws SQLException;

	// 단건 조회
	BookDTO select(BookDTO bookDto);

	// 다건 조회
	List<BookDTO> selectAll();

}