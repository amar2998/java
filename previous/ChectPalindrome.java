/**
 * ChectPalindrome
 */
public class ChectPalindrome {

    public static void main(String[] args) {
        String str="abccba";
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i)); //for string we have to use charAt() method to get the character at a particular index
        }
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]); //for char array we can directly access the character using index
        }
        // int i=0;
    //    int j=arr.length-1;
    //    while (i<=j){
    //     if(arr[i]==arr[j]){
    //         i++;
    //         j--;
    //     }
    //     else{
    //         System.out.println("not a palindrome");
    //     }
        
    // }
    // System.out.println("Is a palindrome");

    }
}