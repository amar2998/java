import java.util.Map;
import java.util.HashMap;
/**
 * RomanToInt
 */
public class RomanToInt {

    public static void main(String[] args) {
        // System.out.println("hello");
        String str="XXIII";
        int ans=function(str);
        System.out.println(ans);

    }
    static int function(String st){
        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int result=0;
        for(int i=0;i<st.length();i++){
            if(i >0 && map.get(st.charAt(i)) > map.get(st.charAt(i-1))){
                result+=map.get(st.charAt(i)) - 2 * map.get(st.charAt(i-1)); 
            }
            else{
                result+=map.get(st.charAt(i));
            }
        }
        return result;
    }
}