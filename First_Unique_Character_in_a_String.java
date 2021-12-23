public int firstUniqChar(String s) {
        int i=0;
        String store_s =s;
        while(i<s.length())
        {
            char c = s.charAt(i);
            String token = Character.toString(c);
            String result = s.substring(0, i) + s.substring(i+1);
            if(result.contains(token))
            {
                i++;
                System.out.println("increment"+i);
            }
            else
            {
                return i;
            }
            s = store_s;
        }
        return -1;
    }
