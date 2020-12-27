import hash.hash;

//chaining method
public class hash_imp {
    
    public static void main(String[] args) {
        
        hash h = new hash();
        h.put(6,"A");
        h.put(8,"B");
        h.put(11,"c");
        h.put(6,"A+");
        h.remove(61);
        System.out.println(h.get(6));
    }
}
