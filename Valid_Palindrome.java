    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(s);
        if(s.length()==0)
        {
            return true;
        }
        s=s.toLowerCase();
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
