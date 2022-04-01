package phase1;


public class LTS{
	
	 public static int LIS(int[] arr, int i, int n, int prev) {
	 
	 // Base case: nothing is remaining
		 
	 if (i == n) {
	 return 0;
	 }
	 // case 1: exclude the current element and process the
	 // remaining elements
	 
	 int excl = LIS(arr, i + 1, n, prev);
	 
	 // case 2: include the current element if it is greater
	 // than the previous element in LIS
	 
	 int incl = 0;
	 if (arr[i] > prev) {
	 incl = 1 + LIS(arr, i + 1, n, arr[i]);
	 }
	 
	 // return the maximum of the above two choices
	 
	 return Integer.max(incl, excl);
	 }
	 public static void main(String[] args) {
	 
	 int[] arr = {3,67,4,35,86,33,97,90,5,78};
	 System.out.print("The length of the LIS is "+ LIS(arr, 0, arr.length, Integer.MIN_VALUE));
	 
	 }
}

