package Graphs;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class GetPathBFS {
	
	public static ArrayList<Integer> getPathBFS(int[][] matrix, int start,int end){
		Queue<Integer> queue = new LinkedList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean visited[] = new boolean[matrix.length];
        visited[start] = true;
        queue.add(start);
        map.put(start, -1);
        boolean pathfound = false;
        while(!queue.isEmpty()){
            int front = queue.poll();
           
            for(int i=0;i<matrix.length;i++){
            	 
                if(matrix[front][i] == 1 && visited[i] == false){
                    queue.add(i);
                    map.put(i,front);
                    visited[i] = true;
                }
                if(i == end){
                    pathfound =  true;
                    break;
                }
            }
        }
        if(pathfound) {
        	ArrayList<Integer> path = new ArrayList<Integer>();
        	int currentVertex = end;
        	while(currentVertex != -1) {
        		path.add(currentVertex);
        		int parent = map.get(currentVertex);
        		currentVertex = parent;
        	}
        	return path;
        }else {
        	return null;
        }
	}
	
	public static void main(String[] args)  throws NumberFormatException, IOException{
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        
        Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int E = sc.nextInt();
        int matrix[][] = new int[V][V];
        for(int i=0;i<E;i++){
            int v1 = sc.nextInt();
            int v2 = sc.nextInt();
            matrix[v1][v2] = 1;
            matrix[v2][v1] = 1;
        }
        
        int start = sc.nextInt();
        int end = sc.nextInt();
        ArrayList<Integer> path = getPathBFS(matrix,start,end);
        System.out.println(path);
        
        
        
        
        
	}
}
