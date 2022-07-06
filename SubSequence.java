import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.List;

public class SubSequence {

    public static void main(String[] args) {
        String input="abc";
        int index=0;
        List<String> ans= new LinkedList<>();
        String output="";
        solve(input,output,index,ans);
        ans.stream().forEach(s-> System.out.println(s));
    }

    private static void solve(String input, String output, int index, List<String> ans) {
        if(index>=input.length()){
            if(output.length()>0) {
                ans.add(output);
            }
            return;
        }

        //exclude
        solve(input,output,index+1,ans);

        //include
        Character element=input.charAt(index);
        output=output+element;
        solve(input,output,index+1,ans);
    }
}
