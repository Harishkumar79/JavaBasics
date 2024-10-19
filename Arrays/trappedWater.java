public class trappedWater {

// Program to calculate trapped water with help of auxilary arrays

    public static int trappedWater(int heights[]){
        int n = heights.length;
        //array-1 for left max boundary
        int leftmax[] = new int[n];
        leftmax[0] = heights[0];
        for(int i = 1; i < n; i++) {
            leftmax[i] = Math.max(heights[i], leftmax[i-1]);
        }

        //array-2 for right max boundary
        int rightmax[] = new int[n];
        rightmax[n-1] = heights[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightmax[i] = Math.max(heights[i], rightmax[i+1]);
        }

        //loop for piller or building
        int TW = 0; // var for containe trappedwater
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            TW += (waterlevel - heights[i]);  // 1 = width so no multiply
        }
        return TW;
    }

    public static void main(String args[]) {
        int heights[] = {6,2,4,3,5};
        System.out.println("respected pillers height :");
        for (int i = 0; i < heights.length; i++) {
            System.out.print(heights[i] + " ");
        }
        System.out.println();
        System.out.println("Volume of trapped water stored is : " +trappedWater(heights));
    }
}
