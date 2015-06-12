package LinkedList;
/**
 *
 * @author Hilary Brobbey
 */
public class Program {
    
    public static void main(String[] args){
        
        //LinkedList<String> myLList = new LinkedList<>();
        LinkedList<String> myLList = new LinkedList<>("Start");
        myLList.add("A");
        myLList.add("B");
        myLList.add("C");
        myLList.add("D");
        System.out.println(myLList);  
        System.out.println(myLList.length);
        System.out.println(myLList.head.data);
        myLList.delete("C");
        System.out.println(myLList);  
        System.out.println(myLList.length);
        
        
        
        System.out.println("\n");
        LinkedList<Integer> myLList2 = new LinkedList<>();
        myLList2.add(1);
        myLList2.add(2);
        myLList2.add(3);
        myLList2.add(4);
        System.out.println(myLList2);  
        System.out.println(myLList2.length);
        System.out.println(myLList2.head.data);
        
        System.out.println("\n");
        LinkedList<Integer> myLList3 = new LinkedList<>();
        System.out.println(myLList3);  
        System.out.println(myLList3.length);
        System.out.println(myLList3.head.data);
 
    }
    
}
