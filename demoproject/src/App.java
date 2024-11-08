
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);
        // Scanner sc=new Scanner(System.in);
        // String Name=sc.nextLine();
        Vector<Integer> v = new Vector<>(10, 5);
        for (int i = 0; i < 10; i++) {
            v.add(i);
        }
        v.add(10, 10);      // Adding 10 at index 11
        v.add(11);          // Adding 11 at the end
        v.set(3, 0);        // Setting element at index 3 to 0
        v.remove(0);        // Removing element at index 0
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }
        
        
    }
    

}
