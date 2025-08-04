import java.util.*;

public class Main {

    public static class Edge {
        int src;
        int dest;
        int weight;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight =w;
        }
    }

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 2, 2));

        graph[1].add(new Edge(1, 2, 10));
        graph[1].add(new Edge(1, 3, 0));

        graph[2].add(new Edge(2, 0, 2));
        graph[2].add(new Edge(2, 1, 10));
        graph[2].add(new Edge(2, 3,-1));
        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 1, 0));
        graph[3].add(new Edge(3, 2,-1));
        graph[3].add(new Edge(3, 4,-1));
        
        graph[4].add(new Edge(4, 2, 3));
        graph[4].add(new Edge(4, 3,-1));
    }
    
    public static void bfs(ArrayList<Edge>graph[], int V)
    {
      Queue<Integer>q = new LinkedList<>();
      boolean vis [] = new boolean[V];
      q.add(0);
      
      while(!q.isEmpty())
      {
        int curr = q.remove();
        if(vis[curr]==false)
        {
          System.out.print(curr+" ");
          vis[curr]=true;
          for(int i=0;i<graph[curr].size();i++)
          {
            Edge e = graph[curr].get(i);
            q.add(e.dest);
          }
        }
      }
    }
    
    public static void dfs(ArrayList<Edge>graph[],int curr, boolean vis[])
    {
      System.out.print(curr+ " ");
      vis[curr]=true;
      
      for(int i=0;i<graph[curr].size(); i++)
      {
        Edge e = graph[curr].get(i);
        if(vis[e.dest]==false)
        {
          dfs(graph, e.dest,vis);
        }
        
      }
      
    }

    public static void main(String[] args) {
        int V = 6;
        ArrayList<Edge> graph[] = new ArrayList[V];
        
        createGraph(graph);
        boolean vis[]= new boolean[V];
        bfs(graph,V);
        System.out.println();
        dfs(graph,0,vis);
        // Print all near vertex
        for(int i=0;i<graph[2].size();i++)
        {
          Edge e = graph[2].get(i);
          System.out.println(e.dest + " "+ e.weight);
        }
      
    }
}
