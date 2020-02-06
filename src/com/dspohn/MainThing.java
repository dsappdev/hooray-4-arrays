package com.dspohn;

import java.util.Arrays;
import java.util.Random;

public class MainThing {

	public static void main(String[] args) {
		int[] arr1 = new int[]{1, 2, 3, 4, 5};
		
		ArrayStuff arrStff = new ArrayStuff();

		System.out.println("Starting array of [1, 2, 3, 4, 5]");
		System.out.println(Arrays.toString(arrStff.shiftIt(arr1, 1)) + " shift of 1");
		System.out.println(Arrays.toString(arrStff.shiftIt(arr1, 2)) + " shift of 2");
		System.out.println(Arrays.toString(arrStff.shiftIt(arr1, 3)) + " shift of 3");
		System.out.println(Arrays.toString(arrStff.shiftIt(arr1, 4)) + " shift of 4");
		System.out.println(Arrays.toString(arrStff.shiftIt(arr1, 5)) + " shift of 5");
		System.out.println(Arrays.toString(arrStff.shiftIt(arr1, 6)) + " shift of 6");
		
		
		System.out.println("\nUsing an array with a few more elements and a fixed shift of 5.");
		int[] arr2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		System.out.println(Arrays.toString(arr2) + "\n" + Arrays.toString(arrStff.shiftIt(arr2, 5)));
		
		Random rand = new Random();
		int arrayLength = rand.nextInt(50) + 1;
		
		int[] arr3 = new int[arrayLength];
		int count = 1;
		for(int i = 0; i < arrayLength; i++) {
			arr3[i] = count;
			count++;
		}
		System.out.println("\nUsing a random number generator to determine array size. Keeping it in numeric order to make it easy to see ths shift.");
		System.out.println(Arrays.toString(arr3));
		
		int rndOffset = rand.nextInt(arrayLength) + 1;
		System.out.println(Arrays.toString(arrStff.shiftIt(arr3, rndOffset)) + " shift of " + rndOffset);
		
		
		

	}
	
	

}
