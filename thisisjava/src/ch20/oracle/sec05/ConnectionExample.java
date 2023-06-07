package ch20.oracle.sec05;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionExample {

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null; //여기에해야 트라이안과밖가능
		ResultSet rs = null; //다 인터페이스 자바에서 만들어놓은
		
		try {
			//1. 드라이버 로드
		
			Class.forName("com.mysql.cj.jdbc.Driver"); //드라이버 로드 메모리에 띄움

			
			
			//2. DB 접속 //로드된 드라이버통해서 접속
			conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test", "testuser", "test1234");

			// 3. statement 객체 생성
			stmt = conn.createStatement();
			
			//4. sql 실행(처리)

			
			// 
			String sql = "SELECT * FROM student"; //나중엔 rownum sql 길어지고 검색 웨어
			rs = stmt.executeQuery(sql);
			
			//5. 결과처리
		
			while(rs.next()) {
				System.out.println(rs.getString("name")+" "+rs.getString("id")); //인덱스는 순서땜에 보통컬럼명씀
			}
			
			//6.해제 (close) ->finally

			
			System.out.println("연결 성공");
		}catch (Exception e) { //익셉션 중 최상위클래스로 다잡기
			e.printStackTrace();

		}finally { //예외발생하든안하든실행

			if(rs != null) try {rs.close();} catch (Exception e) {} //간결심플 //나중에나온걸먼저함 해제할때 역순으로함
			if(stmt != null) try {stmt.close();} catch (Exception e) {}
			if(conn != null) try {conn.close();} catch (Exception e) {}

		}

	}

}
