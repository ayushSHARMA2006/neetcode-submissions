class Solution {
    public int trap(int[] height) {
        if(height ==null || height.length == 0  ){
            return 0;
        }
        int p1= 0 ; 
        int p2 = height.length - 1;
        int leftmax = 0;
        int rightmax = 0 ;
        int total = 0;
        while(p1<p2){
           if(height[p1]<height[p2]){
            if(height[p1] >= leftmax){
                leftmax = height[p1];
            }else{
                total += leftmax - height[p1];
            }
            p1++;
           }else{
             if(height[p2] >= rightmax){
                rightmax = height[p2];
            }else{
                total += rightmax - height[p2];
            }
            p2--;
           }
        }
        return total;
    }
}
