public class Reverse {
    public static void main(String[] args) {
        int num=363;
        int reversed=0;
        while(num!=0){
            int digit=num%10;
            reversed=reversed*10+digit;
            num=num/10;
        }
        System.out.println(reversed);

        if(num==reversed){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
           }
        
    }
}
