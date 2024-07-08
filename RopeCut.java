public class RopeCut {
    static int rope(int len,int a,int b ,int c){
        if(len==0){
            return 0;
        }
        if(len<0){
            return -1;
        }
        int option1=rope(len-a,a,b,c);
        int option2=rope(len-b,a,b,c);
        int option3=rope(len-c,a,b,c);
        int r=Math.max(Math.max(option1, option2),option3);
        if(r==-1){
            return -1;
        }
        return r+1;

    }
    public static void main(String[] args) {
        int len=15;
        int a=2;
        int b=5;
        int c=1;
        int result=rope(len,a,b,c);
        System.out.println(result);

    }
    
}
