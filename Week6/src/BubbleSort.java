
public class BubbleSort {

	public static void main(String[] args) {
		int[] nums = {4,6,1,2,9,22};
		
		System.out.println("Before sorting");
		for(int num: nums) {
			System.out.print(num + "\s");
		}
		System.out.println();
		
		//bubbleSort(emps);
		int comp=0;
		for(int i=0;i<nums.length-1;i++) { //number of rounds/passes
			
			for(int j=0;j<nums.length-1-i;j++) { //number of comparisons
				if(nums[j]>nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
					comp++;
				}
			}
		}
		System.out.println("After sorting");
		for(int num: nums) {
			System.out.print(num + "\s");
		}
	}
	
}
