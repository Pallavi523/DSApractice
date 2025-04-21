public class Search_in_rotated_array{
    public static int  search(int[] nums, int target) {
        int l=0,r=nums.length-1;

        while(l<=r){
            int m=l+(r-l)/2;
            if(target==nums[m]){
                return m;
            }
            if(nums[l]<=nums[m]){
                if(nums[l]<=target && target<=nums[m]){
                    r=m-1;
                }
                else{
                    l=m+1;
                }
            }
            else{
                if(nums[m]<=target && target<=nums[r]){
                    l=m+1;
                }
                else{
                    r=m-1;
                }  
            }

        }
    return -1;
    }
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2,3};
        int target=2;
        int res =search(nums,target);
        System.err.println(res);
    }
}

