import java.util.Scanner;

public class print_n_to_1_rec {
    public static void print(int i,int n){
        if(i==n){
            return;
        }
        System.out.println(n--);
        print(i++,n);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the n:");
        int n= in.nextInt();
        print(0,n);
    }
}
