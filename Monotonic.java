import java.util.*;
public class Monotonic{

    public static boolean checkMonoTonic(ArrayList <Integer> list){

boolean inc = true;
boolean decre = true;
        for(int i=0; i<list.size() -1;i++){
            if(list.get(i)<list.get(i+1)){
               decre = false;
            }
            if(list.get(i)>list.get(i+1)){
                inc = false;
             }

        }
     return  inc || decre;
    }

    public static void main(String args[]){

        ArrayList <Integer> list = new ArrayList<>();
       
           list.add(1);
            list.add(2);
         list.add(2);
         list.add(3);

         System.out.println(checkMonoTonic(list));
    }
}