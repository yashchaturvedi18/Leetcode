public class ContainerWithMostWater {



    public static void main(String args[]){

        maxArea(new int[]{1,2,1});

    }

    public static int maxArea(int[] height) {
        int left = 0;
        int right = 1;
        int maxArea = height[0];
        int maxHeight=height[0];
        while(right<height.length){
            int b = right-left;
            int temp = Math.min(height[left],height[right]);
            int area = b * temp;
            if(area> maxArea){
                maxArea= area;
            }
            if(height[right]>maxHeight){
                left = right;
            }

            right++;
        }
        return maxArea;
    }
}
