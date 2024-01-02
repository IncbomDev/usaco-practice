import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String obj = scanner.nextLine();
        String[] strings = obj.split(" ");
        int[] nums = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            nums[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(nums);
        int a = nums[0];
        int[] newArray = Arrays.copyOf(nums, nums.length - 1);
        int b = nums[0];
        newArray = Arrays.copyOf(nums, nums.length - 1);
        int c = newArray[newArray.length];
        System.out.println(c);
        c = c - a - b;
        System.out.println(a + " " + b + " " + c);

    }
}
