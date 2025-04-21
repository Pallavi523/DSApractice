public class Ceil_of_element{
    public static int ceil(int[] arr, int x){
        int l=0,r=arr.length-1;
        int res=-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]>=x){
                res=m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6,7,9};
        int x=4;
        int r=ceil(arr,x);
        System.err.println(r);
    }
}