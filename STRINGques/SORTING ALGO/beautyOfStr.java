// Simplified Example from LeetCode 1781 Solutions
int ans = 0;
for (int i = 0; i < s.length(); i++) {
    int[] freq = new int[26];
    for (int j = i; j < s.length(); j++) {
        freq[s.charAt(j) - 'a']++;
        
        // Calculate max and min frequency
        int max = 0, min = Integer.MAX_VALUE;
        for (int count : freq) {
            if (count > 0) {
                max = Math.max(max, count);
                min = Math.min(min, count);
            }
        }
        int beauty = max - min; // The line in question
        ans += beauty;
    }
}

