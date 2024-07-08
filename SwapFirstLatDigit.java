public class SwapFirstLatDigit {
    public static void main(String[] args) {
        int num=7843;
        int count=0;
        int num1=num;
         int ld=num1%10;
        while (num!=0) {
            num=num/10;
            count++;
        }
        int power=(int)Math.pow(10, count-1);
        int fd= num1/power;
        int mid=num/10;
        mid=mid % (int)Math.pow(10, count-2);
        int result=ld*power+mid*10+fd;
        System.out.println(result);





    }
}
