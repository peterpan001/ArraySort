package com.arrayfind.binarysearch;

public class BinarySearch {

	public static int binarySearch(int nums[], int value){
		int low = 0, mid, high = nums.length-1;
		while(low <= high){
			mid = (low + high) / 2;
			if(nums[mid] == value){
				return mid;
			}
			if(nums[mid] > value){
				high = mid - 1;
			}
			if(nums[mid] < value){
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int nums[]={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int search = binarySearch(nums, 5);
		System.out.println(search);
		
	}
}
