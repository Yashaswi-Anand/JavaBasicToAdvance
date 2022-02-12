package Graphs;

import java.util.Scanner;

public class AdjacencyMatrix {

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
		
		for(int i=0;i<vertex;i++) {
			for(int j=0;j<vertex;j++) {
				System.out.print(adjMatrix[i][j]+ " ");
			}
			System.out.println();
		}
		
		

	}

}
