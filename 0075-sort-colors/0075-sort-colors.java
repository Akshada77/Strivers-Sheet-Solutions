class Solution {
    // public static void MergeSort(int nums[],int si,int ei){
    //     if(si>=ei){
    //         return;
    //     }
    //     int mid=si+(ei-si)/2;
    //     MergeSort(nums,si,mid);
    //     MergeSort(nums,mid+1,ei);
    //     Merge(nums,si,mid,ei);
    // }

    // public static void Merge(int nums[],int si,int mid,int ei){
    //     int i=si;
    //     int j=mid+1;
    //     int k=0;
    //     int temp[]=new int[ei-si+1];
        
    //     while(i<=mid && j<=ei){
    //         if(nums[i]<nums[j]){
    //             temp[k]=nums[i];
    //             i++;
    //         }else{
    //             temp[k]=nums[j];
    //             j++;
    //         }
    //         k++;
    //     }
    //     while(i<=mid){
    //         temp[k++]=nums[i++];
    //     }
    //     while(j<=ei){
    //         temp[k++]=nums[j++];
    //     }
    //     for(i=si,k=0;k<temp.length;i++,k++){
    //         nums[i]=temp[k];
    //     }

    // } 
    // public static void printArr(int nums[]){
    //     for(int i=0;i<nums.length;i++){
    //         System.out.print(nums[i]+" ");
    //     }
    //     System.out.println();
    // }
    public void sortColors(int[] nums) {
        // int si=0;
        // int ei=nums.length-1;
        // MergeSort(nums,si,ei);
        // printArr(nums);

        Arrays.sort(nums);
    }
}