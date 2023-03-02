import java.util.*;
public class ContainnerWaterOptimumSoln {
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

        int i=0;
        int j = list.size()-1;
        int  max_area = Integer.MIN_VALUE;
        while(i<j){
                int min_height  = Math.min(list.get(i), list.get(j));
                int width = j-i;
                int area = min_height*width;
                max_area = Math.max(max_area, area);

                if(list.get(i)< list.get(j)){
                    i++;
                }
                else{
                    j--;
                }
        }
        
System.out.println(max_area);


    }
    
}

    

