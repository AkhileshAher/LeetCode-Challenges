class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int [] maxfreq = new int [26];

        for(String word : words2)
        {
            int[] temp = new int[26];
            for( char c: word.toCharArray())
            {
                temp[c - 'a']++;
            }

            for(int i=0;i<26;i++)
            {
                maxfreq[i] = Math.max(maxfreq[i],temp[i]);
            }
        }


        List<String> res = new ArrayList<>();
        for(String word : words1)
        {
            int [] count = new int[26];
            for(char c : word.toCharArray())
            {
                count[c-'a']++;
            }
            boolean isUniversal = true;
            for(int i = 0;i<26;i++)
            {
                if (count[i] < maxfreq[i]) {
                    isUniversal = false;
                    break;
                }
            }
        if (isUniversal) res.add(word);
        }
    return res;
    }
}