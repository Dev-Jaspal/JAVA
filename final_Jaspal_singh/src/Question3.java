import java.util.List;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vertices = {"A", "B", "C", "D", "E"};
		int[][] edges = {
				{0,1},{0,3},{0,4},
				{1, 0}, {1, 2},{1, 4},
				{2, 1}, {2, 3},{2, 4},
				{3, 0}, {3, 2},{3, 4},
				{4, 0}, {4, 1},{4, 2},{4, 3}, 
		};
		
		Graph<String> graph = new UnweightedGraph<>(vertices, edges);
		System.out.println("Vertices of the graph: \n");
		int count= 0;
		for (var vertex : vertices) {
			if(count == 0) {
			 System.out.print("[ ");
			}
			System.out.print(vertex);
			if(count < 4) {
				System.out.print(", ");
			}
			if(count == 4)
			{
				System.out.println(" ]");
			}
			count++;
		}
		
		System.out.println("\nEdges of the graph: \n");
		graph.printEdges();
		
		System.out.println("Adjacency matrix of the graph: \n");
		 for (int i = 0; i < edges.length; i++) {
	            for (int j = 0; j < edges[i].length; j++)
	                System.out.print(edges[i][j] + " ");
	            System.out.println();
	        }
		System.out.println("\n");
		System.out.println("Number of vertices: \n");
		System.out.println(graph.getSize() + "\n");
		System.out.println("DFS Path Vertices: \n");
		AbstractGraph<String>.Tree dfs = graph.dfs(graph.getIndex("A"));
		List<Integer> dfsSearchOrders = dfs.getSearchOrder();
		for (int i = 0; i < dfsSearchOrders.size(); i++)
		{
		      System.out.print(graph.getVertex(dfsSearchOrders.get(i)) + " ");
		}
		
		System.out.println("\n");
		System.out.println("BFS Path Vertices: \n");
		AbstractGraph<String>.Tree bfs = graph.bfs(graph.getIndex("A"));
		List<Integer> bfsSearchOrders = bfs.getSearchOrder();
		for (int i = 0; i < bfsSearchOrders.size(); i++)
		{
			 System.out.print(graph.getVertex(bfsSearchOrders.get(i)) + " ");
		}
	}
}
