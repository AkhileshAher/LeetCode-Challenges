class Solution {
    public boolean canConstruct(String s, int k) {
        Map<Character , Integer> freqmap = new HashMap<>();
        for (char c : s.toCharArray())
        {
            freqmap.put(c,freqmap.getOrDefault(c,0) + 1);
        }

        int oddCount = 0;
        for(int cnt : freqmap.values())
        {
            if(cnt % 2 !=0)
            {
                oddCount++;
            }
        }

        return oddCount <=k && k <= s.length();
    }
}