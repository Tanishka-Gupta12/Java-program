public class Armstrong {
    public static void main(String[] args) {
        int num=765;
        int sum=0;
        int c;
        int copy=num;
        while (num!=0) {
            
        
        c=num%10;
        num=num/10;
        int power=(int)Math.pow(c, 3);
        sum=sum+power;
       



       
        }
        if (sum==copy) {
            System.out.println("it is a armstrong no");
            
        }
        else{
            System.out.println("not a armstrong no");
        }

     

    }
}
