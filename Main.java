import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> myStack = new Stack<>();
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        System.out.println("Before reverse: ");
        System.out.println(myStack);
        Stack<Integer> newStack1 = new Stack<>();
        int m = myStack.size();
        for (int i = 0; i < m; i++) {
            newStack1.push(myStack.pop());
        }
        System.out.println("After reverse: ");
        System.out.println(newStack1);


        Stack<String> myStack2 = new Stack<>();
        myStack2.push("Xin");
        myStack2.push("Chao");
        myStack2.push("Cac");
        myStack2.push("Ban");

        System.out.println("Before reverse: ");
        System.out.println(myStack2);
        Stack<String> newStack = new Stack<>();
        int n = myStack2.size();
        for (int i = 0; i < n; i++) {
            newStack.push(myStack2.pop());
        }
        System.out.println("After reverse: ");
        System.out.println(newStack);

    }


}
