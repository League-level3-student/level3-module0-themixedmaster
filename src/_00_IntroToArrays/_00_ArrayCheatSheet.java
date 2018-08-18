package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String [] array = new String[5];
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = ("a differnt value");
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int x = array.length-1;x > -1;x--){
			array[x]=("a string of your choice");
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int x = array.length-1;x > 0;x--){
			System.out.println(array[x]);
		}
		//7. make an array of 50 integers
		int [] array2 = new int[50];
		//8. use a for loop to make every value of the integer array a random number
		for(int x = array2.length-1;x > -1;x--){
			Random r = new Random();
			array2[x]= r.nextInt(79)+1;
		}
		//9. without printing the entire array, print only the smallest number on the array
		int y = 100;
		for(int x = array2.length-1;x > -1;x--){
			if(y > array2[x]){
				y = array2[x];
			}
		}
		System.out.println(y);
		//10 print the entire array to see if step 8 was correct
		for(int x = array2.length-1;x > -1;x--){
			System.out.println(array2[x]);
		}
		//11. print the largest number in the array.
		for(int x = array2.length-1;x > -1;x--){
			if(y < array2[x]){
				y = array2[x];
			}
		}
		System.out.println(y);
		//12. print only the last element in the array
		System.out.println(array2[49]);
	}

	
}
