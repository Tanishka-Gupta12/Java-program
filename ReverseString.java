public class ReverseString {

    static String reverse(String str){
        //base case
        if(str.length()==0){
            return "";
        }
        //small problem
        String smallString=str.substring(1);
        String result=reverse(smallString);
        return result+str.charAt(0);
    }
    public static void main(String[] args) {
        System.out.println(reverse("tanishka"));

        
    }
}
