package communityuni.com;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex_HashMap {

	static HashMap<Integer, String> map = new HashMap<Integer, String>();// khai bao hashmap 
	public static void menu() {
		System.out.println("1:Them");
		System.out.println("2:Xuat");
		System.out.println("3:Sua");
		System.out.println("4:Xoa");
		System.out.println("5:Tim Kiem");
		System.out.println("6:Thoat");
		System.out.println("Moi ban nhap vao lua chon : ");
		int chose = new Scanner(System.in).nextInt();
		switch(chose)
		{
		case 1:
			them();
			break;
		case 2:
			xuat();
			break;
		case 3:
			sua();
			break;
		case 4:
			xoa();
			break;
		case 5:
			timkiem();
			break;
		case 6:
			thoat();
			break;
		}
	}
	
	private static void thoat() {
		// TODO Auto-generated method stub
		System.out.println("cam on ban da tham gia tro choi ");
		System.exit(0);
	}

	private static void timkiem() {
		// TODO Auto-generated method stub
		System.out.println("Nhap ten sach muon tim : ");
		String ten = new Scanner(System.in).nextLine();
		for(Map.Entry<Integer, String> item : map.entrySet())
		{
			if(item.getValue().contains(ten))
			{
				System.out.println(item.getKey()+ "-"+item.getValue());
			}
		}
	}

	private static void xoa() {
		// TODO Auto-generated method stub
		System.out.println("Moi ban nhap ma muon xoa :");
		int ma = new Scanner(System.in).nextInt();
		if(map.containsKey(ma)==false)
		{
			System.out.println("Ma "+ma+" Khong ton tai trong map !");
		}
		else
		{
			map.remove(ma);
		}
	}

	private static void sua() {
		// TODO Auto-generated method stub
		System.out.println("Moi ban nhap vao ma muon sua ");
		int ma = new Scanner(System.in).nextInt();
		if(map.containsKey(ma)==false)
		{
			System.out.println("Ma khong ton tai ");
		}
		else
		{
			System.out.println("Nhap ten sach moi ");
			String ten = new Scanner(System.in).nextLine();
			map.put(ma, ten);
		}
		
	}

	private static void xuat() {
		// TODO Auto-generated method stub
		System.out.println("Ma\tTensach");
		for(Map.Entry<Integer, String> item : map.entrySet())
		{
			System.out.println(item.getKey()+ "\t"+item.getValue());
		}
	}

	private static void them() {
		// TODO Auto-generated method stub
		System.out.println("Nhap khoa chinh : ");
		int ma = new Scanner(System.in).nextInt();
		System.out.println("Nhap ten sach : ");
		String ten = new Scanner(System.in).nextLine();
		if(map.containsKey(ma)==false)
		{
			map.put(ma, ten);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		while(true)
		{
			menu();
		}
	}

}
