package Ch38.Domain.DAO;

import java.sql.SQLException;
import java.util.List;

import Ch38.Domain.DTO.UserDTO;

public interface UserDAO {

	// CRUD
	int insert(UserDTO userDto) throws Exception;

	int update(UserDTO userDto) throws SQLException;

	int delete(UserDTO userDto) throws SQLException;

	// 단건 조회
	UserDTO select(UserDTO userDto);

	// 다건 조회
	List<UserDTO> selectAll();

}