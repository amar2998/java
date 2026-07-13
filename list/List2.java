import java.util.*;

class List2{
    public static void main(String[] args){
        List<Integer> list01 = new ArrayList<>();
        list01.add(3);
        list01.add(1);
        list01.add(2);
        list01.add(4);
        list01.add(5);

        Collections.sort(list01,Collections.reverseOrder());
        System.out.println("List: " + list01);
        Collections.reverse(list01);
        System.out.println("List: " + list01);
        Collections.shuffle(list01);
        System.out.println("List: " + list01);
        Collections.swap(list01,0,1);
        System.out.println("List: " + list01);
        Collections.rotate(list01,2);
        System.out.println("List: " + list01);
        Collections.frequency(list01,10);
        System.out.println("List frequency: "+Collections.frequency(list01,10));

        System.out.println("List min: "+Collections.min(list01));
        System.out.println("List max: "+Collections.max(list01));
    }
}