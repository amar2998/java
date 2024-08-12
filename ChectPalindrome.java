/**
 * ChectPalindrome
 */
public class ChectPalindrome {

    public static void main(String[] args) {
        String str="abccba";
        char[] arr=str.toCharArray();
       int i=0;
       int j=arr.length-1;
       while (i<=j){
        if(arr[i]==arr[j]){
            i++;
            j--;
        }
        else{
            System.out.println("not a palindrome");
        }
        
    }
    System.out.println("Is a palindrome");

    }
}