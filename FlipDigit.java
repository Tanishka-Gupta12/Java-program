public class FlipDigit {
    public static void main(String[] args) {
        int num=32145;
        int position=0;
        int sum=0;
        while(num!=0){
        int digit=num%10;//last digit
        position++;
        int pow =(int) Math.pow(10, digit-1);//because we have 10 in initialization
        sum=sum+position*pow;
        num=num/10; //to make number small
        }
        System.out.println(sum);




    }
    
}
