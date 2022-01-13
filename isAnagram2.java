    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        if(Arrays.equals(cs,ct))
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
