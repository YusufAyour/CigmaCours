package seance_11.annotation.cigma;

public class DBManager {
	@Autowired(Way.SETTER)
	public Connection conn;
	public DBManager(Connection conn) {
		this.conn = conn;
	}
}
