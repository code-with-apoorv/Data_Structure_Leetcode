class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultSet = new ArrayList<>();
        backtrack(resultSet,new ArrayList<>(), nums,0);
        return resultSet;
    }
    public void backtrack(List<List<Integer>> resultSets,List<Integer> tempSet, int[] nums, int start){
        resultSets.add(new ArrayList<>(tempSet));
        for(int i = start; i < nums.length; i++){
            tempSet.add(nums[i]);
            backtrack(resultSets, tempSet,nums,i+1);
            tempSet.remove(tempSet.size() - 1);
        }
    }
}