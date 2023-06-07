package dbrestaurant;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class practice {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null; //statement 객체를 따로 생성해야함
		ResultSet rs = null; //executeQuery 가 resultSet을 리턴하기때문에 따로 객체 생성해야함
		List<Map> item= new ArrayList<>();
		try {
			//1. 드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//2. DB접속
			conn = DriverManager.getConnection("jdbc:oracle:thin:@115.21.253.187:1521/xe", "bigdb", "bigdb1234!@#$");
			//3. statement 객체 생성 > /오라클에서 선택한 것/아이디 / 비번
			stmt = conn.createStatement();
			
			
			//4. sql 실행(처리)
			// select -> executeQuery : ResultSet 리턴
			// insert/update/delete -> excuteUpdate : int 리턴
			String sql = "SELECT * FROM item";
			rs = stmt.executeQuery(sql);
			
			String[] keys= {"item_id",
					"product_name",
					"product_desc",
					"category_id",
					"price"};
			// 5. 결과처리(커서 형태)
			while (rs.next()) {
				Map<String, String>maptemp = new HashMap<>();
				for (String string : keys) {
					maptemp.put(string, rs.getString(string));
				}
				item.add(maptemp);

				System.out.println(rs.getString("item_id")+" "+rs.getString("product_name")+" "+rs.getString("product_desc")+" "+rs.getString("category_id")+" "+rs.getString("price"));
			}
//			Map<String, String>item_id1 = new HashMap<>();
//			item_id1.put("item_id", "M0001");
//			item.add(item_id1);
//			Map<String, String>item_id2 = new HashMap<>();
//			item_id2.put("item_id", "M0002");
//			item.add(item_id2);
//			Map<String, String>item_id3 = new HashMap<>();
//			item_id3.put("item_id", "M0003");
//			item.add(item_id3);
//			Map<String, String>item_id4 = new HashMap<>();
//			item_id4.put("item_id", "M0004");
//			item.add(item_id4);
//			Map<String, String>item_id5 = new HashMap<>();
//			item_id5.put("item_id", "M0005");
//			item.add(item_id5);
//			Map<String, String>item_id6 = new HashMap<>();
//			item_id6.put("item_id", "M0006");
//			item.add(item_id6);
//			Map<String, String>item_id7 = new HashMap<>();
//			item_id7.put("item_id", "M0007");
//			item.add(item_id7);
//			Map<String, String>item_id8 = new HashMap<>();
//			item_id8.put("item_id", "M0008");
//			item.add(item_id8);
//			Map<String, String>item_id9 = new HashMap<>();
//			item_id9.put("item_id", "M0009");
//			item.add(item_id9);
//			Map<String, String>item_id10 = new HashMap<>();
//			item_id10.put("item_id", "M0010");
//			item.add(item_id10);
			
//			for(int i=0; i<item.size(); i++) {
//				System.out.println(item.get(i));
//			}
			for(int i=0;i<item.size();i++) {
			System.out.println(item.get(i));
			}
			
			//6. 해제(close) -> finally에서 진행
			
			System.out.println("연결성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
//			if(conn != null) {
				try {
					conn.close();
					System.out.println("연결끊기");
				} catch (SQLException e) {}
//			}
				// 해제는 실행한 순서 역순으로
				if(rs != null) try {stmt.close();}catch(Exception e) {};
				if(stmt != null) try {stmt.close();}catch(Exception e) {};
				if(conn != null) try {stmt.close();}catch(Exception e) {};
		}
	}
}
