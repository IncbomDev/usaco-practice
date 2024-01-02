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
        int b = nums[1];
        int c = nums[4];
        System.out.println(a + " " + b + " " + c);
    }
}
