package com.arraysort.bubblesort;
/**
 * ð������
 * @author Peter
 *
 */
public class BubbleSort {

	public static void bubbleSort(int nums[]){
		int len = nums.length;
		for (int i = 0; i < len -1; i++) {
			for(int j = 0; j < len - i - 1; j++){
				if(nums[j] > nums[j+1]){
					int temp = nums[j+1];
					nums[j+1] = nums[j];
					nums[j] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int nums[] = {3, 2, 5, 4, 9, 6, 7, 8, 1};
		bubbleSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
