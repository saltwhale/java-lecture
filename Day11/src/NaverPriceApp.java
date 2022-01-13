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
		
		//java NaverPriceApp �ƺ����� 2000000 3000000
		
		//-- ����ڰ� ��Ģ�� ���� �ƺ����� 2000000 3�鸸�� �̶� ���� �־��� ��,
		//-- maxPrice���� 3�鸸���� Integer�� ��ȯ�� �Ұ��ϹǷ� Exception�� �߻���Ų��.
//		String goodsName = args[0];
//		int minPrice = Integer.parseInt(args[1]);
//		int maxPrice = Integer.parseInt(args[2]);
		// Run As -> Run Configurations -> Arguments -> Program arguments 0 1 2 ������� �� �Է�
		
		// Exception (����) ó���ϴ� ���
		//1. �����ڰ� ó���ϴ� ���
		// try {} catch() {} finally {}
		
		String goodsName = "";
		int minPrice = 0, maxPrice = 0;
		
		try {
			goodsName = args[0];
			minPrice = Integer.parseInt(args[1]);
			maxPrice = Integer.parseInt(args[2]);
		} catch(NumberFormatException ne) {
			//-- try ���� �߿� NumberFormatException�� �߻��� ��� ����
			System.out.println("���� > java NaverPriceApp ��ǰ�� �ּҰ��� �ְ���");
			System.out.println("ex > java NaverPriceApp �����е� 500000 1000000");
//			return;
		} catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("3�� �־� �� ������.");
//			return;
		} catch(Exception ex) {
			System.out.println("����ü �� �����ž�?");
//			return;
		} finally {
			System.out.println("��ħ��...");
		}
		
		String URL = "https://search.shopping.naver.com/search/all?maxPrice=%d&minPrice=%d&productSet=total&query=%s&sort=price_asc";
		URL = String.format(URL, maxPrice, minPrice, goodsName);
		System.out.println(URL);
		
		// html  ML = Markup Language
		// <name>���뺸��</name>�� ���� <home>���ε�</home>�̴�
		
		
		// --1. java.net ��Ű�� ����ϱ�
		//String html = getHtml(URL);
		//System.out.println(html);
			
		getHtmlByJsoup(URL);
		
		//String.format(URL, args) // format = String Ŭ������ static �޼ҵ�
		
//		//'���θ�'�� '��'�� '���θ���' �Դϴ�.
//		String name = "���θ�";
//		String home = "��";
//		String dong = "��";
//		
//		System.out.println(name + "��" + home + " ��" + dong + " �Դϴ�."); 
//		
//		String format = "%s�� %s�� %s �Դϴ�. %d"; // %s == ���ڿ�, %d == ����
//		format = String.format(format, name, home, dong, 10000);
//		System.out.println(format);
		
	}
	
	
	//-----JSoup �� HTML Parse
	private static void getHtmlByJsoup (String pUrl) throws IOException, Exception {
		
		Connection conn = Jsoup.connect(pUrl);
		Document html = conn.get();					//conn.get();�� IOException�� ����ų �� �ִ�. �� ��� try~catch���� ����ϰų� throws�� �ؾ��Ѵ�.
		//System.out.println(html.toString());			
		
		//Elements files = html.select(".list_basis");
		Elements files = html.select(".list_basis > div > div");
		writeTxtFile("d:\\price.txt", files);			//�ؽ�Ʈ���� �����
		writeExcelFile("d:\\price.csv", files);			//�������� �����
		
//		System.out.println(".list_basis�� ���� : " + files.size());
		
		//for(int i = 0; i<files.size(); i++) {
		//	System.out.println(files.get(i).text());
		//}
		
		//List<Element>
//		for (Element item : files) {
//			//System.out.println(item.text());
//			String goodsName = item.select(".basicList_link__1MaTN").text();
//			String price = item.select(".price_num__2WUXn").text();
//			String link = item.select(".basicList_link__1MaTN").attr("href"); //attr - �Ӽ� ������
//			
//			System.out.println(goodsName + " " +price);
//			System.out.println(link);
//		}
		
		
		
	}
	
	//�ؽ�Ʈ���� �����
	private static void writeTxtFile (String fileName, Elements list) throws Exception {
		
		File file = new File(fileName); //file = d"\price.txt
		BufferedWriter writer = null;
		
		String lineFormat = "%s %s link:%s\r\n";
		String result = "";
		
		for (Element item : list) {
			//System.out.println(item.text());
			String goodsName = item.select(".basicList_link__1MaTN").text();
			String price = item.select(".price_num__2WUXn").text();
			String link = item.select(".basicList_link__1MaTN").attr("href"); //attr - �Ӽ� ������
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
	
	// �������� �����
	private static void writeExcelFile (String fileName, Elements list) throws Exception {
		
		File file = new File(fileName); //file = d"\price.csv
		BufferedWriter writer = null;
		
		String lineFormat = "%d, %s,%s,link:%s\r\n";
		String result = "����,��ǰ��,����,��ũ\r\n";
		int i = 1;
		
		for (Element item : list) {
			//System.out.println(item.text());
			String goodsName = item.select(".basicList_link__1MaTN").text();
			String price = item.select(".price_num__2WUXn").text().replace(",","");
			String link = item.select(".basicList_link__1MaTN").attr("href"); //attr - �Ӽ� ������
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
	// ----URL�� ������, ����, HTML ������ ������ �´�.
	private static String getHtml(String pUrl) throws Exception {
		
		String result = "";
		
		HttpURLConnection conn;		// �� ���� Ŭ����
		BufferedReader rd;			// ���δ��� Input Ŭ����
		String line;				// ���δ����� ���� String�� �ӽ� ���� 
		
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

