package com.arrayfind.sequentialsearch;
/**
 * À≥–Ú±Ì≤È’“
 * @author Peter
 *
 */
public class SequentialSearch {

	public static int sequentialSearch(int nums[], int value){
		for (int i = 0; i < nums.length; i++) {
			if(value == nums[i]){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int nums[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int search = sequentialSearch(nums, 7);
		System.out.println(search);
	}
}
