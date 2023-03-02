import java.util.*;
public class PairSumExistsOrNot {

    public static boolean printSum(ArrayList<Integer> list,int target) {
// Brute force 
 /*     int i=0;
      int j = list.size()-1;

      while(i<j){

        int a = list.get(i)+list.get(j);

        if(a==sum){
            return true;
        }
        if(a>sum){
            j--;
        }
        else if(a<sum){
            i++;
        }
      }
      return false;

      */

int bp=-1;
int n = list.size();
for(int i=0;i<n;i++){
    if(list.get(i)>list.get(i+1)){
        bp=i;
        break;
    }
}
int start = bp+1;
int end = bp;

while(start!=end){
    int a = list.get(start)+list.get(end);
    if(a==target){
        return true;
    }
    if(a<target){
        start = (start+1)%n; 
    }
    else {
        end = (n+end-1)%n;
        //start = (start+1)%n; 
    }
}
return false;
    }



    public static void main(String args[]){


        ArrayList <Integer> list = new ArrayList<>();
        list.add(11);
         list.add(15);
          list.add(6);
           list.add(8);
            list.add(9);
         list.add(10);
    int target =16;
         System.out.println(list);
         
       System.out.println(printSum(list,target));  
    }
    
}
