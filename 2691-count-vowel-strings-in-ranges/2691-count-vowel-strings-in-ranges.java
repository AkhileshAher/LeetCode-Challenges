class Solution {
    public int[] vowelStrings(String[] words, int[][] queries)
     {
        int n = words.length;
        int[] prefixSum = new int[n + 1];

        for (int i = 0; i < n; i++)
         {
            char start = words[i].charAt(0);
            char end = words[i].charAt(words[i].length() - 1);
            prefixSum[i + 1] = prefixSum[i] + (isVowel(start) && isVowel(end) ? 1 : 0);
        }

        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++)
        {
            int li = queries[i][0], ri = queries[i][1];
            result[i] = prefixSum[ri + 1] - prefixSum[li];
        }

        return result;
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
