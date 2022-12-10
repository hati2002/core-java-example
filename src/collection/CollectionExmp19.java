package collection;

import java.lang.reflect.Array;
import java.util.Collections;

public class CollectionExmp19 {
    public static int method(int arr[],int l){
        int i;int j=0;
        int temp[]=new int[l];
        for (i=0;i<l;i++){
             if (arr[i]!=arr[i+1]){
                 temp[j]=arr[i];
                 j++;
             }
        }
        return j;
    }
    public static void main(String[] args) {
        int arr[]={1,2,7,3,3,2,9,6};
        int l=arr.length;
    }
}
