package Example_ArrayList01;

import java.util.ArrayList;// Array ưu tiên cho sắp xếp và truy xuất dữ liệu
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person(1);
        Person p2 = new Person(2);
        Person p3 = new Person(3);
        Person p4 = new Person(4);


        // khai bao list
        //vì List thuộc interface => ko thể new List
        // => Phải new 1 class mà class đó implement Interface (truong hop nay chính là arraylist)
        // dùng đa hình để trỏ tới đối tượng con là Arraylist và có kiểu dl trong <>
        List<Person> listPerson = new ArrayList<Person>();
        //List<Person> list_second = new LinkedList<Person>();// Linkedlist cung duoc inplement tu List
        listPerson.add(p1);
        listPerson.add(p2);
        listPerson.add(p3);
        listPerson.add(p4);
        // truy xuất phần tử thông qua index
        Person p = listPerson.get(0);
        System.out.println(p.getId());
        Person p_second = listPerson.get(3);
        System.out.println(p_second.getId());
        System.out.println("---");
        for (Person person: listPerson) {// lap cac phan tu trong List
            System.out.println(person.getId());
        }
        System.out.println("---");
        for(int i=0;i<listPerson.size();i++){
            System.out.println(listPerson.get(i).getId());// get(i) để lấy đối tượng person,getId để lấy ra Id
        }
        System.out.println("Arraylist sau khi remove phan tu o vi tri thu 3");
        // xoa phan tu
        listPerson.remove(3);
        for (Person person: listPerson) {// lap cac phan tu trong List
            System.out.println(person.getId());
        }
        System.out.println("Arraylist sau khi remove phan tu o vi tri thu 1");
        // xoa phan tu
        listPerson.remove(p1);
        for (Person person: listPerson) {// lap cac phan tu trong List
            System.out.println(person.getId());
        }
        System.out.println("---");
        listPerson.remove(new Person(2));// khac voi Person p2
        for (Person person: listPerson) {// lap cac phan tu trong List, => List lam viec voi cac doi tuong, moi doi tuong ton tai doc lap nhau
            System.out.println(person.getId());
        }// => muon xoa doi tuong nay. Phai override ham equal
    }
}
