public class floor_of_element{
    public static  int floor(int[] arr,int x){
        int l=0,r=arr.length-1;
        int res=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]<=x){
                res=m;
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={ 1,2,3,5,7,8,9};
        int target=6;
        int result=floor(arr,target);
        System.err.println(result);
    }
} 