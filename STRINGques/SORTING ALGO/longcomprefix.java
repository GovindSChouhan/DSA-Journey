class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        String ref = strs[0];   // first string as reference

        for (int i = 0; i < ref.length(); i++) {
            char ch = ref.charAt(i);

            // compare with same index in all other strings
            for (int j = 1; j < strs.length; j++) {

                // if index out of bound OR mismatch
                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {
                    return ref.substring(0, i);
                }
            }
        }

        // if all characters matched
        return ref;
    }
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < first.length(); i++) {
            if (i < last.length() && first.charAt(i) == last.charAt(i)) {
                ans.append(first.charAt(i));
            } else {
                break;
            }
        }
        return ans.toString();
    }
}