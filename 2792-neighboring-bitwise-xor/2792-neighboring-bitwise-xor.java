class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        if (isvalidoriginal(derived,0))
        {
            return true;
        }

        return isvalidoriginal(derived,1);
    }

    private boolean isvalidoriginal(int[] derived,int startvalue)
    {
        int n=derived.length;
        int[] original = new int[n];
        original[0] =startvalue;

        for(int i=1;i<n;i++)
        {
            original[i] = derived[i-1]^original[i-1];
        }

        return (original[n-1] ^ original[0]) == derived[n-1];
    }
}