package communityuni.com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;



public class TestHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Linh");
		map.put(2, "Huong");
		map.put(3, "Lan");
		map.put(4, "Chi");
		Collection<String> dsten = map.values();				
		for(String ten : dsten)
		{
			System.out.println(ten);
		}
		System.out.println("danh sach ma : ");
		Set<Integer> dsma = map.keySet();
		for(int ma : dsma)
		{
			System.out.println(ma);
		}
		// truy xuat bat ky phan tu nao do thong qua khoa chinh
		System.out.println("--------lay ra phan tu thu 2 --------");
		String ten  = map.get(2);
		System.out.println(ten);
		System.out.println("----------ds sau khi chen-----------");
		//if(map.containsKey(3)==false)
		map.put(3, "Cham");
		dsten = map.values();				
		for(String ten2 : dsten)
		{
			System.out.println(ten2);
		}
		System.out.println("------------ds sau khi xoa------------");
		map.remove(4);
		for(String ten1 : dsten)
		{
			System.out.println(ten1);
		}
		
		System.out.println("danh sach sau khi clear ");
		map.clear();
		System.out.println("so phan tu con lai = "+map.size());

































	}

}