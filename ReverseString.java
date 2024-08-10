import java.util.Arrays;

/**
 * ReverseString
 */
public class ReverseString {

    public static void main(String[] args) {
        String str="abnmkhsfryegdf";
        String new1=new StringBuilder(str).reverse().toString();
        System.out.println(new1);
        here strings ae immutable so we convert to char array
        System.out.println(str);
        char []arr=str.toCharArray();//convert to char array
        
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(arr);

        
        String str2=Arrays.toString(arr);


        System.out.println(str2);
    }
   
}