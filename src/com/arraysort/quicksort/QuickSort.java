package com.arraysort.quicksort;
/**
 * ��������
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
			//�������ֵ
			pivot = partition(nums, low, high);
			//�Ե��ӱ�ݹ�����
			quickSort(nums, low, pivot-1);
			//�Ը��ӱ�ݹ�����
			quickSort(nums, pivot+1, high);
		}
	}

	private static int partition(int[] nums, int low, int high) {
		//���ӱ�ĵ�һ����¼��Ϊ�����¼
		int pivotKey = nums[low];
		//�ӱ�����˽������м�ɨ��
		while(low < high){
			 //�����������ǰɨ�裬����pivotkeyֵС�Ľ������Ͷ�
			while(low < high && nums[high] >= pivotKey){
				--high;
			}
			//����ֵ
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			//������ǰ�����ɨ�裬����pivotkeyֵ��Ľ������߶�
			while(low < high && nums[low] <= pivotKey){
				++low;
			}
			//����ֵ
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
