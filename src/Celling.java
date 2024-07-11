public class Celling {
    public static void main(String[] args) {
        int[]arr = {2,3,5,9,14,16,18};
        int target = 60;
        int ans = celling(arr,target);
        System.out.println(ans);
    }
    //return the index of smallest element no>=target
    static int celling(int[]arr,int target ){
        //but what if the target number is greater than the greatest element in the array
        if(target>arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            //find the middle element
            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            }
            else if(target>arr[mid]){
                start = mid+1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return start;
    }
}
