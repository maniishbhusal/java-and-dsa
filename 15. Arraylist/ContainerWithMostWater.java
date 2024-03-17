/*
  Container With Most Water
  For given n lines on x-axis, use 2 lines to form a container such that it
  holds maximum water.
  height = [1,8,6,2,5,4,8,3,7]
 */

import java.util.ArrayList;

public class ContainerWithMostWater {

    public static int storeWater(ArrayList<Integer> height) {
        int maxWater = 0;
        // Brute Force
        // for (int i = 0; i < height.size(); i++) {
        // for (int j = i + 1; j < height.size(); j++) {
        // int width = j - i;
        // int minHeight = Math.min(height.get(i), height.get(j));
        // maxWater = Math.max(maxWater, width * minHeight);
        // }
        // }

        // 2 Pointer Approach - O(n)
        int leftPtr = 0;
        int rightPtr = height.size() - 1;
        while (leftPtr < rightPtr) {
            // calculate water area 
            int width = rightPtr - leftPtr;
            int minHeight = Math.min(height.get(leftPtr), height.get(rightPtr));
            maxWater = Math.max(maxWater, width * minHeight);

            // update pointer 
            if (height.get(leftPtr) < height.get(rightPtr))
                leftPtr++;
            else
                rightPtr--;
        }

        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Max water is " + storeWater(height));

    }
}