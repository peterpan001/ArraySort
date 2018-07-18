package com.arraysort.quicksort;
/**
 * 快速排序
 * @author Peter
 *
 */
public class QuickSort {

	public static void quickSort(int nums[]){
		quickSort(nums, 0, nums.length-1);
	}

	private static void quickSort(int[] nums, int low, int high) {
		int pivot;
		if(low < high){
			//算出枢轴值
			pivot = partition(nums, low, high);
			//对低子表递归排序
			quickSort(nums, low, pivot-1);
			//对高子表递归排序
			quickSort(nums, pivot+1, high);
		}
	}

	private static int partition(int[] nums, int low, int high) {
		//用子表的第一个记录作为枢轴记录
		int pivotKey = nums[low];
		//从表的两端交替向中间扫描
		while(low < high){
			 //从数组后面向前扫描，将比pivotkey值小的交换到低端
			while(low < high && nums[high] >= pivotKey){
				--high;
			}
			//交换值
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			//从数组前面向后扫描，将比pivotkey值大的交换到高端
			while(low < high && nums[low] <= pivotKey){
				++low;
			}
			//交换值
			temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
		}
		return low;
	}
	
	
	public static void main(String[] args) {
		int nums[] = {3, 2, 4, 5, 6, 4, 9, 6, 7, 8, 1};
		quickSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	
}
