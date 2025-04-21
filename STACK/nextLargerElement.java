
import java.util.*;

class nextLargerElement {
    public static ArrayList<Integer> nextLargerElement(int[] arr) {
        int n=arr.length;
        Stack<Integer> s= new Stack<>();
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=arr[i]){
                s.pop();
            }
            
            if (s.isEmpty()) {
                res.add(-1);
            }
            else {
                res.add(s.peek());
            }
        s.push(arr[i]);    
        }
        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        ArrayList<Integer> result = nextLargerElement(arr);
        System.out.println(result); // Output: [5, 10, 10, -1, -1]
    }
}
