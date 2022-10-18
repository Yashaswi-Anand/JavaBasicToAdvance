package fandamental;

public class RemoveChar {
    public static void removeCharacter(String data) {
        int n = data.length();
        System.out.print(data.charAt(0));
        for(int i=1;i<n;i++){
            int  count = 1;
            if((int)data.charAt(i-1) > (int)data.charAt(i)){
                System.out.print(data.charAt(i));
            }else if(data.charAt(i-1) == data.charAt(i)){
                System.out.print(data.charAt(i));
            }else{
                if(data.charAt(i) != data.charAt(i+1)){
                    System.out.print(data.charAt(i));
                }else{
                    int j=i+1;
                    while(data.charAt(j) == data.charAt(j+1)) {
                        count = count+1; j++;
                    }
                    i=count-1;
                }
            }
            
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.next();

        removeCharacter("WIINGGIIFFFYYY");
    }
}
