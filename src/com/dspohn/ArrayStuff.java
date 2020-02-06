package com.dspohn;

public class ArrayStuff {
	
	/**
	 * Shifts the elements in an array based on
	 * the shift value provided.
	 * 
	 * @param arr array of integers 
	 * @param shiftValue int value to determine how far to shift elements.
	 * @return array of integers that has been shifted. 
	 */
	public int[] shiftIt(int[] arr, int shiftValue) {
		int[] result = new int[arr.length];
		int offset = shiftValue % arr.length;
		
		if(offset == 0) {
			return arr;
		}
		for(int i = 0; i < arr.length; i++) {
			result[i] = arr[offset];
			offset++;
			offset = offset % arr.length;
		}

		return result;
	}
}
