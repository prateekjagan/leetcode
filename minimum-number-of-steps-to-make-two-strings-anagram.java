/*
https://leetcode.com/problems/minimum-number-of-steps-to-make-two-strings-anagram/
See Approach #2 inside - https://leetcode.com/problems/valid-anagram/solution/
01/01/21
*/

class Solution {
    public int minSteps(String s, String t) {
        int minChar = s.length();
        HashMap<Character, Integer> anagram = new HashMap<>();
        for(char i : s.toCharArray()){
            if (anagram.containsKey(i))
                anagram.put(i, anagram.get(i)+1);
            else
                anagram.put(i,1);
        }
        for(char i : t.toCharArray())
        {
            if(anagram.containsKey(i) && anagram.get(i)!=0)
            {
                anagram.put(i, anagram.get(i)-1);
                minChar--;
            }
                
        }
      return minChar;
    }
}
