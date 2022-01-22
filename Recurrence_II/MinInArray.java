package Recurrence_II;

public class MinInArray {
	
	//a[] = {3,4,2,1,7,8};
	public static void findMin1(int[] a,int min, int index){
		
		if(index == a.length) {
			System.out.println("Minimum: " + min);
			return;
		}
		int minValue = min;
		if(min < a[index]) {
			minValue = min;
		}else {
			minValue = a[index];
		}
		findMin1(a,minValue,index+1);
	}
	
	public static int findMin(int a[], int startIndex) {
		
		if(a.length == startIndex) {
			return Integer.MAX_VALUE;
		}
		int minSmallArray = findMin(a,startIndex+1);
		
		if(a[startIndex] > minSmallArray) {
			return minSmallArray;
		}else {
			return a[startIndex];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {3,4,2,1,7,8};
		int min = findMin(a,0);
		System.out.println(min);
		findMin1(a,Integer.MAX_VALUE,0);

	}

}
