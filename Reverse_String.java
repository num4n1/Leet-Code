public void reverseString(char[] s) {
        int counter=0;
        char first = s[0];
        int length = s.length;
        for(int i=0; i<length/2; i++)
        {
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }