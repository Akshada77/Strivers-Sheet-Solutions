class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm=new HashMap<>();
        int ans[]=new int[2];

        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(hm.containsKey(comp)){
                ans[0]=hm.get(comp);
                ans[1]=i;
            }else{
                hm.put(nums[i],i);
            }
        }
        return ans;
    }
}