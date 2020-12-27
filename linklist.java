package linklist;
import java.util.*;

public class linklist
{
    private class Node
    {
        private int val;
        private Node next;

        public Node(int no)
        { this.val = no; }
    }

    private Node head=null;
    private Node tail=null;
    private int size=0;

    public void add(int no)
    {
        var node = new Node(no);

        if(isEmpty())
            head = tail = node;
        else 
        {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    public void addFirst(int no)
    {
        var node = new Node(no);

        if(isEmpty())
        {
            head = tail = node;
        }
        else 
        {
            node.next = head;
            head = node;
        }
        size++;
    }

    public void addLast(int no)
    {
        var node = new Node(no);

        if(isEmpty())
        {
            head=tail=node;
        }
        else 
        {
            tail.next=node;
            tail=node;
        }
        size++;
    }

    public void deleteFirst()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
        }
        else
        {
            head = head.next;
        }
        size--;
    }

    public void deleteLast()
    {
        if(isEmpty())
        {
            System.out.println("Underflow");
        }
        else
        {
            var loc = head;
            var aloc = head;
            while(aloc.next!=null)
            {
                loc = aloc;
                aloc= aloc.next;
            }
            tail = loc;
            tail.next = null;
        }
        size--;
    }

    public boolean contains(int no)
    {
        if (isEmpty())
            System.out.println("Underflow");
        else 
        {
            var temp = head;
            while(temp!=null)
            {
                if(no==temp.val)
                    return (1 == 1);
                temp = temp.next;
            }
        }
        return (0 == 1);
    }

    public void delete(int no)
    {
        if(head.val == no)
        {
            deleteFirst();
        }
        else if(tail.val== no)
        {
            deleteLast();
        }
        else
        {
            var result = getnode(no);
            if (result==null)
            {
                System.out.println("Undefine Value");
            }
            else
            {
                result.next = result.next.next; 
                size--;
            }
        }
    }

    private Node getnode(int no)
    {
        if (isEmpty())
            System.out.println("Underflow");
        else 
        {
            var temp = head;
            var loc = head;
            while(temp != null && temp.val != no)
            {
                loc = temp;
                temp = temp.next;
            }
            if(loc.next!=null)
                return loc;
        }
        return null;
    }

    public int Size()
    {
        return size;
    }

    public int[] toarray()
    {
        int[] arr = new int[size];
        int i=0;
        var temp = head;
        while(temp!=null)
        {
            arr[i++] = temp.val;
            temp = temp.next;
        }
        return arr;
    }

    public void print()
    {
        var temp = head;
        while(temp!=null)
        {
            System.out.print(temp.val+"\n");
            temp = temp.next;
        }
    }

    private boolean isEmpty()
    {
        return head == null;
    }
}