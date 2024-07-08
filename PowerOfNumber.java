public class PowerOfNumber {
    public static void main(String[] args) {
        int n=3;
        int j=n;
        int m=2;
        for (int i = 1; i < m; i++) {
            /*4=2*2
            8=4*2
            16=8*2
            32=16*2
            */
             n=n*j;


        }
        System.out.println(n);
        
    }
}
