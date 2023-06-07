package ch08;

public class DaoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataAccessObject dao = new OracleDao();
		dbWork(dao);
		dbWork(new MySqlDao());
	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}
