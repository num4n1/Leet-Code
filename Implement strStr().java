class Solution {
public int strStr(String haystack, String needle) 
    {
        java.util.regex.Pattern p=java.util.regex.Pattern.compile(needle);
        java.util.regex.Matcher m=p.matcher(haystack);
        if(m.find())
        {
            return m.start();
        }
        else
        {
            return -1;
        }

    }
}
