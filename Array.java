package Array;

public class Array
{  
    private int[] iteam;
    private int count;

    public Array(int length)
    {
        iteam = new int[length];
    }    

    public void print()
    {
        for(int n : iteam)
        {
            System.out.println(n);
        }
    }

    public void insert(int no)
    {
        iteam[count++] = no;
    }
}  
