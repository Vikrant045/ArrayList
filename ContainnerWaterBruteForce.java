
import java.util.*;
public class ContainnerWaterBruteForce {

    public static void main(String args[]){

        ArrayList<Integer> list = new  ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
 
        int  max_area = Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                int min_height  = Math.min(list.get(i), list.get(j));
                int width = j-i;
                int area = min_height*width;
                max_area = Math.max(max_area, area);
            }
        }
System.out.println(max_area);


    }
    
}
