import stack.stack;

public class Stack_imp {
    
    public static void main(String[] args) {
        
        stack st = new stack();
        st.push(10);
        st.push(100);
        st.pop();

        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st);
    }
}
