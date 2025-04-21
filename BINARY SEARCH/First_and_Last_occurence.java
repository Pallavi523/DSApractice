public class First_and_Last_occurence{
    public static int[] First_and_Last_occurence(int[] arr,int k){
        int f=0;
        int l=arr.length-1;
        int[] res ={-1,-1};
        //First Occurence
        while(f<=l){
            int m=f+(l-f)/2;
            if(k==arr[m]){
                res[0]=m;
                l=m-1;
            }
            else if(k<arr[m]){
                l=m-1;
            }
            else{
                f=m+1;
            }
        }
        //Last Occurence
        f=0;
        l=arr.length-1;
        while(f<=l){
            int m=f+(l-f)/2;
            if(k==arr[m]){
                res[1]=m;
                f=m+1;
            }
            else if(k<arr[m]){
                l=m-1;
            }
            else{
                f=m+1;
            }
        }
    return res;
    }
      public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int k = 2;
        int[] result = First_and_Last_occurence(arr, k);
        System.out.println( java.util.Arrays.toString(result));

}
}