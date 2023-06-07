package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountDAO {
	private Connection conn;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	public AccountDAO() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "testuser", "test1234");
					
		}catch (Exception e) {
			
		}
	}
	
	//등록
	public int insert(AccountVO acc) {
		int r = 0;
		if(findAccount(acc.getNumber()) == 0) {
			
		
			String sql = "INSERT INTO account "
					+ "(number, owner, balance) "
					+ "VALUES "
					+ "(?,?,?)";
			
			try {
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, acc.getNumber());
				pstmt.setString(2, acc.getOwner());
				pstmt.setInt(3, acc.getBalance());
				r = pstmt.executeUpdate();
						
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
		return r;
	}
	public List<AccountVO> selectAll() {
		List<AccountVO> list = new ArrayList<>();
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM account ORDER BY no DESC");
			AccountVO vo;
			while(rs.next()) {
				vo = new AccountVO();
				vo.setNo(rs.getInt("no"));
				vo.setNumber(rs.getString("number"));
				vo.setOwner(rs.getString("owner"));
				vo.setBalance(rs.getInt("balance"));
				list.add(vo);
			}
			
		} catch (Exception e){
			System.out.println(e.getMessage());
			
		}
		return list;
	}
	//예금
	public int deposit(String number, int price) {
		int r = 0;
		if(findAccount(number) >0) {
			
			try {
				pstmt = conn.prepareStatement("UPDATE account SET balance=balance+? WHERE number=?");
				pstmt.setInt(1, price);
				pstmt.setString(2, number);
				r = pstmt.executeUpdate();
			} catch (Exception e) {

				e.printStackTrace();
			}
			
			
					
			
		}else {
			r= -1;
		}
		return r;
	}
	
	
	//계좌조회
	public int findAccount(String number) {
		int r = 0;
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery("SELECT * FROM account WHERE number = '"+number+"'");
			if(rs.next()) r = rs.getInt("no");
			
			return r;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			
		}
		return r;
	}
	
	
	public void close() {
		if (rs != null) try {rs.close();} catch(Exception e) {}
		if(pstmt != null) try {pstmt.close();} catch (Exception e) {} //간결심플 //나중에나온걸먼저함 해제할때 역순으로함
		if(stmt != null) try {stmt.close();} catch (Exception e) {}
		if(conn != null) try {conn.close();} catch (Exception e) {}
	}
}
