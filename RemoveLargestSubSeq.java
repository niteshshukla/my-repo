public class RemoveLargestSubSeq {
    public static void main(String[] args) {
        String s= "00000987000008700080";
       s= solve(s);
        System.out.println(s);
    }

    private static String solve(String s){
        int startIndex=-1;
        int length=0;
        int ansIndex=-1;
        int maxLength=0;
        if(s.charAt(0)=='0'){
            length=1;
            startIndex=0;
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='0') {
                length++;
                if (s.charAt(i - 1) != '0') {
                    startIndex = i;
                }
            }
            else{
                if(length>maxLength) {
                    ansIndex = startIndex;
                    maxLength = length;
                }
                startIndex=-1;
                length=0;
            }
        }
        System.out.println(ansIndex +" "+ maxLength);
        s=s.replace(s.substring(ansIndex,maxLength),"");
        return s;
    }
}
