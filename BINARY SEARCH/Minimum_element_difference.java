public class Minimum_element_difference{
    public static int difference(int[] arr,int k){
        int l=0,r=arr.length-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]==k){
                return arr[m];
            }
            if(k<arr[m]){
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        int a=(arr[l]-k);
        int b=(arr[r]-k);
        if (Math.abs(a) >= Math.abs(b)){
            return arr[r];
        }
        else{
            return arr[l];
        }


    }
    public static void main(String[] args) {
        int[] arr={6,8,10,12,15};
        int k=14;
        int result=difference(arr,k);
        System.err.println(result);

    }
}