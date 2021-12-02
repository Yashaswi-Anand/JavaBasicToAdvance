package Arrays2D;

public class PrintSpiral {
	
	
	public static void spiralPrint(int matrix[][]){
		//Your code goes here
        int m = matrix.length;
        int n =0;
        if(m!=0) n= matrix[0].length;
        int i,l=0,k=0;
        
        /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
        */
        
        while(k<m && l<n){
        	
        	// Print the first row
            for(i=l;i<n;i++){
                System.out.print(matrix[k][i] + " ");
            }
            k++;
            
         // Print the last column
            for (i = k; i < m;i++) {
                System.out.print(matrix[i][n - 1] + " ");
            }
            n--;
            
         // Print the last row
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    System.out.print(matrix[m - 1][i] + " ");
                }
                m--;
            }
            
         // Print the first column
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    System.out.print(matrix[i][l] + " ");
                }
                l++;
            }
            
            
        }
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int arr[][] = { { 1, 2, 3, 4, 5 },
                      { 6, 7, 8, 9, 10 },
                      { 11, 12, 13, 14, 15 },
                      {16, 17, 18, 19, 20},
                      {21, 22, 23, 24, 25}
                      };
 
        // Function Call
        spiralPrint(arr);

	}

}
