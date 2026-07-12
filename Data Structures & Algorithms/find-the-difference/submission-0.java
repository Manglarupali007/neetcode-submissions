class Solution {
    public char findTheDifference(String s, String t) {
      int sum=0;
      for(char i:t.toCharArray()){
        sum+=i;
      }  
      for(char j:s.toCharArray()){
        sum-=j;
      }
      return (char)sum;
    }
}