package task.c;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "I live in Palestine";
        String output = reverseWords(input);
        System.out.println("Output: \"" + output + "\"");
    }
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        StringBuilder reversedString = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversedString.append(words[i]);
            if (i != 0) {
                reversedString.append(" ");
            }
        }
        
        return reversedString.toString();
    }
}

