import java.util.ArrayList;
import java.util.List;

public class VisibleBuildings {

    public static void main(String[] args) {
        int[] heights = {1, 7, 4, 5, 8, 2, 10, 9};
        List<Integer> visibleBuildings = getVisibleBuildings(heights);
        System.out.println("Output: " + visibleBuildings);
    }

    public static List<Integer> getVisibleBuildings(int[] heights) {
        List<Integer> result = new ArrayList<>();
        int maxSeenSoFar = Integer.MIN_VALUE;
        
        for (int height : heights) {
            if (height > maxSeenSoFar) {
                result.add(height);
                maxSeenSoFar = height;
            }
        }
        
        return result;
    }
}
