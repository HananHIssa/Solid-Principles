package duplicatesremove;

public class DuplicateRemover {
    public static void main(String[] args) {
        int[] numbers = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5};
        int countOfUnique = eliminateDuplicates(numbers);
        System.out.print("Output: " + countOfUnique + ", numbers = [");
        for (int i = 0; i < countOfUnique; i++) {
            System.out.print(numbers[i]);
            if (i < countOfUnique - 1) {
                System.out.print(",");
            }
        }
        for (int i = countOfUnique; i < numbers.length; i++) {
            System.out.print(",_");
        }
        System.out.println("]");
    }
    public static int eliminateDuplicates(int[] numbers) {
        if (numbers.length == 0) return 0;

        int newIndex = 1;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != numbers[i - 1]) {
                numbers[newIndex] = numbers[i];
                newIndex++;
            }
        }
        return newIndex;
    }

    
}