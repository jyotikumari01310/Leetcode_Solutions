class Solution {
    public int search(int[] nums, int target) {

        int pivote=peakele(nums);
        if(pivote==-1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        if(nums[pivote]==target){
            return pivote;
        }
        if(target>=nums[0]){
            return binarySearch(nums,target,0,pivote-1);
        }
        return binarySearch(nums,target,pivote+1,nums.length-1);
    }

    public int binarySearch(int [] arr,int target, int start, int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target< arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                 start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }


    int peakele(int [] arr){

        int start =0;
        int end = arr.length-1;

        while(start<=end){
            
            int mid= start + (end-start)/2;

            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            
            }
            if(mid>start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end=mid-1;
            }
            else{
                start=mid+1;

            }
        }
        return -1;
    }


        
    
}