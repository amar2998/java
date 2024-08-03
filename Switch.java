import java.util.Scanner;
class Switch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int num=sc.nextInt();

        switch(num){
            case 1:{
                System.out.println("you have type number 1");
                break;
            }
            case 2:{
                System.out.println("You have enter the number 2");
                break;
            }
            default:
                {
                    System.out.println("invalid");
                }
        }
        sc.close();

        

    }
}