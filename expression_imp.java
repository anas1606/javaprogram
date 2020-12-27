import expression.expression;

public class expression_imp {
    public static void main(String[] args) {
        
        String str = "{(1+2)[]<a>}";
        expression obj = new expression();
        var result = obj.isBalance(str);
        System.out.println(result);
    }
}
