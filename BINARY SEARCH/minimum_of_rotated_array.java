public class minimum_of_rotated_array{
    public static int minimum(int nums[]){
        int l = 0;
        int r = nums.length - 1;
        int n = nums.length;

        while (l <= r) {
            
            if (nums[l] <= nums[r]) {
                return nums[l];
            }

            int m = l + (r - l) / 2;
            int next = (m + 1) % n;
            int prev = (m + n - 1) % n;

            // Check if mid is the minimum
            if (nums[m] <= nums[next] && nums[m] <= nums[prev]) {
                return nums[m];
            }
            if (nums[l] <= nums[m]) {
                l = m + 1;
            } 
            else {
                r = m - 1;
            }
        }

        return -1;  
    }

    public static void main(String[] args) {
      int[] nums={4,5,6,1};
      int res = minimum(nums);
      System.err.println(res);
    }
    }
