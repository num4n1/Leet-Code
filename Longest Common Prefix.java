class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) 
        {
            return "" ;
        }
        String result = "";
        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1 ].toCharArray();
        for (int i = 0; i < first.length; i++) {
            if (first[i] == last[i]) {
                result+=first[i];                
            }
            else
                return result;
        }
        return result;
        
    }
}
