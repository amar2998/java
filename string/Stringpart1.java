public class Stringpart1 {
    public static void main(String[] args) {
        String str = "Hello World";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
        //string to array
        char arr[]=str.toCharArray();
        for(char ch:arr){
            System.out.println(ch);
        }
        //chararr to string 
        String newString= new String(arr);
        System.out.println(newString);

        //concatination 
         String str1="abc";
         String str3="def";
         String str7=str1+" "+str3;
         System.out.println(str7);

         //substring
         String str78="Hello World";
         String subStr=str78.substring(5,7);
        System.out.println(subStr);

        //string methods
        String methodsStrnig="sdgsgvdsgdsgdhg";
        System.out.println(methodsStrnig.length());
        System.out.println(methodsStrnig.isEmpty());
        System.out.println(methodsStrnig.toUpperCase());
        System.out.println(methodsStrnig.toLowerCase());
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println(methodsStrnig.codePointAt(1));
        System.out.println(methodsStrnig.codePointBefore(1));
        System.out.println(methodsStrnig.codePointCount(0, 10));
        System.out.println(methodsStrnig.contains("sdg")); //check if the subset is present in the string
        System.out.println(methodsStrnig.contentEquals("sdgsgvdsgdsg")); //check if the string given in params entirely matches the tarhet
        System.out.println(methodsStrnig.endsWith("dg"));
        StringBuilder methodsStrnig2=new StringBuilder("sdgsgvdsgdsgdhg");
        System.out.println(methodsStrnig.contentEquals(methodsStrnig2));
        System.out.println(methodsStrnig.equals(methodsStrnig2));
        //content equals can be compaire string builder and string but contains can not compare that
        System.out.println(methodsStrnig.equalsIgnoreCase("SDGSGVDSGDSGDHG"));

        System.out.println(methodsStrnig.isBlank());
        System.out.println(methodsStrnig.isEmpty());
        System.out.println(methodsStrnig.hashCode());//give the hashcode of the string
        System.out.println(methodsStrnig.indexOf("sgd"));
        System.out.println(methodsStrnig.length());        
        System.out.println(methodsStrnig.matches());//compare using regex
        System.out.println(methodsStrnig.str);




        String stringOne="one";
        String stringThree=new String("one");
        stringThree=stringThree.intern();
        String stringTwo="one";
        System.out.println(stringOne==stringThree);
        String contateString=stringOne.concat(stringTwo);
        System.out.println(contateString);
        System.out.println(stringOne.compareTo(stringTwo));


        String s = "\u2000hello\u2000";
        s=s.trim();//do not remove unicoe whitespace 
        s=s.strip();//remove whitespace with unicode
        System.out.println(s);
        String stringggg="apple dog cat";
        System.out.println(stringggg.replace("apple","mango"));
        System.out.println(stringggg.replaceAll("\\d", "*"));
        System.out.println(stringggg.replaceFirst("apple","mango"));
        String[] strArr=stringggg.split(" ");
        for(String ele: strArr){
            System.out.println(ele);
        }
        System.out.println(stringggg.subSequence(0, 0));//works on charsequence
        System.out.println(String.join("-", "a","b","c"));
        








    }
}