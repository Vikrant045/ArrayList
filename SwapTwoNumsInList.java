import java.util.*;
public class SwapTwoNumsInList {

    public static void swap(ArrayList<Integer> list,int i,int j) {

        int temp = list.get(j);


        list.set(j,list.get(i));
        list.set(i, temp);
        
    }
    public static void main(String args[]){


    ArrayList <Integer> list = new ArrayList<>();
    list.add(1);
     list.add(2); list.add(3); list.add(4); list.add(5);

     System.out.println(list);
     swap(list,0,list.size()-1);
     System.out.println(list);
    
    

    
}
    
}
