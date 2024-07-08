public class EvenOddSum {
    public static void main(String[] args) {
        int position=0;
        int num=8765;
        int evensum=0;
        int oddsum=0;
        while (num!=0) {
            
       
        int digit=num%10;
        position++;
        if(position%2==0){
            evensum+=digit;
        }
        else{
            oddsum+=digit;
        }
        num=num/10;
    }
    System.out.println("Evensum "+evensum);
    System.out.println("Oddsum "+oddsum);

    }
    
}
