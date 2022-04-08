class Solution {
     List<List<Integer>> res= new ArrayList<>();
     public void bt(int start, ArrayList<Integer> curr,int[] nums) {
         res.add(new  ArrayList<Integer>(curr));
        
        for(int i=start;i<nums.length;i++){
            if(i>start&&nums[i-1]==nums[i])
                continue;
            curr.add(nums[i]);
            bt(i+1,curr,nums);
            curr.remove(curr.size()-1);
        }
        
    }
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        ArrayList<Integer> curr = new ArrayList<>();
        int start=0;
        
        Arrays.sort(nums);
        bt(start,curr,nums);
        
        return res;
    }
   
    
   
}
