import java.util.Collections;

public class LeastPositiveNumberMissing {
    public static void main(String[] args) {
        int arr[]={-6,3,-2,5,4,2,-1};
        int ans= solve(arr);
        System.out.println(ans);
    }

    private static int solve(int arr[]){
        int j =shift(arr);
        int arr2[]= new int[arr.length-j];
        int k=0;
        for(int i =j; i<arr.length;i++){
            arr2[k]=arr[i];
            k++;
        }
        for(int i: arr2){
            System.out.print(i +" ");
        }
        System.out.println("");
        for(int i=0;i<arr2.length;i++){
            int x=Math.abs(arr2[i]);
            if(x-1<arr2.length && arr2[x-1]>0){
                arr2[x-1]=-arr2[x-1];
            }
        }
        for(int i: arr2){
            System.out.print(i +" ");
        }
        System.out.println("");
        for(int i=0;i<arr2.length;i++){
            if(arr2[i]>0){
                return i+1;
            }
        }

        return arr2.length+1;
    }

    private static int shift(int arr[]){
        int j=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        return j;
    }
}
