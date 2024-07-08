public class Loop {
    public static void main(String[] args) {
        int num=123;
        int sum=0;
        //put this in loop
        while (num!=0) {
            
        int digit =num%10;
        sum =sum+digit;//store the digit
        num = num/10;//mak number small
        }
        System.out.println(sum);
    }
        
       
}
