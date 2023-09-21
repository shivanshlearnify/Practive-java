import java.util.*;

public class CheapestFlightWith_K_Stop {
    static class Edge {
        int src;
        int des;
        int wt;

        public Edge(int src, int des, int wt) {
            this.src = src;
            this.des = des;
            this.wt = wt;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[], int flight[][]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flight.length; i++) {
            int src = flight[i][0];
            int des = flight[i][1];
            int wt = flight[i][2];

            Edge e = new Edge(src, des, wt);
            graph[src].add(e);
        }
    }

    static class Info {
        int v;
        int cost;
        int stops;

        public Info(int v, int cost, int stops) {
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }

    public static int cheapestFlight(int flight[][], int src, int des, int k, int n) {
        ArrayList<Edge> graph[] = new ArrayList[n];
        createGraph(graph, flight);

        int dis[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (i != src) {
                dis[i] = Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr.stops > k){
                break;
            }
            
            for(int i=0; i<graph[curr.v].size(); i++){
                Edge e = graph[curr.v].get(i);
                int u = e.src;
                int v = e.des;
                int wt = e.wt;  

                if(curr.cost+wt < dis[v] && curr.stops <= k){
                    dis[v] = curr.cost+wt;
                    q.add(new Info(v, dis[v], curr.stops+1));
                }
            }
        }
        if(dis[des]== Integer.MAX_VALUE){
            return -1;
        } else {
            return dis[des];
        }
    }

    public static void main(String args[]) {
        int n = 4;
        int flight[][] = { { 0, 1, 100 }, { 1, 2, 100 }, { 2, 0, 100 }, { 1, 3, 600 }, { 2, 3, 200 } };
        int src = 0, dst = 3, k = 1;

        System.out.println(cheapestFlight(flight, src, dst, k, n));

    }
}
