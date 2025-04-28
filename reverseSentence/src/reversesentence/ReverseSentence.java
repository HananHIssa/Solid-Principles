
package reversesentence;
public class ReverseSentence {

   public static void main(String[] args) {
    String originalText = "I live in Palestine";
    String reversedText = reverseSentence(originalText);
    System.out.println("Input: \"" + originalText + "\"");
    System.out.println("Output: \"" + reversedText + "\"");
}

public static String reverseSentence(String text) {
    String[] words = text.split(" ");
    StringBuilder reversed = new StringBuilder();
    for (int i = words.length - 1; i >= 0; i--) {
        reversed.append(words[i]);
        if (i > 0) {
            reversed.append(" ");
        }
    }
    return reversed.toString();
}
    
}
