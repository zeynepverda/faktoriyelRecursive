
package arrrecursivesum;


public class ArrRecursiveSum {

   
    public static void main(String[] args) {
       int []arr={1,2,3,4};
       int index=0;
       int result=sum(arr,index);
       System.out.println(result);
       
    }
    public static int sum(int []arr, int index){
        if(index!= arr.length){
            return arr[index]+sum(arr,index+1);    
        }
        
        return 0;
    }
    
}
