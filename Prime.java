public class Prime {
    public static void main(String[] args) {
        int num=36;
        //for(int i=2;i<Math.sqrt(num);i++){
            for(int i=2;i*i<num;i++){  
            if(num % i==0){
                System.out.println("Not prime");
                return;
            }
        }
        System.out.println("Prime no");
    }
}
