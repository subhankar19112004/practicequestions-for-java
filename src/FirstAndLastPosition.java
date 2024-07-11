import java.util.Arrays;

public class FirstAndLastPosition{
    public static void main(String[] args) {
        int nums[] = {5,7,7,8,8,10};
        int target = 8;
        int ans = search(nums,target,true);
        int[] ans2 = falp(nums,target);
        System.out.println(ans);
        System.out.println(Arrays.toString(ans2));
    }
    static int[] falp(int[]nums, int target){
        int[] ans2 = {-1, -1};
        //check for first occurrence if target first(case1)
        /*
        int start = search(nums,target,true);// this can be also applied in the case of (22-24)
        int end = search(nums,target,false);
        ans[0]= start;
        ans[1]= end; 
        return ans;
         */
       ans2[0] = search(nums, target, true);
        if (ans2[0] != -1) {
           ans2[1] = search(nums, target, false);
        }
        return ans2;
    }

    // this function just returns the index value of target
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex==true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    }


