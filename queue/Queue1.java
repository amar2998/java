import java.util.*;
class Queue1{
    public static void main(String args[]){
        Queue<Integer> q1=new LinkedList<>();
        q1.add(1);
        q1.offer(2);
        q1.add(3);
        System.out.println("Queue: "+q1);

        System.out.println("Front element: "+q1.peek());
        System.out.println("Front element: "+q1.element());
        System.out.println("Queue size: "+q1.size());
        System.out.println("Queue is empty: "+q1.isEmpty());
        
        // q1.poll();
        // System.out.println("Queue: "+q1);
        // q1.remove();
        // System.out.println("Queue: "+q1);
    }
}