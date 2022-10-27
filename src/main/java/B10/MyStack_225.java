package B10;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack_225 {
    // Dung queue
    Queue<Integer> queue = new LinkedList<>();

    public MyStack_225() {
    }

    // them vao dau
    public void push(int x) {
        queue.offer(x);
        for (int i = 0; i < queue.size() - 1; i++) {
            queue.offer(queue.poll());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
    // dung deque
//    Deque<Integer> deque = new ArrayDeque<>();
//    public MyStack() {
//    }
//    public void push(int x) {
//        deque.push(x);
//    }
//
//    public int pop() {
//        return deque.pop();
//    }
//
//    public int top() {
//        return deque.peek();
//    }
//
//    public boolean empty() {
//        return deque.isEmpty();
//    }
}
