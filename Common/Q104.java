import java.util.*;

public class Q104 {
   public static void main(String args[]){
    int val[] = {60,100,120};
    int weight[] = {10,20,30};
    int w = 50;

    double ratio[][] = new double[val.length][2];

    for(int i=0; i<ratio.length; i++){
        ratio[i][0] = i;
        ratio[i][1] = val[i]/weight[i];
    }

    Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
    
    
    int finalValue = 0;
    for(int i=ratio.length-1; i>=0; i--){
        int indx = (int)ratio[i][0];
        if(w>=weight[indx]){
           finalValue += val[indx];
           w -= weight[indx];
        } else {
           finalValue += (w * ratio[i][1]);
           w =0;
           break;
        }
    }
    System.out.println(finalValue);


   } 
}
