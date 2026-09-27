import java.util.*;
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long res = 1;
        for(int j = 0; j <= rowIndex; j++){
        ans.add((int)res);
        res = res * (rowIndex-j)/(j+1);
        }
        return ans;
    }
}