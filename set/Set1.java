import java.util.*;

class Set1{
    public static void main(String[] args){
        Set<Integer> set1=new HashSet<>();
        set1.add(3);
        set1.add(1);
        set1.add(2);
        set1.add(4);
        set1.add(8);//duplicate value will not be added
        // System.out.println("Set: "+set1);

        Set<Integer> set2=new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        // set3.add(7);
        Set<Integer> set3= new HashSet<>();
        // System.out.println(set2.addAll(set1));
        // System.out.println(set2);
        // if i get at least one unique  element from set1 which is not present in set 3 then it will return true otherwise false
        // System.out.println(set3.retainAll(set1));
        // System.out.println(set3);
        // System.out.println(set1.retainAll(set2));//delete an element which not present in set 2 then true otherwise false
        // System.out.println(set1);

        System.out.println(set2.containsAll(set1));

        System.out.println(set1.removeAll(set2));
        System.out.println(set1);







        // set1.remove(3);
        // System.out.println("Set: "+set1);

        // set1.get(3);
        // System.out.println("Set: "+ set1.contains(3));

        // System.out.println("Set size: "+ set1.size());

        Iterator<Integer> it=set1.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
        // for( Integer i:set1){
        //     System.out.println(i);
        // }

        // set1.forEach((i)->System.out.println(i));
    }
}