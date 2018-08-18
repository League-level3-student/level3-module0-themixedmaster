package _01_Simple_Array_Algorithms;

public class _00_1D_Array_Methods {
	//1. Complete the method so that it returns the sum of all
	//   of the integers in the array being passed in
	public static int sumIntArray(int[] values) {

		return 0;
	}
	
	//2. Complete the method so that it returns the average of all
	//   of the integers in the array being passed in
	public static double averageIntArray(int[] values) {
		int av = 0;	
		for(int x = values.length - 1;x > -1;x--){
			av = av + values[x];
		}
		int averaj = av / values.length;
		return averaj;
	}
	
	
	//3. Complete the method so that it returns true if the integer
	//   array contains the value specified by the second parameter.
	//   It should otherwise return false.
	public static boolean containsIntValue(int[] array, int value) {
		int y = 0;
		for(int x = array.length - 1;x > -1;x--){
			if((int)array[x] == value){
				y = 1;
			}
		}
		if(y == 1){
			return true;
		}else{
			return false;
		}
	}
	
	//4. Complete the method so that it returns the index of the,
	//   first instance that the specified value occurs in the array.
	//   If the array does not contain the specified value, it should return -1.
	public static int getIndex(int[] arr, int value) {
		int y = -1;
		for(int x = 0;x < arr.length + 1;x++){
			if((int)arr[x] == value){
				y = x;
			}
		}
		return y;
	}
}
