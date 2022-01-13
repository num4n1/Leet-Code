    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        boolean check = false;
        if(t.length()!=s.length())
        {
            return false;
        }
        for(int i=0;i<s.length();i++)
        {
            map1.put(s.charAt(i) , map1.getOrDefault(s.charAt(i) , 0) +1);
            // if(map1.containsValue(s.charAt(i)))
            // {
            //     map1.put(s.charAt(i) , map1.get(s.charAt(i))+1);
            // }
            // else
            // {
            //     map1.put(s.charAt(i),1);
            // }
        }
        for(int i=0;i<t.length();i++)
        {
            map2.put(t.charAt(i) , map2.getOrDefault(t.charAt(i) , 0) +1);
            // if(map2.containsValue(t.charAt(i)))
            // {
            //     map2.put(t.charAt(i) , map2.get(t.charAt(i))+1);
            // }
            // else
            // {
            //     map2.put(t.charAt(i),1);
            // }
        }
        if(map1.equals(map2))
        {
            return true;
        }
        return false;
    }
