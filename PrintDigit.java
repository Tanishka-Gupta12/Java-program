

public class PrintDigit {
    public static void main(String[] args) {
        //scanner act as buffer
       
        int num=12345;
        int count =0;
        int copy=num;
        int power=0;
        while (copy!=0) {
            copy=copy/10;
            count++;
            
        }
        while (num!=0) {
            
        
         power=(int)Math.pow(10, count-1);
         System.out.println(num/power);
         num=num%power;//make no small
         count--;
        }
        
            
        }
        
}

