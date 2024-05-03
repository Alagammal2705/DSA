class Node1{
    int data;
    Node next;
    Node1(int data1,Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node1(int data1){
        this.data = data1;
        this.next = null;
    }
};
public class LinkedList{
    public static void main(String[] args){
        int[] arr = {2,5,6,8};
        Node1 y = new Node1(arr[0]);
        System.out.println(y.data);
    }
}
