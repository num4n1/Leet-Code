public int countPrimes(int n)
    {
        int i,j,flag;
        int prime =0;
         for (i = 0; i < n; i++) 
         {
            if (i == 1 || i == 0)
            {
                continue;
            }
            flag = 1;
            for (j = 2; j <= i / 2; ++j) 
            {
                if (i % j == 0) 
                {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1)
                prime++;
        }
        return prime;
    }
