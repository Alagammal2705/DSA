import java.util.Scanner;

public class print_name_using_recursion {
    public static void names(int n, String name){
        if(n<=0){
            return;
        }
        System.out.println(name);
        names(n-1,name);
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of times:");
        int n = in.nextInt();
        in.nextLine();
        System.out.println("Enter a name to be printed n times:");
        String name = in.nextLine();
        names(n,name);
    }
}
