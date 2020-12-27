package stack;
import java.util.Arrays;

public class stack {

    private int[] item = new int[5];
    private int count;

    public void push(int no)
    {
        if(count == item.length)
            System.out.println("Stack OverFlow");
        else
        {
            item[count++] = no;
        }
    }

    public int pop()
    {
        if(count == 0)
            System.out.println("stack UnderFlow");
        return item[--count];
    }

    public int peek()
    {
        if(count == 0)
        {
            System.out.println("Stack UnderFlow");
            return 0;
        }
        return item[count-1];
    }

    public boolean isEmpty()
    {
        return count == 0;
    }

    @Override
    public String toString()
    {
        var con = Arrays.copyOfRange(item,0,count);
        return Arrays.toString(con);
    }
}
