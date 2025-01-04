import java.util.HashSet;
class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        int result = 0;

        for(char c= 'a';c<='z';c++)
        {
            int first = s.indexOf(c);
            int last = s.lastIndexOf(c);

            if(first!=-1 && last>first+1)
            {
                HashSet<Character> middleChars = new HashSet<>();
                for(int i =first+1;i<last;i++)
                {
                    middleChars.add(s.charAt(i));
                }
                result = result +middleChars.size();
            }
        }
        return result;
    }
}