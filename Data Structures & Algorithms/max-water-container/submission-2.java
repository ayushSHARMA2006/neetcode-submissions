class Solution {
    public int maxArea(int[] heights) {
        int p1 = 0 ; 
        int p2  = heights.length - 1;
        int maxheight = 0 ;
        while(p1<p2){
            int height = 0 ;
            if(heights[p1]<heights[p2]){
               height = heights[p1] * (p2 - p1) ;
               p1++; 
               maxheight = Math.max(maxheight , height);
            }else if(heights[p1]>heights[p2]){
               height = heights[p2] * (p2 - p1) ;
               p2--; 
               maxheight = Math.max(maxheight , height);
            }else{
                height = heights[p1] * (p2 - p1);
                p1++;
                p2--;
                maxheight = Math.max(maxheight , height);
            }

        }
        return maxheight;
    }
}
