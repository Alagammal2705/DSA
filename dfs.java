import java.util.ArrayList;
import java.util.Scanner;

public class dfs {
    public static void dfs(int node,boolean[] vis, ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> df){
        vis[node] = true;
        df.add(node);
        for(Integer x:adj.get(node)){
            if(vis[x]==false){
                dfs(x, vis,adj,df);
            }
        }
    }
    public static ArrayList<Integer> dfs_graph(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v+1];
        vis[0] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0,vis,adj,ls);
        return ls;
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of vertices:");
        int v = in.nextInt();
        for (int i =0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        System.out.println("Enter no of edges:");
        int e = in.nextInt();
        System.out.println("Enter u and v:");
        for(int i =0;i<e;i++){
            int u = in.nextInt();
            int x = in.nextInt();
            adj.get(u).add(x);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans = dfs_graph(v,adj);
        for(int i =0;i<ans.size();i++){
            System.out.println(ans.get(i));
        }
    }
}
