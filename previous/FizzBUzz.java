public class FizzBUzz {

    public static void main(String[] args){
    //  System.out.println("hello");  
        function(100);

    }
    static void  function(int n){
        for(int i=1;i<=n;i++){
            if(i%3 == 0&& i%5==0){
                System.out.print("FizzBuzz");
            }
            else if(i%5 ==0){
                System.out.print("Buzz");
            }
            else if(i%3==0){
                System.out.print("Fizz");
            }
            else{
                System.out.print(i);
            }
            System.out.println(" ");
            
        }
    }
}