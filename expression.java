package expression;

import java.util.*;
public class expression {

    private final List<Character> left = Arrays.asList('(','<','[','{');
    private final List<Character> right = Arrays.asList(')','>',']','}');

    public boolean isBalance(String input)
    {
        Stack<Character> st = new Stack<>();

        for( char ch : input.toCharArray())
        {
            if(isLeft(ch))
            {
                st.push(ch);
            }

            if(isRight(ch))
            {
                if (st.empty()) return false;

                var top = st.pop();
                if(!balance(top,ch)) 
                    return false;
            }
        }
        return st.empty();
    }

    private boolean isLeft(char ch)
    {
        return (left.contains(ch));
    }

    private boolean isRight(char ch)
    {
        return (right.contains(ch));
    }

    private boolean balance(char Left,char Right)
    {
        return (left.indexOf(Left) == right.indexOf(Right));
    }
}
