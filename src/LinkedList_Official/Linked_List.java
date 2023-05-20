package LinkedList_Official;

public class Linked_List{

     public static class Node{     // tạo Node
         int value;
         Node next;
         Node(int value){   // tạo giá trị (value) cho Node
             this.value = value;
         }
     }
     public static void printLinkedList(Node head){
         if(head == null){  //Kiem tra gia tri dau vao (neu List = null)
             System.out.println("list is empty!");
         }
         else {
             Node temp = head;  //  gán 1 biến temp = node đầu tiên
             while (temp != null){
                 System.out.print(temp.value);
                 temp = temp.next;
                 if(temp != null){  // makeup
                     System.out.print("=>");
                 }
                 else{
                     System.out.println();
                 }
             }
         }
     }

     public static Node addToHead(Node headNode, int value){
         Node newNode = new Node(value);    // Tạo 1 node mới
         if(headNode != null){
             newNode.next = headNode;
         }
         return newNode;
     }

     public static Node addToTail(Node headNode, int value){
         Node newNode = new Node(value);    // Tạo 1 node mới
         if(headNode == null){  //Neu List rong
             return newNode;
         }
         else {     // Xac dinh phan tu Last va tro last vao newNode
             // B1 Xac dinh lastNode (LastNode.next = null)
             Node lastNode = headNode;
             while (lastNode.next != null){
                 lastNode = lastNode.next;
             }
             // B2 gan next cho lastNode = new Node
             lastNode.next = newNode;
         }
         return headNode;
     }

     public static Node addToIndex(Node headNode, int value, int index){
         if(index == 0){
             return addToHead(headNode,value);  // Them vao dau
         }
         else {
             // B1 Tim vi tri can them
             Node newNode = new Node(value);
             Node currNode = headNode;
             int count=0;
             while(currNode!=null){ // Neu list khong bi rong
                 count++;
                 if(count==index){
                    // adding
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                     break;
                 }
                 currNode = currNode.next;
             }

         }
         return headNode;
     }

     public static Node removeAtHead(Node headNode){
        if(headNode!=null){
            return headNode.next;
        }
        return headNode;
     }

     public static Node removeAtTail(Node headNode){
         if(headNode==null){
             return null;
         }
         //B1. Xac dinh last vaf previous
         Node lastNode = headNode;
         Node prevNode = null;
         while (lastNode.next!=null){   // Chừng nào lastNode chưa phải node cuối cùng
             prevNode = lastNode;   // Trc khi lastNode nhay sang vitri tiep thep, prevNode se luu lai data cua LastNode
             lastNode = lastNode.next;
         }
         if(prevNode==null){    //ngay tu dau List chi co 1 node
             return null;
         }
         else{
             prevNode.next = lastNode.next;
         }
         return  headNode;
     }

     public static Node removeAtIndex(Node headNode, int index){
         if(headNode==null||index<0){
             return null;
         }
         if (index==0){
             return removeAtHead(headNode);
         }
         int count=0;
         boolean bIsFound = false;
         Node currNode  =headNode;
         Node prevNode = null;
         while (currNode.next!=null){
             if(count==index){
                 bIsFound = true;
                //remove CurrentNode
                 break;
             }
             prevNode = currNode;
             currNode = currNode.next;
             count++;
         }
         if(bIsFound==true){
             if(prevNode == null){ // current Node la LastNode
                return null;
             }
             else {
                 if(currNode!=null){
                     prevNode.next = currNode.next;
                 }
             }
         }
         return headNode;
     }

}
