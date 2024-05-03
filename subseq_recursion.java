import java.util.ArrayList;

public class subseq_recursion {
    public static void seq(int i,int[] a, ArrayList<Integer> l){
        if(i==a.length){
            System.out.println(l.toString());
            return;
        }
        l.add(a[i]);
        seq(i+1,a,l);
        l.remove(l.size()-1);
        seq(i+1,a,l);


    }
    public static void main(String[] args){
        int[] a = {1,2,3};
        ArrayList<Integer> ls = new ArrayList<>();
        seq(0,a,ls);
    }
}
