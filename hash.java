package hash;

import java.util.LinkedList;

public class hash {
    
    private class Node 
    {
        private int key;
        private String value;

        public Node(int key,String value)
        {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Node>[] Entry = new LinkedList[5];

    public void put(int key,String value)
    {
        int index = Hash(key);

        if(Entry[index] == null)
            Entry[index] = new LinkedList<>();
        
        var bucket = Entry[index];
        for( var test : bucket)
        {
            if(test.key == key)
            {
                test.value = value;
                return;
            }
        }

        bucket.addLast(new Node(key,value));
    }

    public String get(int key)
    {
        int index = Hash(key);
        var bucket = Entry[index];

        for(var rs : bucket)
        {
            if(rs.key == key)
            {
                return rs.value;
            }
        }
        return null;
    }

    public void remove(int key)
    {
        int index = Hash(key);
        var bucket = Entry[index];

        for(var rs : bucket)
        {
            if(rs.key == key)
            {
                bucket.remove(rs);
                return;
            }
        }
        System.out.println("No Match");
    }
    private int Hash(int key)
    {
        return key%Entry.length;
    }
}
