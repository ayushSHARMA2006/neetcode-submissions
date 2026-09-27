class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        for (int  i = 0  ;  i < nums.length - 2 ; i++){
            
         
         if(i > 0 && nums[i] == nums[i - 1] ){
            continue;
         }
         int p2 = i+1;
         int p3 = nums.length -1;
         int target = 0 - nums[i];
         while(p2 < p3 ){
            int currentSum = nums[p2] + nums[p3] ; 
            if(currentSum == target){
                ans.add(new ArrayList<>(Arrays.asList(nums[i],nums[p2],nums[p3])));
                while (p2 < p3 && nums[p2] == nums[p2 + 1]) p2++;
                while (p2 < p3 && nums[p3] == nums[p3 - 1]) p3--;
                p2++;
                p3--;
            }else if(currentSum > target){
                p3 -- ;
            }else{
                p2 ++ ;
            }
         }
        }
        return ans ;
    }
}

