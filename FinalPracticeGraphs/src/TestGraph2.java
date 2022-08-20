import java.util.List;

public class TestGraph2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vertices = {"A", "B", "C", "D", "E"};
		 int[][] edges = {
			      {0, 1}, {0, 3},{0, 4},
			      {1, 0}, {1, 2},{1, 3},
			      {2, 1}, {2, 3},{2, 4},
			      {3, 0}, {3, 2},{3, 2}, 
			      {4, 0}, {4, 1},{4, 2},{4, 3}, 
			    };
		 
		 Graph<String> graph = new UnweightedGraph<>(vertices, edges);
		 	System.out.println("Graph Content:");
		    System.out.println("The number of vertices: "  + graph.getSize());
		    System.out.println("The edges for graph:");
		    graph.printEdges();
		    
		       
		    AbstractGraph<String>.Tree dfs = graph.dfs(graph.getIndex("A"));
			List<Integer> dfsSearchOrders = dfs.getSearchOrder();
			    System.out.print(dfs.getNumberOfVerticesFound() +" vertices are searched in DFS traversal:");
			    for (int i = 0; i < dfsSearchOrders.size(); i++)
				      System.out.print(graph.getVertex(dfsSearchOrders.get(i)) + " ");
			    
			    
			    AbstractGraph<String>.Tree bfs = graph.bfs(graph.getIndex("A"));
			List<Integer> bfsSearchOrders = bfs.getSearchOrder();
			     System.out.print("\n"+bfs.getNumberOfVerticesFound() +" vertices are searched in BFS traversal:");
			     for (int i = 0; i < bfsSearchOrders.size(); i++)
				      System.out.print(graph.getVertex(bfsSearchOrders.get(i)) + " ");
				    
				 
				  
	}

}
