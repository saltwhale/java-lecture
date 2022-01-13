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
		
		
		// 13�ܿ� �÷���
		// �����迭 / �迭 ���� ����� ������ ����� �� ���ϰ� ����� �� �ִ�.
		
		//1. ��
		//arr[0] = "���뺸��"
		//arr[1] = "35"
		//"name" = "���뺸��"
		//"age" = "35"
	//	Map map = new HashMap --> �̷��� ����ص� ������ ���� ������ �������� ���� ���ʸ��� ��õ
		Map<String, String> map = new HashMap<String, String>();
		Map<String, String> map2 = new HashMap<String, String>();
		Map<String, String> map3 = new HashMap<String, String>();
		// ������Ÿ���� �������� ���ؼ� ������ �ο����ִ� ��, ���ʸ�
		
		// ���� �ִ´�.
		map.put("name", "���뺸��");
		map.put("age", "35");
		
		map2.put("name", "���θ�");
		map2.put("age", "25");
		
		map3.put("name", "�ʺθ�");
		map3.put("age", "15");
		
		//���� ������.
		System.out.println(map.get("name"));
		
		// List
		// �����迭
	//	List list = new ArrayList();
		
		//���ʸ�(List<Map>) : �� Map ��ü�� �ްھ�
		List<Map> list = new ArrayList<Map>(); 
		
		// ���� �ִ´�.
		list.add(map);		//�Ϲ������� �迭�� �����Ǿ� ������ �����迭�� ���� add�� �� ������ �迭�� �ϳ��� �þ
		list.add(map2);
		list.add(map3);
				
		System.out.println(list.size());
	
		//�� ������.
		((Map)list.get(0)).get("name");	//�������� ����
		list.get(1);
		list.get(2);
		
		//Quiz for������ ���� ���ǵ� list�� �Ʒ��� ���� ����ϴ� ���α׷��� ������.
		//�̸�: ���뺸��, ����: 35
		
		for(int i=0; i<list.size(); i++){
			//���ʸ�(List<Map>)�� �ƴҶ��� ����ȯ�� �ʿ�
			System.out.println("�̸� : " 
							+ ((Map)list.get(i)).get("name")
							+ ", ���� : "
							+((Map)list.get(i)).get("age"));
	
			//���ʸ�(List<Map>) : List�� Map ��ü�� �ޱ� ������ ��������ȯ�� �ʿ����� �ʴ�.
			System.out.println("�̸� : "
							+list.get(i).get("name"));
		
		}
		
		//List �÷����� "���� For��" 
		// foreach
		for(Map item : list) {  //item�̶�� ������ list�� �ڵ����� �ϳ��� ������
			System.out.println("�̸� : "+item.get("name")
							+", ���� : "+item.get("age"));
		}
		
	}

}