
public class MaxSumSubArray1 {

	public static void main(String[] args) {
		int[] a = { -2, -3, 4, -1, -2, 1, 5, -3 };
		System.out.println("Maximum contiguous sum is " + getMaxSubArraySum(a, a.length));
	}

	static int getMaxSubArraySum(int a[], int size) {
		int maxSubArraySum = 0, sum = 0;
		for (int i = 0; i < size; i++) {
			sum = sum + a[i];
			if (sum < 0)
				sum = 0;
			else if (maxSubArraySum < sum)
				maxSubArraySum = sum;
		}
		return maxSubArraySum;
	}

}
