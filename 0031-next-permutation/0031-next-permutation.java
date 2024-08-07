class Solution {
    public static void reverseArr(int nums[],int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }
    }
    
    public void nextPermutation(int[] nums) {
        int idx=-1;
        // Find the first decreasing element from the end
        for(int i=nums.length-2;i>=0;i--){//Finding breaking point
            if(nums[i]<nums[i+1]){
                idx=i+1;
                break;
            }
        }
        // If no such element is found, reverse the whole array
        if(idx==-1){
            reverseArr(nums,0,nums.length-1);
            return;
        }

        int prev=idx;
        for(int i=idx+1;i<nums.length;i++){
            if(nums[i]>nums[idx-1] && nums[i]<=nums[prev]){
                prev=i;
            }
        }
        int t=nums[prev];
        nums[prev]=nums[idx-1];
        nums[idx-1]=t;

        // Reverse the subarray after the index idx
        reverseArr(nums,idx,nums.length-1);
    }
}