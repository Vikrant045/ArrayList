import java.util.*;

public class MultiDimensionalArrayList{

    public static void main(String args[]) {

        ArrayList<ArrayList<Integer>> lists = new  ArrayList<>();

        ArrayList<Integer> l1 = new ArrayList<>();

        l1.add(2);l1.add(4);l1.add(6);l1.add(8);l1.add(10);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(3);l2.add(6);l2.add(9);l2.add(12);l2.add(15);

        ArrayList<Integer> l3 = new ArrayList<>();
        l3.add(4);l3.add(8);l3.add(12);l3.add(16);l3.add(20);

        lists.add(l1);
        lists.add(l2);
        lists.add(l3);

      //  System.out.println(lists);

      for(int i=0;i<lists.size();i++){
        ArrayList<Integer> newList = lists.get(i);
        for(int j=0;j<newList.size();j++){
System.out.print(" "+newList.get(j));
        }
System.out.println();
      }



         
    }
}