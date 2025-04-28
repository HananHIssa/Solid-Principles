package taskc;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5};
        int newLength = removeDuplicates(nums);
        System.out.println("Output: " + newLength);
        System.out.print("nums = [");
        for (int i = 0; i < nums.length; i++) {
            if (i < newLength) {
                System.out.print(nums[i]);
            } else {
                System.out.print("_");
            }
            if (i != nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int uniqueIndex = 1; // Start from the second element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        
        return uniqueIndex;
    }
}

