package Arrays;

public class TripleSum {
	
	// time complexity -> O(n^3)
	public static int tripletSum(int[] arr, int num) {
		
		int n= arr.length;
        int count=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                    for(int k=0;k<n;k++){
                        if(i!=k && j!=k){
                            if(arr[i]+arr[j]+arr[k]==num)
                                count++;
                        }
                    }
                }
            }
        }
        
        return count/6;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7};
		int numberOfSum = tripletSum(arr, 12);
		System.out.println(numberOfSum);
		

	}

}
