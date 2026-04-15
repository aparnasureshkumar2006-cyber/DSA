public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        int i = 0;
        for(int j=0;j<k;j++){
            if(nums[j] != val){
                nums[i] =nums[j];
                i++;
            }
        }
        return i;
    }
}
