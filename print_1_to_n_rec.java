import java.util.Scanner;

public class print_1_to_n_rec {
    public static void print(int i, int n){
       if(i>n){
           return;
       }
       System.out.println(i);
       print(i+1,n);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = in.nextInt();
        print(1,n);
    }
}
