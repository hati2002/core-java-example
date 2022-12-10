package collection;

import java.lang.reflect.Array;
import java.util.Collections;

public class CollectionExmp19 {
    public static int method(int arr[],int l){
        int i;
        int temp[]=new int[l];
        int j=0;
        for (i=0;i<l-1;i++){
             if (arr[i]!=arr[i+1]){
                 temp[j++]=arr[i];
             }
        }
        temp[j++]=arr[l-1];
        for (i=0;i<j;i++){
            arr[i]=temp[i];
        }
        return j;
    }
    public static void main(String[] args) {
        int arr[]={1,2,7,3,3,2,9,6};
        int l=arr.length;
        l=method(arr,l);
        for (int k=0;k<l;k++){
            System.out.println(arr[k]+" ");
        }
    }
}
