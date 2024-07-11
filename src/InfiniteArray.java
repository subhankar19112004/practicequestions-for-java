public class InfiniteArray {
    public static void main(String[] args) {
        int[]arr = {3,5,7,9,15,90,100,130,140,160,170};
        int target =15;
        System.out.println(ans(arr,target));
    }
      static int  ans(int[]arr,int target){
        //first find the range
       //first start with the size od box 2
            int start=0;
            int end=1;
            //condition for the target to lie in the range
        while(target>arr[end]){
            int temp =end+1;//here temp is the same as new start
            //double the box value
            //then the new end will be as: end=end+size of the box*2
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binarySearch(arr,target,start,end);
    }
    static int binarySearch(int[]arr,int target,int start,int end){
        while(start<=end){
            //find the middle element
            int mid =start+(end-start)/2;
            if(target<arr[mid]){end=mid+1;}
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                //ans found
                return mid;
            }
        }
        return -1;
    }
}
