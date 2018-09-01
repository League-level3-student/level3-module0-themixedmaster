package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String [] test= new String[6];
		test[0]="a rock";
		test[1]="some grass";
		test[2]="a bucket";
		test[3]="a star";
		test[4]="a cloud";
		test[5]="a fantasy map that does not look like earth in any way because there is no south america, hawaii, ice on the south pole, or a lot of other things that earth has";
		method5(test);
	}
	
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void method2(String[] string){
		for(int x = 0;x < string.length;x++){
			System.out.println(string[x]);
		}
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	void method3(String[] string){
		for(int x = string.length-1;x > -1;x--){
			System.out.println(string[x]);
		}
	}
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	void method4(String[] string){
		for(int x = 1;x < string.length;x=x+2){
			System.out.println(string[x]);
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void method5(String[] string){
		String [] scramble = new String[string.length];
		for(int x = 0;x < scramble.length;x++){
			scramble[x]="null";
		}
		for(int x = 0;x < scramble.length;x++){
			Random r = new Random();
			int rng = r.nextInt(string.length);
			while(string[rng]=="null"){
				rng = r.nextInt(string.length);
			}
			scramble[x]=string[rng];
			System.out.println(string[x]);
			string[rng]="null";
		}
		
		for(int x = 0;x < scramble.length;x++){
			System.out.println(scramble[x]);
		}
	}
	
}
