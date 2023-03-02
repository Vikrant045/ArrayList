import java.util.*;
public class MaxInArrayList {
    public static void main(String args[]){

        ArrayList <Integer> list = new ArrayList<>();
        list.add(1);
         list.add(2); list.add(3); list.add(4); list.add(5);
       //  list.add(200); list.add(12323); list.add(42); list.add(5);
int max = Integer.MIN_VALUE;
         for(int i=0;i< list.size();i++){
     max = Math.max(max, list.get(i));
           
         }
         System.out.print(max+" ");

        
    }

}
