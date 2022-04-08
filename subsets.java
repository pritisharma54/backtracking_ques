class Solution {
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> curr = new ArrayList<>();
        int start=0;
        bt(start,curr,nums);
        
        return res;
    }
    
    public void bt(int start, ArrayList<Integer> curr,int[] nums){
        res.add(new  ArrayList<Integer>(curr));
        
        for(int i=start;i<nums.length;i++){
            curr.add(nums[i]);
            bt(i+1,curr,nums);
            curr.remove(curr.size()-1);
        }
    }
}
