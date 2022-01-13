import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class CollectionExample {

	public static void main(String[] args) throws Exception {
		
		
		// 13단원 컬렉션
		// 가변배열 / 배열 같은 모양의 집합을 사용할 때 편하게 사용할 수 있다.
		
		//1. 맵
		//arr[0] = "보노보노"
		//arr[1] = "35"
		//"name" = "보노보노"
		//"age" = "35"
	//	Map map = new HashMap --> 이렇게 사용해도 오류는 나지 않지만 안정성을 위해 제너릭을 추천
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		Map<String, String> map3 = new HashMap<String, String>();
		// 데이터타입의 안정성을 위해서 강제로 부여해주는 것, 제너릭
		
		// 값을 넣는다.
		map.put("name", "보노보노");
		map.put("age", "35");
		
		map2.put("name", "포로리");
		map2.put("age", "25");
		
		map3.put("name", "너부리");
		map3.put("age", "15");
		
		//값을 꺼낸다.
		System.out.println(map.get("name"));
		
		// List
		// 가변배열
	//	List list = new ArrayList();
		
		//제너릭(List<Map>) : 난 Map 객체만 받겠어
		List<Map> list = new ArrayList<Map>(); 
		
		// 값을 넣는다.
		list.add(map);		//일반적으로 배열은 고정되어 있으나 가변배열은 내가 add를 할 때마다 배열이 하나씩 늘어남
		list.add(map2);
		list.add(map3);
				
		System.out.println(list.size());
	
		//값 꺼낸다.
		((Map)list.get(0)).get("name");	//꺼내오기 예제
		list.get(1);
		list.get(2);
		
		//Quiz for문으로 위에 정의된 list를 아래와 같이 출력하는 프로그램을 만들어라.
		//이름: 보노보노, 나이: 35
		
		for(int i=0; i<list.size(); i++){
			//제너릭(List<Map>)이 아닐때는 형변환이 필요
			System.out.println("이름 : " 
							+ ((Map)list.get(i)).get("name")
							+ ", 나이 : "
							+((Map)list.get(i)).get("age"));
	
			//제너릭(List<Map>) : List는 Map 객체만 받기 때문에 강제형변환이 필요하지 않다.
			System.out.println("이름 : "
							+list.get(i).get("name"));
		
		}
		
		//List 컬렉션의 "향상된 For문" 
		// foreach
		for(Map item : list) {  //item이라는 변수에 list를 자동으로 하나씩 대입함
			System.out.println("이름 : "+item.get("name")
							+", 나이 : "+item.get("age"));
		}
		
	}

}