import java .util.*;

public class ArticulationPoint {
    static class Edge {
        int src;
        int des;

        public Edge(int s, int d) {
            this.src = s;
            this.des = d;

        }

    }
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
       
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));
     
        graph[3].add(new Edge(3, 0)); 
        graph[3].add(new Edge(3, 4)); 
         
        graph[4].add(new Edge(4, 3));
        
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[] , int low[], int time, boolean vis[], boolean ap[]){
        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for(int i=0; i<graph[curr].size(); i++){
            Edge e = graph[curr].get(i);
            int neigh = e.des;

            if(par==neigh){
                continue;
            } else if(vis[neigh]){
                low[curr] = Math.min(low[curr], dt[neigh]);
            } else {
                dfs(graph, neigh, curr, dt, low, time, vis, ap);
                 low[curr] = Math.min(low[curr], low[neigh]);
                 if(par != -1 && dt[curr] <= low[neigh]) {
                    ap[curr] = true;
                 }
                 children++;
            } 
        }

        if(par == -1 && children > 1){
             ap[curr] = true;
        }
    }

    public static void getAP(ArrayList<Edge> graph[], int V){
        int dt[] = new int[V];
        int low[] = new int[V];
        int time = 0;
        boolean vis[] = new boolean[V];
        boolean ap[] = new boolean[V];

        for(int i=0; i<V; i++){
            if(!vis[i]){
               dfs(graph, i, -1, dt, low, time, vis,ap);
            }
        }
        // print all ap
        for(int i=0; i<V; i++){
            if(ap[i]){
               System.out.println(i);
            }
        }
    }

    public static void main(String args[]) {
        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph); 
        getAP(graph, v);
    }
}
