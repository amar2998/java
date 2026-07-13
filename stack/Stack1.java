import java.util.*;

class Stack1{
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);
        // System.out.println(s.pop() + " Popped from stack");
        // System.out.println("Top element is: " + s.peek());
        // System.out.println("Stack size is: " + s.size());
        // System.out.println("Stack is Empty "+s.isEmpty());
        System.out.println("Stack: "+s.search(30));
    }
}