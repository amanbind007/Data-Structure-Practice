
import java.util.*;

public class Main {
    public static void main(String args[]) {
        // hashmap
        HashMap<String,String> hm = new HashMap<String, String>();
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[2000];
        arr = sc.nextLine().toCharArray();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(Character.toString(arr[i]))){
                String cha = hm.get(Character.toString(arr[i]));
                int num = Integer.parseInt(cha);
                num = num +1;
                hm.put(Character.toString(arr[i]),Integer.toString(num));

            }
            else{
                hm.put(Character.toString(arr[i]),"1");
            }
        }
        sc.close();

        System.out.println(hm);
        
    }



}
