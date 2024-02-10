
public class Buddha {

    public static int minWaterBottles(int[] heights) {
        if (heights == null || heights.length == 0)
            return 0;
        
        int totalBottles = 0;
        int previousHeight = heights[0];
        int previousBottles = 1;

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > previousHeight) {
                // Higher buddha, assign more bottles
                totalBottles += previousBottles + 1;
                previousBottles++;
            } else if (heights[i] < previousHeight) {
                // Lower buddha, assign 1 bottle
                totalBottles += 1;
                previousBottles = 1;
            } else {
                // Same height, assign 1 bottle
                totalBottles += 1;
                previousBottles = 1;
            }
            previousHeight = heights[i];
        }
        return totalBottles;
    }

    public static void main(String[] args) {
        int[] heights = {1,4,3,2,1}; // Example heights
        System.out.println("Minimum number of water bottles needed: " + minWaterBottles(heights));
    }
}
