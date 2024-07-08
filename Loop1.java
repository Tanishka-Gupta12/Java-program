public class Loop1 {
    public static void main(String[] args) {
        int num = 13;
        //int count=0;
     /*   for (int i=1;i<=num;i++) 
        { 
           if(num%i==0){
            count++;
           }
            
        }
        System.out.println(count==2?"Prime":"Not prime");
        */ 
        for (int i=2;i<num;i++){
        if(num%i==0){
            System.out.println("not a prime");
            return;
        }
            
       


        }
        System.out.println("prime no.");
    }
    
    }

