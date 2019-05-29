class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j = height.length-1;
        int ans = 0;
        for(;i<j;){
            int minHeight =  height[i] < height[j] ? height[i++] : height[j--];
            ans = Math.max(ans,minHeight * (j - i + 1));
        }
        return ans;
    }
}
