package ch12;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.Data;
import lombok.NonNull;
@Data
public class DecimalFormatEx {
	@NonNull
	public static void main(String[] args) {
		// 1000000 데이터에 컴마있으면 replace로 컴마빼기
//		String price = "1,000,000";
//		System.out.println(Integer.parseInt(price.replace(",", "")
//				));
		int price = 1000000;
		DecimalFormat  sdf = new DecimalFormat("#,###");
		System.out.println(sdf.format(price));

		// 반올림
		double d = 3.141592;
		DecimalFormat  sdf2 = new DecimalFormat("#.###");
		System.out.println(sdf2.format(d)); //반올림때도 사용가능

	
		//상품코드 규칙 일련번호 시리얼번호
		
		//상품번호 : 5자리로 -> 00001
		DecimalFormat  sdf3 = new DecimalFormat("00000");
		System.out.println(sdf3.format(123)); //반올림때도 사용가능 //결과값은 무조건 문자열
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("YYYY-MM-dd");
		System.out.println(sdf4.format(new Date()));
		
		
		//정규표현식
		
		Pattern p = Pattern.compile("a[a-zA-Z]*");
//		Pattern p1 = Pattern.compile("abc");
		Matcher m;
		m = p.matcher("abc");//미리 정규식을 컴파일해놓고
		System.out.println(m.matches());
		//게시판에 글 (내용) 작성할때, 내용에 전화번호가 들어있으면 전화번호를 삭제
		String content = "안녕하세요 저는 홍길동입니다 어쩌고 저쩌고... 02-1234-5678 이고, 반갑습니다.";
		content +="... 제 친구 핸드폰번호는요 010-7890-1234";//객체생성이된다.??
		p = Pattern.compile("(\\d{2,3}-\\d{3,4})-(\\d{4})"); //컴파일한번
		m = p.matcher(content); //디비연결시켜서 포문반복 찾는
//		System.out.println(m.find());
		int cnt = 1;
		String newcontent = content;//?뭐지
		while(m.find()) {//디비의 커서와똑같 다음으로 또 내려오고
//			System.out.println(cnt++ +"번째");
//			System.out.println(m.group());
//			System.out.println(m.group(1)+"*****");
			newcontent = newcontent.replace(m.group(),m.group(1)+"****");
		}//여기까지 반복
		System.out.println(newcontent);
		
		
	}

}
