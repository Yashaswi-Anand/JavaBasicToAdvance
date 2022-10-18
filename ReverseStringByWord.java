import java.util.*;


public class ReverseStringByWord {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
      
        String str = sc.nextLine();
        
        int start= 0;
        int end = 0;
        String ans ="";
    
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                end = i;
                ans = str.substring(start,end) + " "+ ans;
                start = i+1;
            }
        }
        ans = str.substring(start) + " "+ ans;
        
    
        System.out.print(ans);
    }
}
