package Graphs;

import java.util.Scanner;

public class PrimsAlgorithm {
	
	private static int findMinVertext(boolean[] visited, int[] weight) {
		int minVertx = -1;
		for(int i=0;i<visited.length;i++) {
			if(!visited[i] && (minVertx == -1 || weight[i]<weight[minVertx])){
				minVertx = i;
			}
		}
		return minVertx;
	}
	
	public static void prism(int adjMatrix[][]){
		int n = adjMatrix.length;
		boolean visited[] = new boolean[n];
		int parent[] = new int[n];
		int weight[] = new int[n];
		
		//source - vertext 0
		parent[0] = -1;
		weight[0] = 0;
		for(int i=1;i<n;i++) {
			weight[i] = Integer.MAX_VALUE;
		}
		
		for(int i=0;i<n;i++) {
			int minVertex = findMinVertext(visited,weight);
			visited[minVertex] = true;
			// Explore neighbours of min vertex
			for(int j=0;j<n;j++) {
				if(adjMatrix[minVertex][j] != 0 && !visited[j]) {
					if(weight[j] > adjMatrix[minVertex][j]) {
						// update values
						weight[j] = adjMatrix[minVertex][j];
						parent[j] = minVertex;
					}
				}
			}
			
			
		}
		// print mst
		for(int i=1;i<n;i++) {
			if(i<parent[i]) {
				System.out.println(i+ " " + parent[i]+" "+ weight[i]);
			}else {
				System.out.println(parent[i]+ " " + i+" "+ weight[i]);
			}
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
		
		prism(adjMatrix);
		
	}

}

/* 
5 7
0 1 4
0 2 8
1 2 2
1 3 6
2 3 3
2 4 9
3 4 5
 ?*/
