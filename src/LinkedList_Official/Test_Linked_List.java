package LinkedList_Official;
import java.util.LinkedList;


public class Test_Linked_List {
    public static void main(String[] args) {
        Linked_List.Node n1 = new Linked_List.Node(1);  // Tạo 1 đối tượng Node (vị trí đầu tiên)
        Linked_List.Node n2 = new Linked_List.Node(2);
        Linked_List.Node n3 = new Linked_List.Node(3);
        //Linked_List.Node n4 = new Linked_List.Node(4);


        // nối các Node
        n1.next = n2;
        n2.next = n3;
        //n3.next = n4;
        Linked_List.printLinkedList(n1);    // Xuất ra kể từ n1
//        Linked_List.printLinkedList(n2);
//        Linked_List.printLinkedList(n3);

        //n1 = Linked_List.addToHead(n1,0);   // update n1(them dau)
        //Linked_List.printLinkedList(n1);
        //n1 = Linked_List.addToTail(n1, 4);  // them cuoi
        //Linked_List.printLinkedList(n1);

//        n1 = Linked_List.addToIndex(n1,0,0);
//        Linked_List.printLinkedList(n1);
//        n1 = Linked_List.addToTail(n1, 5);  // them cuoi
//        Linked_List.printLinkedList(n1);
//        n1 = Linked_List.addToIndex(n1,4, 4);
//        Linked_List.printLinkedList(n1);

//        n1 = Linked_List.removeAtHead(n1);
//        Linked_List.printLinkedList(n1);
//        n1 = Linked_List.removeAtHead(n1);
//        Linked_List.printLinkedList(n1);

//        n1 = Linked_List.removeAtTail(n1);
//        Linked_List.printLinkedList(n1);
//        n1 = Linked_List.removeAtTail(n1);
//        Linked_List.printLinkedList(n1);

        n1 = Linked_List.removeAtIndex(n1,1);
        Linked_List.printLinkedList(n1);

    }
}
