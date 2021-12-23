public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        if(s.length()==0)
        {
            return true;
        }
        s=s.toLowerCase();
        for(int beginIndex = 0; beginIndex < s.length(); beginIndex++)
        {
            if(s.charAt(beginIndex) != s.charAt(s.length()-1-beginIndex)) {
                return false;
            }
        }
        return true;
    }
