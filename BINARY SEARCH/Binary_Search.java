public class Binary_Search{
    public static int binarysearch(int[] arr,int target){
        int f =0;
        int l =arr.length-1;
        while(f<=l){
            int m = f+((l-f))/2;
            if (target == arr[m]) {
                return m;
            }
            else if(target<arr[m]){
                l = m-1;
            }
            else{
                f= m+1;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int target = 40;
        int result = binarysearch(arr, target);
        System.out.println(result);
    }
}