import java.util.*;

public class PermutationOfString {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        boolean[] map = new boolean[nums.length];
        permutation(nums, ans, temp, map);
        return ans;
    }

    public void permutation(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean[] map){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!map[i]){
                map[i] = true;
                ds.add(nums[i]);
                permutation(nums, ans, ds, map);
                ds.remove(ds.size()-1);
                map[i] =false;
            }
        }
    }
}
