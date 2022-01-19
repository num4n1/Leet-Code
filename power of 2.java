
class check {
    int number;
    boolean check = false;
    check(int number)
    {
        this.number = number;
    }
    boolean checkpower(int number)
    {
        if (number==0)
        {
            return false;
        }
        while(number!=1)
        {
            if(number%2!=0)
            {
                return false;
            }
            number=number/2;
        }
        return true;
    }
    public static void main(String[] args) {
        check D = new check(24);
        Boolean b = D.checkpower(24);
        System.out.println(b);
    }

}
