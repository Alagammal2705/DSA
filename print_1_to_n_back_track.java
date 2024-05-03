import java.util.Scanner;

public class print_1_to_n_back_track {
    public static void times(int i, int n){
        if(i<1){
            return;
        }
        times(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        times(n,n);
    }
}
