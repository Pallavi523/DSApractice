import java.util.*;
public class nextSmallerLeft{
    public static ArrayList<Integer> nextSmallerLeft(int[] arr) {
        int n=arr.length;
        Stack<Integer> s= new Stack<>();
        ArrayList<Integer> res= new ArrayList<>(Collections.nCopies(n,-1));
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && s.peek()>=arr[i]){
                s.pop();
            }
            
            if (!s.isEmpty()) {
                res.set(i, s.peek());
            }
        s.push(arr[i]);    
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        ArrayList<Integer> result = nextSmallerLeft(arr);
        System.out.println(result); // Output: [-1, 4, -1, 2, 2]
    }

}