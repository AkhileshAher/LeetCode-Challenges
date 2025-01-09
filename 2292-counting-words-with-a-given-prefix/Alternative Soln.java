class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
        int size=pref.length();
        for(int i=0;i<=words.length-1;i++){
            if(words[i].length()>=size){
            if(words[i].substring(0,size).equals(pref)){
                count++;
            }
            }
        }
        return count;
    }
}
