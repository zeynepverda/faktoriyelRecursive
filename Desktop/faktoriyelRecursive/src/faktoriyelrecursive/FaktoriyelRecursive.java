
package faktoriyelrecursive;

import java.util.Scanner;
public class FaktoriyelRecursive {

  
    public static void main(String[] args) {
        try {
            System.out.println("faktoriyeli alınacak sayıyı giriniz:");
            Scanner input = new Scanner(System.in);
            double numTaken = input.nextDouble();
        } if(numTaken<=0){
            throw new IllegalArgumentException("Faktoriyeli alınacak sayı 0'dan büyük olmalıdır");
        }
            int num = (int) numTaken;
            int result = faktoriyelRecursive(num);
            System.out.println("result:" + result);

        }
    public static int faktoriyelRecursive(int num){
        if(num>1){
            return num*faktoriyelRecursive(num-1);
        }
        return 1;
}
}