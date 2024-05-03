class Node{
    int data;
    Node next;
    Node (int data1, Node next1){
        this.data = data1;
        this.next = next1;
    }
    Node(int data1){
        this.data = data1;
        this.next = null;

    }
}
public class convert_arr_to_ll {
    public static Node convert(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i =1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next= temp;
            mover = temp;
        }
        return head;
    }
    public static int length_ll(Node head){
        int cnt = 0;
        Node temp = head;
        while (temp!=null){
            temp = temp.next;
            cnt++;
        }
        return  cnt;
    }
    public static int check(Node head,int val){
        Node temp = head;
        while(temp!=null){
            if(temp.data==val){
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }
    public static void main(String[] args){
        int[] a = {12,6,3,8,1};
        Node head = convert(a);
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp= temp.next;
        }
        System.out.println("Length:"+length_ll(head));
        System.out.println("Check:"+check(head,18));
    }
}
