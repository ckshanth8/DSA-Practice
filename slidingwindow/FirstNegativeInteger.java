import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class FirstNegativeInteger 
{
    public static ArrayList<Integer> firstNegativeInteger(ArrayList<Integer> arr, int k, int n)
    {
        //    Write your code here.
        int start=0, end=0;
        ArrayList<Integer> negList=new ArrayList<>();
        ArrayList<Integer> ansList=new ArrayList<>();

        while(end<n){
            //calculation
            if(arr.get(end)<0){
                negList.add(arr.get(end));
            }

            if(end-start+1<k){
                end++;
            }

            else if(end-start+1==k){
                //geting answer from calculation
                if(negList.isEmpty()){
                    ansList.add(0);
                } else{
                    ansList.add(negList.get(0));

                    if(negList.get(0)==arr.get(start)){
                        negList.remove(0);
                    }
                }
                end++;
                start++;
            }
        }
        return ansList;
    }
}
