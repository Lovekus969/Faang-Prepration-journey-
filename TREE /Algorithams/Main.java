class StackADT {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor
    public StackADT(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    // Push element onto stack
    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = x;
    }

    // Pop element from stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    // Peek top element
    public int peek() {
        if (isEmpty()) return -1;
        return stack[top];
    }

    // Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Size of stack
    public int size() {
        return top + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        StackADT stack = new StackADT(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top: " + stack.peek());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Size: " + stack.size());
    }
}
