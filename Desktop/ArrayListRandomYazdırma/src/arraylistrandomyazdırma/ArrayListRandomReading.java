
package arraylistrandomyazdırma;
import java.util.ArrayList;
import java.util.Random;
public class ArrayListRandomReading {

   
    public static void main(String[] args) { 
        ArrayList<String> list1=new ArrayList<>();
        list1.add("zeynos");
        list1.add("mehmet");
        list1.add("melike");
        list1.add("rüstem");
        Random random=new Random();//every element can be write couple of times
        for (int i = 0; i < list1.size(); i++) {
            int a=random.nextInt(list1.size());
            System.out.println(list1.get(a));
        }
    }
}

