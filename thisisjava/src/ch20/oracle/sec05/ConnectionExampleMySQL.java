//package ch20.oracle.sec05;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Scanner;
//
//public class ConnectionExampleMySQL {
//	static int size =0;
////	static Account[] account = new Account[100];
//	public static void exit() {
//		System.exit(0);
//	}
//	public void mainMenu() {
//		
//	}
//	
//	public static void main(String[] args) { //메인
//		
//		
//		Connection conn = null;
//		PreparedStatement pstmt = null; //여기에해야 트라이안과밖가능
//		ResultSet rs = null; //다 인터페이스 자바에서 만들어놓은
//		
//		try {
//			//1. 드라이버 로드
//		
//			Class.forName("com.mysql.cj.jdbc.Driver"); //드라이버 로드 메모리에 띄움
//
//			
//			
//			//2. DB 접속 //로드된 드라이버통해서 접속
//			conn = DriverManager.getConnection( "jdbc:mysql://localhost:3306/test", "testuser", "test1234");
//
//			// 3. statement 객체 생성
//			String sql = "INSERT INTO account (idaccount, number, owner, balance) VALUES (emp_ex_seq.nextval, ?,?,?,?)";
////			pstmt = conn.prepareStatement(sql);
//			
//			//4. sql 실행(처리)
//
//			
//			// 
//			
//			
//			//5. 결과처리
//		
//			while(rs.next()) {
//				System.out.println(rs.getString("name")+" "+rs.getString("id")); //인덱스는 순서땜에 보통컬럼명씀
//			}
//			
//			//6.해제 (close) ->finally
//
//			
//			System.out.println("연결 성공");
//		}catch (Exception e) { //익셉션 중 최상위클래스로 다잡기
//			e.printStackTrace();
//
//		}finally { //예외발생하든안하든실행
//
//			if(rs != null) try {rs.close();} catch (Exception e) {} //간결심플 //나중에나온걸먼저함 해제할때 역순으로함
//			if(pstmt != null) try {pstmt.close();} catch (Exception e) {}
//			if(conn != null) try {conn.close();} catch (Exception e) {}
//
//		}
//
//		boolean flag = true;
//		Scanner scan = new Scanner(System.in);
//		while(flag) {
//			System.out.println("----------------------------");
//			System.out.println("1.계좌등록|2.계좌목록|3.예금|4.출금|5.종료");
//			System.out.println("----------------------------");
//			System.out.println("선택> ");
//			String input = scan.nextLine();
//			
//			if("1".equals(input)) {
//				System.out.println("---------");
//				System.out.println("계좌등록");
//				System.out.println("---------");
//				
//				System.out.println("계좌번호: ");
//				String number = scan.nextLine();
//				
//				System.out.println("계좌주: ");
//				String owner = scan.nextLine();
//				
//				System.out.println("초기입금액: ");
//				int price = Integer.parseInt(scan.nextLine());
//				Account acc = searchAccount(number);
//				if(acc==null) {
//					account[size] = new Account(number
//							,owner,price);
//					++size;
//					System.out.println("결과: 계좌가 등록되었습니다.");
//				}else {
//					System.out.println("존재하는 계좌번호가 아닙니다.");
//				}		
//				
//			}else if("2".equals(input)) {
//				public void list() {
//				System.out.println("---------");
//				System.out.println("계좌목록");
//				System.out.println("---------");
//				
//				try {
//					String sql = "" +
//				"SELECT idaccount, number, owner, balance " +
//				"FROM account ";
////				PreparedStatement pstmt = conn.prepareStatement(sql);
////				ResultSet rs = pstmt.executeQuery();
//				
//				while(rs.next()) {
//					Account account = new Account();
//					account.setIdaccount(rs.getInt(size));
//					account.setNumber(rs.getString("number"));
//					account.setOwner(rs.getString("owner"));
//					account.setBalance(rs.getInt("balance"));
////					System.out.println(
////							account.getIdaccount(),
////							account.getNumber(),
////							account.getOwner(),
////							account.getBalance());
//				}
//				rs.close();
//				pstmt.close();
//				
//				}catch(Exception e) {
//					e.printStackTrace();
//					exit();
//				}
//			
//				}
//				
//			}else if("3".equals(input)) {
//				System.out.println("---------");
//				System.out.println("예금");
//				System.out.println("---------");
//				System.out.println("계좌번호: ");
//				String number = scan.nextLine();
//				System.out.println("예금액: ");
//				int price = Integer.parseInt(scan.nextLine());
//				try {
//					String sql = ""+
//				"INSERT INTO account (idaccount, number, owner, balance) " + 
//							"VALUES"
//				}
//				Account acc = searchAccount(number);
//				if(acc == null) {
//					System.out.println("존재하지 않는 계좌번호입니다.");
//				}else {
//					acc.setBalance(acc.getBalance()+price);
//				}
//				
//				
//			}else if("4".equals(input)) {
//				System.out.println("---------");
//				System.out.println("출금");
//				System.out.println("---------");
//				System.out.println("계좌번호: ");
//				String number = scan.nextLine();
//				System.out.println("출금액: ");
//				int price = Integer.parseInt(scan.nextLine());
//				Account acc = searchAccount(number);
//				if(acc == null) {
//					System.out.println("존재하지 않는 계좌번호입니다.");
//				}else {
//					acc.setBalance(acc.getBalance()+price);
//				}
//				
//			}else if("5".equals(input)) {
//				if(rs != null) try {rs.close();} catch (Exception e) {} //간결심플 //나중에나온걸먼저함 해제할때 역순으로함
//				if(pstmt != null) try {pstmt.close();} catch (Exception e) {}
//				if(conn != null) try {conn.close();} catch (Exception e) {}
//				System.out.println("프로그램 종료");
//				flag = false;
//			}
//		}
//		
//	}
//	
//	
//
//
//}
//
//
//
