public class ArraySearch {
    static boolean isFound(int arr[],int index,int search){
      //base class
        if(arr.length==index){
            return false;
        }
          //element search
        if(arr[index]==search){
            return true;
        }
       
        //small problem
        return isFound(arr, index+1, search);


    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int search=500;
        System.out.println(isFound(arr, 0, search)?"found":"not found");
        
    }
}
