public class MultiBranch {
    static void fun(int n){
        if(n<=0){
            return;
        }
        System.out.println("stack build " +n);
        fun(n-1);
        System.out.println("n-1 Stack in between " +n);
        fun(n-2);
        System.out.println("n-2 stack fall " +n);
        fun(n-3);
        System.out.println("n-3 fall "+n);
    } 
    public static void main(String[] args) {
        fun(5);
    }
    
}
