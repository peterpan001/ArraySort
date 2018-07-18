package com.arraysort.shellsort;
/**
 * ϣ������
 * @author Peter
 *
 */
public class ShellSort {

	public static void shellSort(int nums[]) {
		int len = nums.length;
		int add = len;
		while(true){
			add = add / 3 + 1; //�趨�����ļ������������Ǽ�С������
			for (int i = 0; i < add; i++) {
				for (int j = i + add; j < nums.length; j = j + add) {
					int current = nums[j];
					int k;
					for (k = j - add; k >= 0 && nums[k] > current; k = k - add) {
						nums[k + add] = nums[k];
					}
					nums[k + add] = current;
				}
			}
			if(add == 1){
				break;
			}
		}
	}

	public static void main(String[] args) {
		int nums[] = {10, 3, 4, 2, 6, 5, 4, 9, 1, 6, 7, 8, 1};
		shellSort(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
}
