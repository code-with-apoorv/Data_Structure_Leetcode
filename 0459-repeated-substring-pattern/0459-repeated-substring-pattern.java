
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        boolean result = false;
        for(int i = 1; i <= n/2; i++){
            if(n % i == 0){
                String sub = s.substring(0,i);
                String str = "";
                for(int j = 0; j < n/i; j++){
                    str += sub;
                }
                if(str.equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}