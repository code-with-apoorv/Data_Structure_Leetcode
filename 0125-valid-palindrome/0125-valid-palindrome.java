class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String original = "";
        String reverse = "";
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                original = original + s.charAt(i);
            }
        }
        for(int i = original.length()-1; i >= 0; i--){
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            return true;
        }
        else{
            return false;
        }
    }
}