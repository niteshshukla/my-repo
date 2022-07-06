import java.util.Arrays;
import java.util.Collections;

public class MaxNumber {
    public static void main(String[] args) {
        Integer arr[]= {4,2,60,512};
        Arrays.sort(arr, (i1,i2)->{
            String xy=i1.toString()+i2.toString();
            String yx=i2.toString()+i1.toString();

            return yx.compareTo(xy);
                }
        );
        String s="";
        for(Integer i: arr){
            s=s+i.toString();
        }
        System.out.println(Integer.parseInt(s));
    }
}
