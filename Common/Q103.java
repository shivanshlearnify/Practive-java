import java.util.*;

public class Q103 {
    static class stack{
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data){
            deque.addLast(data);
        }
        public void pop(){
             deque.removeLast();
        }
        public int peek(){
            return deque .getLast();
        }
    }

    public static void main(String args[]){
        stack s = new stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }
    
}
