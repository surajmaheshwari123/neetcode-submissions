class Solution {
    public int[] getConcatenation(int[] nums) {
       int[] ans = new int[nums.length*2];
       int i=0;
       while(i<nums.length*2){
        for (int n=0;n<nums.length;n++){
            if(n>=nums.length) n=0;
            ans[i] = nums[n];
                 i+=1;
        }
       }
       return ans;
    }
}