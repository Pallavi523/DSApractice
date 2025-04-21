public class Count_of_element {
    public  static int count(int[] arr,int k){
        int[] res={-1,-1};
        int f=0;
        int l=arr.length-1;
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
    return res[1]-res[0]+1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 4, 5};
        int k = 2;
        int result = count(arr, k);
        System.out.println(result);
    }
}