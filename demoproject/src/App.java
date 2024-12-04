
import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class App {
    // public static int findgcd(int a,int b){
    //     while(b!=0){
    //         int temp=b;
    //         b=a%b;
    //         a=temp;
    //     }
    //     return a;
    //     }
    public static void main(String[] args) throws Exception {
        // Scanner sc=new Scanner(System.in);
        // String name=sc.nextLine();
        // System.out.println(name);
        // Scanner sc=new Scanner(System.in);
        // String Name=sc.nextLine();
        
        // Vector<Integer> v = new Vector<>(10, 5);
        // for (int i = 0; i < 10; i++) {
        //     v.add(i);
        // }
        // v.add(10, 10);      // Adding 10 at index 11
        // v.add(11);          // Adding 11 at the end
        // v.set(3, 0);        // Setting element at index 3 to 0
        // v.remove(0);        // Removing element at index 0
        // for (int i = 0; i < v.size(); i++) {
        //     System.out.println(v.get(i));
        // }
         // Vector<Integer> vec=new Vector<>();
    // for(int i=0;i<10;i++){
    //     vec.add(i);
    // }
    // int first=vec.firstElement();
    // int last=vec.lastElement();
    // int second=vec.get(1);
    // vec.clear();
    // boolean exist=vec.contains(2);
    // boolean e=vec.isEmpty();
    // System.out.println(last);
    // System.out.println(second);
    // System.out.println(exist);
    // System.out.println(e);
    // System.out.println(second);
      
        // Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        // Map<String, Integer> ma = new TreeMap<String, Integer>();
        // Map<String,Integer> m=new HashMap<String,Integer>();
        // map.put("apple",1);
        // map.put("apple",1);
        // map.put("aap",2);
        // map.put("dan",3);
        // map.put("ban",4);
        //  ma.put("apple",1);
        //  ma.put("apple",1);
        // ma.put("aap",2);
        // ma.put("dan",3);
        // ma.put("ban",4);
        //  m.put("apple",1);
        //  m.put("apple",1);
        // m.put("aap",2);
        // m.put("dan",3);
        // m.put("ban",4);
        // for(Map.Entry<String,Integer> entry : map.entrySet()){
        //     System.out.println(entry.getKey() + entry.getValue());
        // }
        // for(Map.Entry<String,Integer> en:ma.entrySet()){
        //     System.out.println(en.getKey()+en.getValue());
        // }
        // for(Map.Entry<String,Integer> e:m.entrySet()){
        //     System.out.println(e.getKey()+e.getValue());
        // }
        // int value1=map.get("apple");
        // int value2=ma.get("apple");
        // m.remove("apple");
        //  int value3=m.get("apple"); // here in java we are getting error when we come to this particular step after executing the other lines from the top and apple key is not present in the map m so that it throughs error but in c++ it defaults 0;
        // System.out.println(value1 + value2);
        
       
    //   Set<Integer> set=new HashSet<>();
    //   for(int i=0;i<5;i++){
    //       set.add(i);
    //   }
    //   boolean exist=set.contains(1);
    // //   for(int i=0;i<5;i++){
    // //       set.remove(i);
    // //   }
    //   int size=set.size();
    //   System.out.println(size);
    
    
    // Trees
    //   class TreeNode<T>{
    //       T value;
    //       List<TreeNode<T>> children;
    //       public TreeNode(T value){
    //           this.value=value;
    //           this.children=new ArrayList<>();
    //       }
    //       public void addChild(TreeNode<T> child){
    //           children.add(child);
    //       }
    //   }
    //   TreeNode<Integer> root=new TreeNode<>(1);
    //   TreeNode<Integer> child=new TreeNode<>(2);
    //   root.addChild(child);
    //   System.out.println(root.value);
        
    //   // Binary TreeNode  
    // class TreeNode<T>{
    //     T value;
    //     TreeNode<T> left,right;
    //     public TreeNode(T value){
    //         this.value=value;
    //         this.left=this.right=null;
    //     }
    // }
    // TreeNode<Integer> root=new TreeNode<>(1);
    // root.left=new TreeNode<>(2);
    // root.right=new TreeNode<>(4);
    // System.out.println(root.value);
    
    
    // //Listnode
    // class ListNode<T>{
    //     T value;
    //     ListNode<T> next;
    //     public ListNode(T value){
    //         this.value=value;
    //         this.next=null;
    //     }
    // }
    


    
        // List list = new ArrayList();  // Raw type (no <E> specified)
        // list.add("Hello");
        // list.add(42);  // Allowed, as raw type ignores type safety
        
        // String str = (String) list.get(0);  // Must cast manually
        // System.out.println(str);  // Output: Hello

        // // Causes runtime error because 42 is not a String
        // Integer num = (Integer) list.get(1);  // ClassCastException
        // System.out.println(num);

        // List<String> list = new ArrayList<>();
        // list.add("Hello");  // Here, E is String
        
    //  Map<String,String> map = new HashMap<>();
    //  map.put("sai","100");
    //  map.put("sai","100");
    //  for(Map.Entry<String,String> entry :map.entrySet()){
    //     System.out.println(entry.getKey());
    //     System.out.println(entry.getValue());
    //  }

     
    }
}
