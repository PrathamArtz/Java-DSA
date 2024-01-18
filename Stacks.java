import java.util.Stack;
public class Stacks {

    public static void main(String[] args) {

        // stack =  LIFO data structure. Last-In First-Out|
        //          stores objects into a sort of “vertical tower"
        //          push() to add to the top
        //          pop() to remove from the top


        // uses of stacks?

// 1. undo/redo features in text editors
// 2. moving back/forward through browser history
// 3. backtracking algorithms (maze, file directories)
// 4. calling functions (call stack)


        Stack<String> stack = new Stack<String>();


        System.out.println(stack.empty());  // Tests if this stack is empty.

        stack.push("Luffy");  // "push" Pushes an item onto the top of this stack.
        stack.push("Zoro");
        stack.push("Sanji");
        stack.push("Naruto");
        stack.push("Sasuke");
        stack.push("Kakashi");

        System.out.println(stack.empty());  // Tests if this stack is empty.

        System.out.println(stack);

        System.out.println("pop Method");
        stack.pop();                        // "pop" - Removes the object at the top of this stack and returns that object as the value of this function

        System.out.println(stack);

        System.out.println(stack.peek());   // "peek" Looks at the object at the top of this stack without removing it from the stack.
        System.out.println(stack);

        System.out.println(stack.search("Zoro"));  // search the items form the stack.
        System.out.println();
    }
}
