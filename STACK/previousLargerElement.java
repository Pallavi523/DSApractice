import java.util.*;
public class previousLargerElement {
    public static ArrayList<Integer> previousLargerElement(int[] arr) {
        int n=arr.length;
        Stack<Integer> s= new Stack<>();
        ArrayList<Integer> res= new ArrayList<>();
        for(int i=0;i<n;i++){
            if(s.isEmpty()){
                res.add(-1);
            }
            else if(!s.isEmpty() && s.peek()>arr[i]){
                res.add(s.peek());
            }
            else if(!s.isEmpty() && s.peek()<=arr[i]){
                while(!s.isEmpty() && s.peek()<=arr[i]){
                    s.pop();
                }
                if(s.isEmpty()){
                    res.add(-1);
                }
                else{
                    res.add(s.peek());
                }
            }
        s.push(arr[i]);    
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        ArrayList<Integer> result = previousLargerElement(arr);
        System.out.println(result); // Output: [-1, -1, 5, -1, 10]
    }
}