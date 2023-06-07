package ch19.sec06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

public class NaverAPI {
	 public static void main(String[] args) {
	        String clientId = "QH1b24ZcF5ITOtwWViBl"; //애플리케이션 클라이언트 아이디 
	        String clientSecret = "D9m5u1Zoph"; //애플리케이션 클라이언트 시크릿
	        //라스트빌드데이트 검색결과생성시간?

	        String text = null; //변수먼저선언 밑에서 쓰려고
	        try {
	            text = URLEncoder.encode("슬램덩크", "UTF-8");//퍼센트어쩌구 던짐
	        } catch (UnsupportedEncodingException e) { //던지고이쓰니까 캐치
	            throw new RuntimeException("검색어 인코딩 실패",e); //예외 강제 발생
	        }//예외처리 해석시에는 중요하지않음

	        //blog.json 써도 되고 똑같음 슬램덩크가 퍼센트어쩌고로 바귄값이 뒤에 들어감
	        
	        String apiURL = "https://openapi.naver.com/v1/search/blog?query=" + text;    // JSON 결과
	        //String apiURL = "https://openapi.naver.com/v1/search/blog.xml?query="+ text; // XML 결과
	        //예외발생하면 널
	        
	        //해시맵객체 키는 스트링으로 밸류는 스트링
	        Map<String, String> requestHeaders = new HashMap<>();
	        requestHeaders.put("X-Naver-Client-Id", clientId);
	        requestHeaders.put("X-Naver-Client-Secret", clientSecret);
	        String responseBody = get(apiURL,requestHeaders); //주소랑 헤더만 넣어주면 오케이
	        //아까 주소랑 리케스트 헤더랑 실행한 리턴값이 담김 이름만봐도 변수명만봐도 리턴이 스트링이름이 겟 변수명이 apiurl 안들어가봐도 뻔함
	        //요청해서 헤더까지 같이 넣어서 응답하는 결과를 겟방식을 ㅗ 받아서 스트링으로 응답받은 바디를 내용을 담아
	        //담는
	        //어떻게 가져올지 중요한게 아니니까 안들어가봐도됨
	        //예측하고 들어가봐야함 추측하고 메서드 들어가서 보기
	        
	        

	        System.out.println(responseBody); //출력 끝
	    }


	    private static String get(String apiUrl, Map<String, String> requestHeaders){
	        HttpURLConnection con = connect(apiUrl);
	        try {
	            con.setRequestMethod("GET");
	            for(Map.Entry<String, String> header :requestHeaders.entrySet()) {
	                con.setRequestProperty(header.getKey(), header.getValue());
	            }


	            int responseCode = con.getResponseCode();
	            if (responseCode == HttpURLConnection.HTTP_OK) { // 정상 호출
	                return readBody(con.getInputStream());
	            } else { // 오류 발생
	                return readBody(con.getErrorStream());
	            }
	        } catch (IOException e) {
	            throw new RuntimeException("API 요청과 응답 실패", e);
	        } finally {
	            con.disconnect();
	        }
	    }


	    private static HttpURLConnection connect(String apiUrl){
	        try {
	            URL url = new URL(apiUrl);
	            return (HttpURLConnection)url.openConnection();
	        } catch (MalformedURLException e) {
	            throw new RuntimeException("API URL이 잘못되었습니다. : " + apiUrl, e);
	        } catch (IOException e) {
	            throw new RuntimeException("연결이 실패했습니다. : " + apiUrl, e);
	        }
	    }


	    private static String readBody(InputStream body){
	        InputStreamReader streamReader = new InputStreamReader(body);


	        try (BufferedReader lineReader = new BufferedReader(streamReader)) {
	            StringBuilder responseBody = new StringBuilder();//계속추가추가


	            String line;
	            while ((line = lineReader.readLine()) != null) {
	                responseBody.append(line);
	            }


	            return responseBody.toString(); //문자열로리턴
	        } catch (IOException e) {
	            throw new RuntimeException("API 응답을 읽는 데 실패했습니다.", e);
	        }
	    }
}
