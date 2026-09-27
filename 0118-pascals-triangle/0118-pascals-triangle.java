class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < numRows; i++){
            List<Integer> row = new ArrayList<>();
            int res = 1;
            for(int j = 0; j <= i; j++){
                row.add(res);
                res = res *(i-j)/(j+1);
            }
            ans.add(row);
        }
        return ans;
    }
}