public class ProductOfDigit {
    public static void main(String[] args) {
        int ans=  product(505);
        System.out.println(ans);
        
    }
    static int product (int n){
        if(n%10==n){
            return n;
        }//base condition
        return (n%10) * product(n/10);
        



    }
}
