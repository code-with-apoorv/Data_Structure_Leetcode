class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultSets = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(resultSets,new ArrayList<>(), nums,0);
        return resultSets;
    }
    public void backtrack(List<List<Integer>> resultSets,List<Integer> tempSet, int[] nums, int start){
         if(resultSets.contains(new ArrayList<>(tempSet)))
            return;
        resultSets.add(new ArrayList<>(tempSet));
        for(int i = start; i < nums.length; i++){
            tempSet.add(nums[i]);
            backtrack(resultSets, tempSet,nums,i+1);
            tempSet.remove(tempSet.size() - 1);
        }
    }
}