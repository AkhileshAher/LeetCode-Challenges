class Solution {
    public int prefixCount(String[] words, String pref) {
        int cnt = 0;
        int preflength = pref.length();

        for(String word : words)
        {
            if(word.length() >=preflength && word.substring(0,preflength).equals(pref))
            {
                cnt++;
            }
        }
        return cnt;
    }
}