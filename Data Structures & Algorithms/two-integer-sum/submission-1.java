class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0 ; i <nums.length ; i++){
            int num = nums[i];
            map.put(num , i);
        }
        int[] ans = new int[2]; 
        for (int i = 0 ; i < nums.length ; i++){
            int num = target - nums[i] ;
            if(map.containsKey(num) && map.get(num) != i){
                return new int[] { i , map.get(num)};
            }
        }
        return new int[]{-1,-1};
    }
}
