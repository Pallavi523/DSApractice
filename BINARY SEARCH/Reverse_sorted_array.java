public class Reverse_sorted_array{
    public static int reversebinarysearch(int[] arr, int target){
        int f=0;
        int l=arr.length-1;
        while(f<=l){
            int m=f+((l-f)/2);
            if (target==arr[m]) {
                return m;
            }
            else if(target<arr[m]){
                f=m+1;
            }
            else{
                l=m-1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={50,40,30,20,10,5};
        int target=40;
        int result=reversebinarysearch(arr, target);
        System.out.println(result);
    }
}