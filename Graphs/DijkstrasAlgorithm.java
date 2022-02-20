package Graphs;

import java.util.Scanner;

public class DijkstrasAlgorithm {
	
	public static int findMinVertex(boolean[] visited, int[] distance) {
		int minVetex = -1;
		
		for(int i=0;i<visited.length;i++) {
			if(!visited[i] && (minVetex == -1 || distance[i]<distance[minVetex])) {
				minVetex = i;
			}
		}
		return minVetex;
	}
	
	public static void dijkstra(int[][] adjMatrix) {
		int n = adjMatrix.length;
		boolean visited[] = new boolean[n];
		int[] distance = new int[n];
		distance[0] = 0;
		
		for(int i=1;i<n;i++) {
			distance[i] = Integer.MAX_VALUE;
		}
		
		for(int i=0;i<n-1;i++) {
			int minVertex = findMinVertex(visited, distance);
			visited[minVertex] = true;
			
			for(int j=0;j<n;j++) {
				if(adjMatrix[minVertex][j] > 0 && !visited[j] && 
						adjMatrix[minVertex][j] <Integer.MAX_VALUE) {
					// j is unVisited neighbour of minVertex
					// Calculate distance to reach j from source via minVertex
					int newDist = distance[minVertex]+ adjMatrix[minVertex][j];
					if(newDist <distance[j] ) {
						distance[j] = newDist;
					}
				}
			}
		}
		// print distance value for all vertices
		for(int i=0;i<n;i++) {
			System.out.println(i+ " " + distance[i]);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int adjMatrix[][] = new int[v][v];
		
		for(int i=0;i<e;i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int weight = sc.nextInt();
			adjMatrix[v1][v2] = weight;
			adjMatrix[v2][v1] = weight;
		}
		
		dijkstra(adjMatrix);

	}

}
