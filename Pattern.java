 class Pattern{
    static void printStar(int star){
        if (star==0){
            return;
        }
        System.out.print("*");
        printStar(star-1);
    }
    static void printLine(int lines){
        if(lines==0){
            return;
        }
        printStar(lines);
        System.out.println();//move it up and down
        printLine(lines-1);
       
        


    }
    public static void main(String[] args) {
        printLine(5);
    }
 }