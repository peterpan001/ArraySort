package com.arrayfind.interpolationsearch;

public class InterpolationSearch {

	public static int interpolationSearch(int nums[], int value){
		int low = 0, mid, high = nums.length - 1;
		while(low <= high){
			//与二分查找的区别点，在mid的选择
			mid = low + (high-low)*(value - nums[low]) / (nums[high] - nums[low]);
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
		int search = interpolationSearch(nums, 10);
		System.out.println(search);
	}
}
