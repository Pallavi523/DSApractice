public class Peak_element{
    public static int Peakelement(int[] arr){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            int m= l+(r-l)/2;
            if(arr[m]>arr[m+1]){
                r=m;
            }
            else{
                l=m+1;
            }
        }
    return l;
    }
    public static void main(String[] args) {
        int[] arr={5,2,9,11,3};
        int res=Peakelement(arr);
        System.err.println(res);
    }
}