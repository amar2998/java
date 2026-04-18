import java.util.Scanner;
class Binary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    //  System.out.println("enter first number");
    //  long num1=sc.nextLong();
    //  long num2=sc.nextLong();
    //   System.out.println("addition of the number is"+ (num1+num2));
        // sc.close();//here we are  the scanner work os done to avoid memory leakage
        System.out.println("enter your age");
        int age=sc.nextInt();
        // if(age >=18){
        //     System.err.println("you are eligeble to vote");

        // }
        // else{
        //     System.out.println("You are not elegeble to vote");

        // }
        String val=age>=18 ? "you are eligeble" : "you are not elegeble";
        System.out.println(val);
        
    }
}