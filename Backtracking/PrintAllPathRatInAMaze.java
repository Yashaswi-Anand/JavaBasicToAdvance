package Backtracking;

public class PrintAllPathRatInAMaze {
	
	public static void rateInAMaze(int maze[][]) {
		int n = maze.length;
		int path[][] = new int[n][n];
		printAllMazePath(maze,0,0,path);
	}
	
	public static void printAllMazePath(int maze[][], int i,int j,int path[][]) {
		int n = maze.length;
		
		// check if i , j cell is valid or not
		if(i < 0 || i>=n || j<0 || j>= n || maze[i][j] == 0 || path[i][j] == 1) {
			return;
		}
		
		// Include the cell in current path 
		path[i][j] = 1;
		
		// Destination cell
		if(i == n-1 && j == n-1) {
			// print path
			for(int r=0;r<n;r++) {
				for(int c=0;c<n;c++) {
					System.out.print(path[r][c]+ " ");
				}
				//System.out.println();
			}
			System.out.println();
			path[i][j] = 0;
			return;
		}
		
		// Explore further in all direction
		
		// top
		printAllMazePath(maze,i-1,j,path);
		// down 
		printAllMazePath(maze,i+1,j,path);
		// left
		printAllMazePath(maze,i,j-1,path);
		// right
		printAllMazePath(maze,i,j+1,path);
		
		path[i][j] = 0;
		return;
		
	}

	public static void main(String[] args) {
		
		int maza[][] = {{1,0,1},{1,1,1},{1,1,1}};
		rateInAMaze(maza);
		

	}

}
