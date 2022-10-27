package B10;

import java.util.Stack;

public class MyQueue_232 {
    Stack<Integer> stack_in = new Stack<>();
    Stack<Integer> stack_out = new Stack<>();

    public MyQueue_232() {
    }

    // them vao duoi cua stack_in
    public void push(int x) {
        while (!stack_in.empty())
            stack_out.push(stack_in.pop());

        stack_in.push(x);

        while (!stack_out.isEmpty())
            stack_in.push(stack_out.pop());
    }

    // lay cai dau
    public int pop() {
        if (stack_in.isEmpty())
            return -1;
        return stack_in.pop();
    }

    public int peek() {
        if (stack_in.isEmpty())
            return -1;
        return stack_in.peek();
    }

    public boolean empty() {
        return stack_in.isEmpty();
    }
}
