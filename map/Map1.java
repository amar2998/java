import java.util.*;

class Map1{
    public static void main(String[] args){
        Map<Integer,Integer> map1=new HashMap<>();
        map1.put(1,2);
        map1.put(2,3);
        map1.put(3,4);
        map1.put(4,1);
        System.out.println("Map: "+map1);
        System.out.println("Map size: "+map1.size());   
        map1.putIfAbsent(8,5);
        System.out.println("Map: "+map1);
        map1.compute(3,(key,value)->value+1);
        
        System.out.println("Map: "+map1);
        System.out.println(map1 );//return value of key 3

        // System.out.println(map1.replace(1,8,3));
        // // map1.clear();
        // System.out.println("Map: "+map1);

                // System.out.println("Map contains key 3: "+map1.get(3));//return value of key 3
        // System.out.println("Map contains key 5: "+map1.getOrDefault(5,-1));
        // System.out.println("Map contains key 3: "+map1.containsKey(4));
        // System.out.println("Map contains value 4: "+map1.containsValue(4));

        // //forupdate
        // map1.put(4,10);
        // System.out.println("Map: "+map1);

        // map1.remove(4,10);
        // System.out.println("Map: "+map1);


        // // for(Map.Entry<Integer,Integer> entry:map1.entrySet()){
        // //     System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
        // // }
        // for( Integer key:map1.keySet()){
        //     System.out.println("Key: "+key+" Value: "+map1.get(key));
        // }

        // for(Integer value:map1.values()){
        //     System.out.println("Value: "+value);
        // }
    }
}