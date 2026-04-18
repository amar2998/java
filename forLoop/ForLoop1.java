public class ForLoop1{
    public static void main(String  args[]){
        //index based loop
        for(int i=0;i<90;i++){
            System.out.println(i);
        }
        int i=0;
        while(i<67){
            System.out.println(i);
            i++;
        }

        int j=0;
        do{
            System.out.println(j);
            j++;
        }while(j<20);
        //array based loop
        int arr[]={1,2,3,45,5};
        for( int num : arr){
            System.out.println(num);
        }

        // for(;;){
        //     System.out.println("infinite loop");
        // }

        // for (int j=0,k=0; j<10&&k<20;j++,k++){
        //     System.out.println(j+" "+k);
        // }
        //for loop for string
        String str="Hello World";
        for(int l=0;l<str.length();l++){
            System.out.println(str.charAt(l));

        }

        int s=0;
        for(;s<67;){
            System.out.println(s);
            s++;
        }

    }
}