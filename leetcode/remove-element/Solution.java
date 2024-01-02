class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder numString = new StringBuilder();
        for (int i : digits) {
            numString.append(i);
        }
        int num = Integer.parseInt(numString.toString());
        System.out.println(num);
        num += 1;
        System.out.println(num);
        String numStringTwo = Integer.toString(num);
        int[] numArray = new int[numStringTwo.length()];
        for (int i = 0; i < numStringTwo.length(); i++) {
            System.out.println(numStringTwo.charAt(i) - '0');
            numArray[i] = numStringTwo.charAt(i) - '0';
        }
        return numArray;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = {1, 2, 3};
        int[] result = solution.plusOne(digits);
        for (int i : result) {
            System.out.println(i);
        }
    }
}
