public class Seach_in_nearly_sorted_array{
    public static  int search(int[] arr,int target){
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==target){
                return m;
            }
            if(m-1>=l && arr[m-1]==target){
                return m-1;
            }
            if(m+1<=r && arr[m+1]==target){
                return m+1;
            }
            if(arr[m]>target){
                r=m-2;
            }
            else{
                l=m+2;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
    
        int[] arr={10,4,30,20,60,55};
        int target=20;
        int result=search(arr, target);
        System.out.println(result);
    }
}