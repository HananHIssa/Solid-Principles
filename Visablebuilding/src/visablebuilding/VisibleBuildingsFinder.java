package visablebuilding;
import java.util.ArrayList;
import java.util.List;
public class VisibleBuildingsFinder {
    public static void main(String[] args) {
        int[] buildingHeights = {1, 7, 4, 5, 8, 2, 10, 9};
        List<Integer> visibleBuildings = findVisibleBuildings(buildingHeights);
        System.out.println("Output: " + visibleBuildings);
    }
    public static List<Integer> findVisibleBuildings(int[] buildingHeights) {
        List<Integer> visibleList = new ArrayList<>();
        int highestSeen = Integer.MIN_VALUE;        
        for (int height : buildingHeights) {
            if (height > highestSeen) {
                visibleList.add(height);
                highestSeen = height;
            }
        }        
        return visibleList;
    }
}
