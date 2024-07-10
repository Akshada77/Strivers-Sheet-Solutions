class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
    
   //1.Staircase Approximation
    //     int i=0;
    //     int j=matrix[0].length-1;
    //     if(target<matrix[0][0] || target>matrix[matrix.length-1][matrix[0].length-1]){
    //      return false;
    //     }

    //     while(j>=0 && i<matrix.length){
    //      if(matrix[i][j]<target){
    //          i++;
    //      }else if(matrix[i][j]>target){
    //          j--;
    //      }else{
    //          return true;
    //      }
    //     }
    //     return false; 
    //  }

    //2.Flattening 2-D array into 1-D array
        int n=matrix.length, m=matrix[0].length;
		if(target<matrix[0][0] || target>matrix[n-1][m-1]){
          return false;
        }
		int start=0;
		int end=n*m-1;
		while(start<=end) {
			int mid=(start+end)/2;
			int row=mid/m;
			int col=mid%m;
			if(matrix[row][col]==target) {
				return true;
			}else if(matrix[row][col]<target) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return false;

}
}