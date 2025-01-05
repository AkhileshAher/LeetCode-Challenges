class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shiftArray = new int[n+1];

        for(int[] shift :shifts)
        {
            int start = shift[0],end=shift[1],direction = shift[2];
            shiftArray[start] +=(direction==1) ? 1 : -1;
            shiftArray[end+1] -=(direction==1) ? 1 : -1;
        }

        StringBuilder result = new StringBuilder(s);
        int cumulativeShift = 0;

        for(int i=0;i<n;i++)
        {
            cumulativeShift = cumulativeShift + shiftArray[i];
            int shift = (cumulativeShift%26+26) % 26;
            char shiftedChar = (char)((s.charAt(i) - 'a' +shift)%26+'a');
            result.setCharAt(i,shiftedChar);
        }
        return result.toString();
    }
}