import java.util.Scanner;
import java.util.*;
class Recusion1{
    static void printNumber(int number){
        if(number==0){
            return;
        }
        else{
            System.out.println(number);
            number--;
            printNumber(number);
        }
    }

    static int factorial(int number){
        if(number==0){
            return 1;
        }else{
            return number*factorial(number-1);
        }
    }
    static int sum(int n){
        if(n==0){
            return n;
        }
        else
        {
            return n+sum(n-1);
        }
    }
    static int fibonnaci(int number){
        if(number==0){
            return number;
        }
        else if(number==1){
            return number;
        }
        else{
            return fibonnaci(number-1)+fibonnaci(number-2);
        }
    }

    static boolean isSorted(int[] arr,int n){
        if(n==1){
            return true;
        }
        else if(n!= 1 && arr[n-1]<arr[n-2]){
            return false;
        }
        else{
            return isSorted(arr,n-1);
        }
    }

    static int binariSearch(int[] arr,int left,int right,int target){
        if(left >= right){
            return -1;
        }
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if (arr[mid] > target){
            return binariSearch(arr,left,mid-1,target);
        }
        else{
            return binariSearch(arr,mid+1,right,target);
        }
    } 

    static void printSubsets(int[] arr,List<Integer> list,int index){
        if(index==arr.length){
            for( int i:list){
                System.out.print(i);
            }
            System.out.println();
            return;
        }
        else{
            list.add(arr[index]);
            printSubsets(arr,list,index+1);
            list.remove(list.size()-1);
            printSubsets(arr,list,index+1);
        }
        
    }

    
    public static void main(String []args){
        // Scanner sc=new Scanner(System.in);
        // int number=sc.nextInt();

        // printNumber(number);

        // System.out.println(factorial(number));
        // System.out.println(sum(number));
        int arr[]={1,2};
        // System.out.println(fibonnaci(number));
        // System.out.println(isSorted(arr,arr.length));
        // System.out.println(binariSearch(arr,0,arr.length,5));

        // List<Integer> list=new ArrayList<>();

        // printSubsets(arr,list,0);
        int n=4;
        List<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String str="";
            for(int j=0;j<nj++){
                str+=".";
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }





    }
}