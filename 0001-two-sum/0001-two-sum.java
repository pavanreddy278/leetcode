class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        int res[]=new int[2];
        for(int i=0;i<n;i++)
        {
            int key=target-nums[i];
            if(map.containsKey(key))
            {
               res[0]=i;
               res[1]=map.get(key);
               break;
            }
            else 
            {
                map.put(nums[i],i);
            }
        }
       return res;
    }
}

