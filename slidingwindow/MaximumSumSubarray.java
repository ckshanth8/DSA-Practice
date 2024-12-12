class MaximumSumSubarray {
    public int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int start=0, end=0, n=arr.length,sum=0, maxSum=Integer.MIN_VALUE;
        
        while(end<n){
    
            sum=sum+arr[end];
            //if the window size is less than k then increment end pointer
            if(end-start+1<k){
                end++;
            } 
            //if the window size is k then do some calculation
            else if(end-start+1==k){
                //store max sum
                maxSum=Math.max(sum,maxSum);
                //moving the window
                sum=sum-arr[start];
                start++;
                end++;
            }
        }
        return maxSum;
    }
}
