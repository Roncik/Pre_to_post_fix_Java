import java.util.HashMap;
import java.util.Map;


public class PostfixConverter {
    private static final Map<String, Integer> precedenceMap = new HashMap<>();

    static {
        precedenceMap.put("+", 1);
        precedenceMap.put("-", 1);
        precedenceMap.put("*", 2);
        precedenceMap.put("/", 2);
    }

    public static String infixToPostfix(String expression) 
    {
        Stack<String> stack = new Stack<>();
        StringBuilder output = new StringBuilder();

        String[] tokens = expression.split(",");
        for (String token : tokens) 
        {
            if (isNumber(token) || isLetter(token)) 
            {
                output.append(token).append(",");
            } 
            else if (token.equals("(")) 
            {
                stack.push(token);
            } 
            else if (token.equals(")")) 
            {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    output.append(stack.pop()).append(",");
                }
                stack.pop(); // usuń '('
            } 
            else if (isOperator(token)) 
            {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(token)) {
                    output.append(stack.pop()).append(",");
                }
                stack.push(token);
            }
        }

        while (!stack.isEmpty()) 
        {
            output.append(stack.pop()).append(",");
        }

        // Usuń ostatni przecinek
        if (output.length() > 0) 
        {
            output.setLength(output.length() - 1);
        }
        // Output bez przecinków
        String str = output.toString();
        String[] z2 = str.split(",");
        String outputnocomma = String.join("", z2);
        return outputnocomma;
    }

    private static boolean isOperator(String token) 
    {
        return precedenceMap.containsKey(token);
    }

    private static int precedence(String token) 
    {
        return precedenceMap.getOrDefault(token, -1);
    }

    private static boolean isNumber(String token) {
        try {
            Integer.parseInt(token);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isLetter(String token) { //wieloznakowe symbole?
        if (token.length() == 1)
        {
            char[] c = token.toCharArray();
            if (Character.isLetter(c[0]))
            {
                return true;
            }
        }
        return false;
    }
}
