public class FloorInSortedArray {
    public int findFloor(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int result = -1;
        while(low <= high){
            int mid = (low + high) /2;
            if(arr[mid] <= x){
                result = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return result;
    }
}
