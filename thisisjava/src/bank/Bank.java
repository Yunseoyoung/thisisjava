package bank;

import java.util.List;

public class Bank { //이건 걍 실행해보는 문이라고 했남

	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
//		AccountVO vo = new AccountVO();
//		vo.setNumber("3333");
//		vo.setOwner("홍길동");
//		vo.setBalance(1000);
//		
//		int r = dao.insert(vo);
//		System.out.println(r);
//		
//		System.out.println(dao.findAccount("3333"));
		
//		List<AccountVO> list = dao.selectAll();
		
//		for(AccountVO vo : list) {
//			System.out.println(vo.getNo() + " "+ vo.getNumber());
//		}
		
		System.out.println(dao.deposit("2222", 500));
		System.out.println("잘된다.");
		dao.close();
	}

}
