import java.util.Arrays;
import java.util.Scanner;

public class KthLargestNumber {

    public static int kthLargestNumber(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();
        String[] numbers = input.split(",");
        int[] nums = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }

        System.out.print("k=");
        int k = scanner.nextInt();

        int kthLargest = kthLargestNumber(nums, k);
        System.out.println(kthLargest);

        scanner.close();
    }
}


