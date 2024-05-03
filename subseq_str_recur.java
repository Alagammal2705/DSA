public class subseq_str_recur {
    public static void subseq(int i, String s, String f){
        if(i==s.length()){
            System.out.println(f);
            return;
        }

        subseq(i+1,s,f+s.charAt(i));
        subseq(i+1,s,f);

    }
    public static void main(String[] args){
        String s = "abc";
        String f= "";
        subseq(0,s,f);
    }
}
