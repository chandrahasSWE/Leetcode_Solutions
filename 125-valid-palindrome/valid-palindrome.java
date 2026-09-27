class Solution {
    public boolean isPalindrome(String s) {
        char[] c=s.toCharArray();
        String s1="";
        for(char ch:c){
          if(Character.isLetterOrDigit(ch)){
            s1+=ch;
          }
        }
        char[] newc=s1.toLowerCase().toCharArray();
        int l=0;
        int r=newc.length-1;
        while(l<r){
            if(newc[l]!=newc[r]){
                return false;
            }
            l++;
            r--;
            
        }
        return true;
    }
}