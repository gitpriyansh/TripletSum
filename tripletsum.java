
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> a = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
             int low = i + 1;
      int high = nums.length-1;

      while (low < high) {
        int sum = nums[i] + nums[low] + nums[high];

        if (sum == 0) {
 a.add(Arrays.asList(nums[i], nums[low], nums[high]));
  while (low < high && nums[low] == nums[low + 1]) {
                        low++;
                    }
                    while (low < high && nums[high] == nums[high - 1]) {
                        high--;
                    }

                    low++;
                    high--;

        } else if (sum < 0) {
          low++;
        } else {
          high--;
        }
      }
    }
   return a;  }  }

```
