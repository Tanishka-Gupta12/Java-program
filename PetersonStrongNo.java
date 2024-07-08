public class PetersonStrongNo {
    public static void main(String[] args) {
        int num=15;
        int sum=0;
        int copy=num;
        int c;
       
        while (num!=0) {
            
        

        c=num%10;
        num=num/10;
        int fact=1;
        for (int i = 1; i < c+1; i++) {
            
            fact=fact*i;
            
        }
        sum=sum+fact;
    }
    if (sum==copy) {
        System.out.println("it is a strong no");
        
    }
    else{
        System.out.println("not a strong no");
    }
       


        



        
    }
    
}
//factorial of of digit should be the same no
