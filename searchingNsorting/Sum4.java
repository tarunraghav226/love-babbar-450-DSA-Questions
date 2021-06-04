import java.util.*;

public class Sum4 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                
                int tar = target - nums[i] - nums[j];
                
                int l = j+1;
                int r = n-1;
                
                while(l<r){
                    if(tar > nums[l] + nums[r]){
                        l++;
                    }
                    else if(tar < nums[l] + nums[r]){
                        r--;
                    }
                    else{
                        List<Integer> lis = new ArrayList<>();
                        lis.add(nums[i]);
                        lis.add(nums[j]);
                        lis.add(nums[l]);
                        lis.add(nums[r]);
                        res.add(lis);
                        
                        while(l < r && lis.get(2) == nums[l]) ++l;
                        while(l<r && lis.get(3) == nums[r]) --r;
                    }
                }
                while(j+1 < n && nums[j] == nums[j+1]) j++;                
            }
                while(i+1 < n && nums[i] == nums[i+1]) i++;
        }
        
        return res;
    }
}
