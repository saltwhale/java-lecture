import java.io.*;
import java.net.*;
import java.util.*;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class NaverPriceApp {
	
	public static void main(String[] args) throws Exception {
		
		//java NaverPriceApp 맥북프로 2000000 3000000
		
		//-- 사용자가 규칙을 어기고 맥북프로 2000000 3백만원 이란 값을 넣었을 때,
		//-- maxPrice에는 3백만원은 Integer로 변환이 불가하므로 Exception을 발생시킨다.
//		String goodsName = args[0];
//		int minPrice = Integer.parseInt(args[1]);
//		int maxPrice = Integer.parseInt(args[2]);
		// Run As -> Run Configurations -> Arguments -> Program arguments 0 1 2 순서대로 값 입력
		
		// Exception (예외) 처리하는 방법
		//1. 개발자가 처리하는 방식
		// try {} catch() {} finally {}
		
		String goodsName = "";
		int minPrice = 0, maxPrice = 0;
		
		try {
			goodsName = args[0];
			minPrice = Integer.parseInt(args[1]);
			maxPrice = Integer.parseInt(args[2]);
		} catch(NumberFormatException ne) {
			//-- try 구문 중에 NumberFormatException이 발생할 경우 실행
			System.out.println("사용법 > java NaverPriceApp 상품명 최소가격 최고가격");
			System.out.println("ex > java NaverPriceApp 아이패드 500000 1000000");
//			return;
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("3개 넣어 이 새끼야.");
//			return;
		} catch(Exception ex) {
			System.out.println("도대체 뭘 넣은거야?");
//			return;
		} finally {
			System.out.println("마침내...");
		}
		
		String URL = "https://search.shopping.naver.com/search/all?maxPrice=%d&minPrice=%d&productSet=total&query=%s&sort=price_asc";
		URL = String.format(URL, maxPrice, minPrice, goodsName);
		System.out.println(URL);
		
		// html  ML = Markup Language
		// <name>보노보노</name>는 집이 <home>구로동</home>이다
		
		
		// --1. java.net 패키지 사용하기
		//String html = getHtml(URL);
		//System.out.println(html);
			
		getHtmlByJsoup(URL);
		
		//String.format(URL, args) // format = String 클래스의 static 메소드
		
//		//'포로리'의 '집'은 '포로리산' 입니다.
//		String name = "포로리";
//		String home = "집";
//		String dong = "산";
//		
//		System.out.println(name + "의" + home + " 은" + dong + " 입니다."); 
//		
//		String format = "%s의 %s은 %s 입니다. %d"; // %s == 문자열, %d == 숫자
//		format = String.format(format, name, home, dong, 10000);
//		System.out.println(format);
		
	}
	
	
	//-----JSoup 로 HTML Parse
	private static void getHtmlByJsoup (String pUrl) throws IOException, Exception {
		
		Connection conn = Jsoup.connect(pUrl);
		Document html = conn.get();					//conn.get();은 IOException을 일으킬 수 있다. 이 경우 try~catch문을 사용하거나 throws를 해야한다.
		//System.out.println(html.toString());			
		
		//Elements files = html.select(".list_basis");
		Elements files = html.select(".list_basis > div > div");
		writeTxtFile("d:\\price.txt", files);			//텍스트파일 만들기
		writeExcelFile("d:\\price.csv", files);			//엑셀파일 만들기
		
//		System.out.println(".list_basis의 길이 : " + files.size());
		
		//for(int i = 0; i<files.size(); i++) {
		//	System.out.println(files.get(i).text());
		//}
		
		//List<Element>
//		for (Element item : files) {
//			//System.out.println(item.text());
//			String goodsName = item.select(".basicList_link__1MaTN").text();
//			String price = item.select(".price_num__2WUXn").text();
//			String link = item.select(".basicList_link__1MaTN").attr("href"); //attr - 속성 들고오기
//			
//			System.out.println(goodsName + " " +price);
//			System.out.println(link);
//		}
		
		
		
	}
	
	//텍스트파일 만들기
	private static void writeTxtFile (String fileName, Elements list) throws Exception {
		
		File file = new File(fileName); //file = d"\price.txt
		BufferedWriter writer = null;
		
		String lineFormat = "%s %s link:%s\r\n";
		String result = "";
		
		for (Element item : list) {
			//System.out.println(item.text());
			String goodsName = item.select(".basicList_link__1MaTN").text();
			String price = item.select(".price_num__2WUXn").text();
			String link = item.select(".basicList_link__1MaTN").attr("href"); //attr - 속성 들고오기
			result += String.format(lineFormat, goodsName, price, link);
		}
		
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(result);
		} catch (IOException ie) {
			
		} finally {
			if(writer !=null) writer.close();	
		}
	}
	
	// 엑셀파일 만들기
	private static void writeExcelFile (String fileName, Elements list) throws Exception {
		
		File file = new File(fileName); //file = d"\price.csv
		BufferedWriter writer = null;
		
		String lineFormat = "%d, %s,%s,link:%s\r\n";
		String result = "순위,상품명,가격,링크\r\n";
		int i = 1;
		
		for (Element item : list) {
			//System.out.println(item.text());
			String goodsName = item.select(".basicList_link__1MaTN").text();
			String price = item.select(".price_num__2WUXn").text().replace(",","");
			String link = item.select(".basicList_link__1MaTN").attr("href"); //attr - 속성 들고오기
			result += String.format(lineFormat, i++, goodsName, price, link);
		}
		
		try {
			writer = new BufferedWriter(new FileWriter(file));
			writer.write(result);
		} catch (IOException ie) {
			
		} finally {
			if(writer !=null) writer.close();	
		}
	}
	
	
	// --- java.net.pakage
	// ----URL을 가지고, 접속, HTML 파일을 가지고 온다.
	private static String getHtml(String pUrl) throws Exception {
		
		String result = "";
		
		HttpURLConnection conn;		// 웹 연결 클래스
		BufferedReader rd;			// 라인단위 Input 클래스
		String line;				// 라인단위로 읽을 String을 임시 저장 
		
		URL url = new URL(pUrl);
		conn = (HttpURLConnection)url.openConnection();
		conn.setRequestMethod("GET");
		
		rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		while((line = rd.readLine()) !=null) {
			result += line + "\n"; 	//result = result + line + "\n"
		}
		
		rd.close();
		
		return result;
		
	}

}

