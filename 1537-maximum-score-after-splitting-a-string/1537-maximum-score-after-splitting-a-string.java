class Solution {
    public int maxScore(String s) {
        int maxsc=0;
        int zero = 0;
        int one =0;

        for (char c: s.toCharArray())
        {
            if(c=='1')
            one++;
        }

        for (int i=0;i<s.length() - 1;i++)
        {
            if(s.charAt(i) == '0')
            {
                zero++;
            }
            else
            {
                one--;
            }

            maxsc = Math.max(maxsc,zero + one);
        }
        return maxsc;
    }
}