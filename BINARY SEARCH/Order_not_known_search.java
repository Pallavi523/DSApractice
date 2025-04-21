public class Order_not_known_search{
    public static int find_order (int[] arr,int target){
        int f =0;
        int l =arr.length-1;
        while(f<=l){
            int m = f+((l-f))/2;
            if (arr[0]<arr[1]){
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
             else {
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
            
        }
        return -1;
    }

    public static void main(String[] args) {
         int[] arr={50,40,30,20,10,5};
        int target=40;
        int result=find_order(arr, target);
        System.out.println(result);
    }
}