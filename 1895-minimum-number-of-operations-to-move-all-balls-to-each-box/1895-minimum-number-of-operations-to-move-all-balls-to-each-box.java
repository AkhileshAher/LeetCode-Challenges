class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int [] answer = new int[n];

        int cnt =0;
        int oper = 0;
        for(int i=0;i<n;i++)
        {
            answer[i]=oper;
            if(boxes.charAt(i)=='1')
            {
                cnt++;
            }
            oper +=cnt;
        }

        cnt =0;
        oper = 0;
        for(int i=n-1;i>=0;i--)
        {
            answer[i] += oper;
            if(boxes.charAt(i)=='1')
            {
                cnt++;
            }
            oper +=cnt;
        }
        return answer;
    }
}