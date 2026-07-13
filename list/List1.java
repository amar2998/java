import java.util.*;


class List1{
    

    public static void main(String[] args) {
        List<Integer> list01 = new ArrayList<>();
        //adding into string 
        list01.add(1);
        list01.add(2);
        list01.add(3);
        list01.add(4);
        list01.add(5);

        Iterator<Integer> it=list01.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("List: " + list01);
        list01.forEach((ele)->System.out.println(ele));

        List<Integer> list02 = new ArrayList<>();
        // adding into string 
        list02.add(1);
        list02.add(2);
        list02.add(3);
        list02.add(4);
        list02.add(5);
        List<Integer> list03 = new ArrayList<>();
        //adding into string 
        list03.add(1);
        list03.add(2);
        list03.add(3);
        list03.add(4);
        list03.add(5);
        List<Integer> list04 = new ArrayList<>();
        //adding into string 
        list04.add(1);
        list04.add(2);
        list04.add(3);
        list04.add(4);
        list04.add(5);
        // System.out.println("List: " + list04);

        List<List<Integer>> list2=new ArrayList<>();
        list2.add(list01);
        list2.add(list02);
        list2.add(list03);
        list2.add(list04);
        Iterator<List<Integer>> it2=list2.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }
        System.out.println(list2.contains(list01));
        System.out.println("List2: " + list2);
        list2.removeAll(list04);
        System.out.println("List2: " + list2);

        System.out.println(list2.get(0).get(0));
        // System.out.println(list2[0][0]);

        List<List<List<Integer>>> list3=new ArrayList<>();
        list3.add(list2);

        
        System.out.println("List3: " + list3);
        list3.remove(list2);
        System.out.println("List3: " + list3);


        List<String> strList1=new ArrayList<>();
        strList1.add("....");
        strList1.add("....");
        strList1.add("....");
        strList1.add("....");
        String strt="reryy";
        System.out.println(strt.charAt(0));
        System.out.println(strList1.get(0).charAt(0));

        System.out.println("strList1: " + strList1);
        list01.add(0,34);
        //set ans add both can be use for the update the value of the list but set is used to update the value of the list and add is used to add the value of the list
        System.out.println("List: " + list01);

        System.out.println("list size "+list01.size());
        System.out.println(list01.contains(1));
        System.out.println(list01.lastIndexOf(1));
        System.out.println(list01.indexOf(1));
        System.out.println(list01.isEmpty());

        Integer[] data = {1, 2, 3, 4, 5}; 
        List<Integer[]> list = Arrays.<Integer[]>asList(data);

        // We have to loop through the list and convert the array to a string manually
        for (Integer[] arr : list) {
            System.out.println("Array inside list: " + Arrays.toString(arr));
        }

        list01.remove(0);
        System.out.println("List: " + list01);
        list01.remove(2);
        System.out.println("List: " + list01);
        // list.removeAll();
        // System.out.println("List: " + list);

        list01.clear();
        System.out.println("List: " + list01);
        // Iterater

    }
}
