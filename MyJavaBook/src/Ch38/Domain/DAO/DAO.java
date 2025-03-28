package Ch38.Domain.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Ch38.Domain.DAO.ConnectionPool.ConnectionItem;
import Ch38.Domain.DAO.ConnectionPool.ConnectionPool;

public abstract class DAO {

	private PreparedStatement pstmt;
	private ResultSet rs;

	// CONNECTION POOL
	protected ConnectionPool connectionPool;
	protected ConnectionItem connectionItem;

	public DAO() throws SQLException {
		// connectionPool
		connectionPool = ConnectionPool.getInstance();
	}

}
