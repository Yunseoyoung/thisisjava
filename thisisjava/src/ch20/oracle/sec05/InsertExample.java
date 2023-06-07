package ch20.oracle.sec05;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null; //여기에해야 트라이안과밖가능
		ResultSet rs = null; //다 인터페이스 자바에서 만들어놓은
		
		try {
			//1. 드라이버 로드
		
			Class.forName("oracle.jdbc.OracleDriver"); //드라이버 로드 메모리에 띄움

			
			
			//2. DB 접속
			conn = DriverManager.getConnection( //로드된 드라이버통해서 접속
					"jdbc:oracle:thin:@localhost:1521/xe",
							"testuser",
							"test1234"
							
							
					
					
					);//에스큐엘이랑 처리하는부분만달라진다 다른거할때
			// 3. statement 객체 생성
			String sql = "INSERT INTO emp_ex (empno, ename, salary) VALUES (emp_ex_seq.nextval, ?,?)";

			pstmt = conn.prepareStatement(sql);
			
			//4. sql 실행(처리)

			
			// 
//			String sql = "SELECT * FROM student"; //나중엔 rownum sql 길어지고 검색 웨어
			pstmt.setString(1, "서민구");
			pstmt.setInt(2, 1000);
			
			int r = pstmt.executeUpdate();
			
			//5. 결과처리
			//커서 형태임
			//데이터담기면 커서가 원래데이터보다 한칸위부터 시작 이때 데이터가져오면 안가져와짐
			//한칸뒤가서 겟하면꺼내짐 헤즈넥스트랑 똑같 넥스트가 트루폴스까지 같이 다음꺼있니 트루리턴
			//리절트객체가 트루일때까지 반복
//			while(rs.next()) {
//				System.out.println(rs.getString("name")+" "+rs.getString("id")); //인덱스는 순서땜에 보통컬럼명씀
//			}
			if (r>0) System.out.println("정상적으로 등록되었습니다."); //한번이라도 등록이됐다 
			
			//6.해제 (close) ->finally
			//어차피 프로그램중단알아서닫힘그래도해제해줘야돼 파이널ㄹ리에서
			//만약에 위에ㅓㅅ 에러나면 실행안돼서 파이널리에서하자
			//4번 5번은 작성 나머지는 카피 빨리할수있고 안전 오타줄이고 속도 4,5번핵심
			
			System.out.println("연결 성공");
		}catch (Exception e) { //익셉션 중 최상위클래스로 다잡기
			e.printStackTrace();
//		}catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}catch (SQLException e) {
//			e.printStackTrace();
		}finally { //예외발생하든안하든실행

			if(rs != null) try {rs.close();} catch (Exception e) {} //간결심플 //나중에나온걸먼저함 해제할때 역순으로함
			if(pstmt != null) try {pstmt.close();} catch (Exception e) {}
			if(conn != null) try {conn.close();} catch (Exception e) {}
			//알에스먼저하고 스테먼트하고 컨넥션
			//실행한 순서의 역순으로 해제하자 커넥션먼저해제하면 스테먼트 사라지는경우있어서 해제할때는역순 상관없는 프로그램도있지만 걍해라
		}

	}

}
