public class Next_letter{
    public static char nextletter(char[] arr,char x){
        int l=0,r=arr.length-1;
        char res=arr[0];
        while(l<=r){
            int m=l+(r-l)/2;
            if(arr[m]>x){
                res=arr[m];
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'd', 'g', 'h', 'i'};
        char x = 'h';
        char result = nextletter(arr, x);
        System.err.println(result);

    }
}