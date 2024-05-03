import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bfs {

    public static ArrayList<Integer> bfs(int n, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[n];
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        visited[0]= true;
        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(Integer x:adj.get(node)){
                if(visited[x]==false){
                    visited[x] = true;
                    q.add(x);
                }
            }
        }
        return bfs;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of vertices:");
        int v = in.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for(int i =0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        System.out.println("Enter number of edges:");
        int e = in.nextInt();
        System.out.println("Enter u and v:" );
        for(int i=0;i<e;i++){
            int u = in.nextInt();
            int x = in.nextInt();
            adj.get(u).add(x);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans= bfs(v,adj);
        for(int i =0;i<ans.size();i++){
            System.out.print(ans.get(i)+" ");
        }


    }
}
