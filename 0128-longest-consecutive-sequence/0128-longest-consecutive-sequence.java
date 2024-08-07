class Solution {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> ts=new TreeSet<>();

        for(int i=0;i<nums.length;i++){
            ts.add(nums[i]);
        }

        int count=0;
        int prev=0;
        int maxcount=0;

        for(int it : ts){
            if(!ts.contains(it - 1)){//starting  of the sequence
                count=1;
                prev=it;
                while(ts.contains(prev+1)){
                    count+=1;
                    prev+=1;
                }
                //completed one sequence
                maxcount=Math.max(maxcount,count);//checking which is the longest
            }
        }     
        return maxcount;
    }
}