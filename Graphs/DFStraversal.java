package Graphs;

import java.util.Scanner;

public class DFStraversal {
	
	public static void dfsTraversal(int adjMatrix[][], int currentVertex, boolean visited[]) {
		System.out.print(currentVertex+ " ");
		visited[currentVertex] = true;
		
		for(int i=0;i<adjMatrix.length;i++) {
			if(adjMatrix[currentVertex][i] == 1 && visited[i] == false) {
				// i is neighbour of currentVertex
				dfsTraversal(adjMatrix, i, visited);
			}
		}
		
	}
	
	public static void dfsTraversal(int adjMatrix[][]) {
		boolean visited[] = new boolean[adjMatrix.length];
		dfsTraversal(adjMatrix, 0, visited);
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
		
		dfsTraversal(adjMatrix);
	}

}
