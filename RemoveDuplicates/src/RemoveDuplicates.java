public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5};
        int newLength = removeDuplicates(nums);
        System.out.println("Output: " + newLength);
        System.out.print("nums = [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i != nums.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int uniqueIndex = 1; 
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueIndex] = nums[i];
                uniqueIndex++;
            }
        }
        
        for (int i = uniqueIndex; i < nums.length; i++) {
            nums[i] = '_'; 
        }
        
        return uniqueIndex;
    }
}



