package ch19.exam;

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
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class movie {
	public static void main(String[] args) throws IOException {
        String clientId = "QH1b24ZcF5ITOtwWViBl"; //애플리케이션 클라이언트 아이디 
        String clientSecret = "D9m5u1Zoph"; //애플리케이션 클라이언트 시크릿
        //라스트빌드데이트 검색결과생성시간?
        
        Scanner scan = new Scanner(System.in);
        System.out.print("영화검색어를 입력하시오> ");
        String val = scan.nextLine();

        String text = null; //변수먼저선언 밑에서 쓰려고
        
        try {
            text = URLEncoder.encode(val, "UTF-8");//퍼센트어쩌구 던짐
        } catch (UnsupportedEncodingException e) { //던지고이쓰니까 캐치
            throw new RuntimeException("검색어 인코딩 실패",e); //예외 강제 발생
        }
        
        String apiURL = "https://openapi.naver.com/v1/search/movie.json?query=" + text;    // JSON 결과
        
        Map<String, String> requestHeaders = new HashMap<>();
        requestHeaders.put("X-Naver-Client-Id", clientId);
        requestHeaders.put("X-Naver-Client-Secret", clientSecret);
        String responseBody = get(apiURL,requestHeaders); //주소랑 헤더만 넣어주면 오케이
//        System.out.println(responseBody); //출력 끝
        
        
        JSONObject root = new JSONObject(responseBody); //객체
//        System.out.println("total: "+root.getInt("total"));
      
        JSONArray items = root.getJSONArray("items"); //배열 

        for(int i=0; i<items.length();i++) { //반복
        	JSONObject root2 = items.getJSONObject(i); //객체
        	System.out.println("title: " + root2.getString("title"));//속성
        	System.out.println("url: " + root2.getString("link"));
        	System.out.println("썸네일이미지경로: " + root2.getString("image"));
        	System.out.println();
    		
    		

    		
    			}
        
        
        

        

        
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
