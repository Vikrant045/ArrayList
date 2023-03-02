import java.util.*;
public class LonelyNumsInList {

    public static ArrayList <Integer>  lonelyNums(ArrayList <Integer> list) {
        ArrayList <Integer> newList = new ArrayList<>();
        Collections.sort(list);
        int h =0;
        for(int i=1;i<=list.size()-1;i++){
            if(i==list.size()-1){
                int a = list.get(i)-list.get(i-1);
                if(  a != 1 && a != 0  ){
                    newList.add(list.get(i));
                                }
            }
            else{
            int a = list.get(i)-list.get(i-1);
            if(  a != 1 && a != 0 && list.get(i+1)!=list.get(i) ){
//System.out.println(list.get(i));
newList.add(list.get(i));
            }
        }
        }
return newList;  
    }

    public static void main(String args[]) {

        ArrayList <Integer> list = new ArrayList<>();
       
        list.add(10);
         list.add(6);
      list.add(5);
      list.add(8);
     // list.add(30);

     System.out.println(lonelyNums(list)); 
        
    }
    
}
