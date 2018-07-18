package com.arraysort.simpleselectionsort;
/**
 * ºÚµ•—°‘Ò≈≈–Ú
 * @author Peter
 *
 */
public class SimpleSelectionSort {

	public static void simpleSelectionSort(int nums[]){
		int len = nums.length;
		for (int i = 0; i < len-1; i++) {
			int position = i;
			for (int j = i + 1; j < len; j++) {
				if(nums[j] < nums[position]){
					position = j;
				}
			}
			int current = nums[i];
			nums[i] = nums[position];
			nums[position] = current;
		}
	}
	
	public static void main(String[] args) {
		int nums[] = {10, 3, 4, 2, 6, 5, 4, 9, 1, 6, 7, 8, 1};
		simpleSelectionSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
