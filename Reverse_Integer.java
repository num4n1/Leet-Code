public int reverse(int x) 
    {
        String str = Integer.toString(x);
        char[] c = str.toCharArray();
        
        for(int i=0; i<str.length()/2; i++)
        {
            char temp = c[i];
            c[i] = c[str.length()-1-i];
            c[str.length()-1-i] = temp;
        }
        
        str = String.valueOf(c);
        if(str.charAt(str.length()-1)=='-')
        {
            str = str.substring(0,str.length()-1);
            str = "-"+str;
        }
        
        //checking if the return value falls between the boundaries
        try
        {
            int number = Integer.parseInt(str);
            return number;
        }
        catch(Exception e)
        {
            return 0;
        }
    }
