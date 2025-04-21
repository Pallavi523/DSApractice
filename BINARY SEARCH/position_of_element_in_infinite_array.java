public class position_of_element_in_infinite_array{
    public static int position(int[] arr,int x){
        int l=0,r=1;
        while(x>arr[r]){
            l=r;
            r=r*2;
        }
        return  indexof1(arr,l,r);
    }
    
    public static int indexof1(int[] arr,int l,int r){
        int mid=l+(r-l)/2;
        int res=-1;
        if(arr[mid]==1){
            res=mid;
            r= mid-1;
        }
        else{
            l= mid+1;
        }
        return res;
    }
}