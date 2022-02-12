package Graphs;

import java.util.*;

public class BFStraversal {
	
	public static void bfsTraversal(int adjMatrix[][], boolean visited[]) {
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		visited[0] = true;
		
		while(!queue.isEmpty()) {
			int currentVertex = queue.poll();
			System.out.print(currentVertex+ " ");
			for(int i=0;i<adjMatrix.length;i++) {
				if(adjMatrix[currentVertex][i] == 1 && visited[i] == false) {
					queue.add(i);
					visited[i] = true;
				}
			}
		}
	}
	public static void bfsTraversal(int adjMatrix[][]) {
		boolean visited[] = new boolean[adjMatrix.length];
		bfsTraversal(adjMatrix,visited);
		
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices ans edge: ");
		int vertex = sc.nextInt();
		int edge = sc.nextInt();
		// create 2d matrix
		int adjMatrix[][] = new int[vertex][vertex];
		
		System.out.println("Enter the vertices between have edge:");
		for(int i=0;i<edge;i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			adjMatrix[v1][v2] = 1;
			adjMatrix[v2][v1] = 1;
		}
		
		bfsTraversal(adjMatrix);
		
	}

}
