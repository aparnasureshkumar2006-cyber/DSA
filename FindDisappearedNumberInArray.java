import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindDisappearedNumberInArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}
