import linklist.linklist;

class linklist_imp
{
    public static void main(String[] args) {
        linklist a = new linklist();
        a.add(10);
        a.add(20);
        a.addFirst(60);
        a.addLast(100);
        a.addFirst(1);

        a.deleteFirst();
        a.deleteLast();
        a.delete(200);

        System.out.println(a.contains(10));
        a.print();
        System.out.println("Size is = "+a.Size());

        int[] r = a.toarray();
        for(int n : r)
        {
            System.out.println(n+" ");
        }
    }
}