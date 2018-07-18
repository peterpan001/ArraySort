package com.arraysort.straightinsertsort;

public class StraightInsertSort {

	public static void straightInsertSort(int nums[]){
		int len = nums.length;
		int preIndex, current;
		for (int i = 1; i < len; i++) {
			preIndex = i -1;
			current = nums[i];
			while(preIndex >= 0 && nums[preIndex] > current){
				nums[preIndex+1] = nums[preIndex];
				preIndex--;
			}
			nums[preIndex+1] = current;
		}
	}
	
	public static void main(String[] args) {
		int nums[] = {3, 2, 4, 5, 6, 4, 9, 6, 7, 8, 1};
		straightInsertSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
