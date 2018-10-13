
package SortPackage;
import java.util.*;

public class BubbleSort {
    
    public static int[] BSort(int[] a){
        
        int[] b = new int[a.length];
        
        for(int i=0; i<a.length; i++){
          for(int j=i; j<(a.length-i-1); j++){ 
            if(a[j]>a[j+1]){
                int tmp = a[j];
                a[j] = a[j+1];
                a[j+1] = tmp;
            }
          }
        }  
        for(int i=0; i<a.length; i++)
            b[i] = a[i];
      
        return b;
    }    
    
    
  public static void main(String[] args){  
      
      int[] unsorted = {2,0,9,5,3,4,1,9};
      System.out.println("Before Bubble Sorting :"+Arrays.toString(unsorted));
      
      int[] sorted = BSort(unsorted);
      System.out.println("After Bubble Sorting :"+ Arrays.toString(sorted));
  }
    
}
