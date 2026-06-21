j = left pointer
i = right pointer

class Solution {
    public int characterReplacement(String s, int k) {
        int maxLeng = 0;
        int maxFreq = 0;
        for(int i = 0;i<s.length();i++){
            int freq[] = new int[26];
            for(int j  = i; j<s.length();j++){
                freq[s.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq , s.charAt(j)-'A');
                int length = (j-i+1);
                int change = length- maxFreq;
                while(change <= k){
                    maxLeng = Math.max(maxLeng , length);
                }
            }
        }
        return maxLeng;
    }
}

class Solution {
    public int characterReplacement(String s, int k) {
        //j 
        int left  = 0;
        int maxfreq = 0;
        int maxlength = 0;
        int freq[] = new int[26];
        for(int right = 0;right < s.length();right++){
          freq[s.charAt(right) -'A']++;
            maxfreq = Math.max(maxfreq , freq[s.charAt(right)-'A']);
            while((right - left+1) - maxfreq > k){
                freq[s.charAt(left)-'A']--;
                left ++;
            }
            maxlength = Math.max(maxlength,right-left +1);
        }
        return maxlength;
    }
}