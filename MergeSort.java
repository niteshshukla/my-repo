import com.sun.scenario.effect.Merge;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] ={10,30,15,12,19,12,45,1};

        MergeSort(arr,0,arr.length-1);
        Arrays.stream(arr).forEach(i-> System.out.print(i+" "));

    }

    public static void MergeSort(int arr[],int s, int e){

        if(s>=e){
            return;
        }

        int mid = (e+s)/2;
        MergeSort(arr,s,mid);
        MergeSort(arr,mid+1,e);

        merge(arr,s,mid,e);
    }

    private static void merge(int[] arr, int s,int mid, int e) {

        int length1=mid-s+1;
        int length2= e-mid;

        int[] first= new int[length1];
        int[] second= new int[length2];

        for(int i=0;i<length1;i++){
            first[i]=arr[s+i];
        }
        for(int i=0;i<length2;i++){
            second[i]=arr[mid+1+i];
        }

        int index1=0;
        int index2=0;
        int k=s;
        while(index1<length1&&index2<length2){
            if(first[index1]< second[index2]){
                arr[k++]=first[index1++];
            }
            else
            {
                arr[k++]=second[index2++];
            }
        }
        while(index1<length1){
            arr[k++]=first[index1++];
        }
        while(index2<length2){
            arr[k++]=second[index2++];
        }
    }
}
