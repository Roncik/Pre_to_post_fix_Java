// Plik: Main.java
public class main {
    public static void main(String[] args) {
         // Demonstracja funkcjonalności stosu
         System.out.println("Demonstracja stosu:");
         Stack<Integer> stack = new Stack<>();
         
         System.out.println("Czy stos jest pusty? " + stack.isEmpty());
         System.out.println("Dodawanie elementów: 10, 20, 30 na stos");
         stack.push(10);
         stack.push(20);
         stack.push(30);

         System.out.println("Rozmiar stosu po dodaniu elementów: " + stack.size());
        System.out.println("Szczytowy element stosu: " + stack.peek());

        System.out.println("Usuwanie elementu: " + stack.pop());
        System.out.println("Szczytowy element po usunięciu: " + stack.peek());
        System.out.println("Rozmiar stosu po usunięciu: " + stack.size());
        System.out.println("Czy stos jest pusty? " + stack.isEmpty());
        
        // Demonstracja konwersji do notacji postfix
        System.out.println("Konwersja wyrażenia do notacji postfix:");
        //Przykład 1
        String infixExpression = "(,A,+,B,),*,C";
        String postfixExpression = PostfixConverter.infixToPostfix(infixExpression);
        System.out.println("Wyrażenie infix: " + infixExpression);
        System.out.println("Wyrażenie postfix: " + postfixExpression);
        
        //Przykład 2
        infixExpression = "6,+,5,*,15";
        postfixExpression = PostfixConverter.infixToPostfix(infixExpression);
        System.out.println("\nWyrażenie infix: " + infixExpression);
        System.out.println("Wyrażenie postfix: " + postfixExpression);

        // Demonstracja obliczenia wyrażenia w notacji postfix z przecinkami
        System.out.println("\nObliczanie wyrażenia w notacji postfix:");
        //Przykład 1
        String postfixToEvaluate = "6,5,15,*,+";
        int result = PostfixEvaluator.evaluate(postfixToEvaluate);
        System.out.println("Wyrażenie postfix: " + postfixToEvaluate);
        System.out.println("Wynik: " + result);

        //Przykład 2
        postfixToEvaluate = "6,5,-,8,4,-,*,4,3,-,/";
        result = PostfixEvaluator.evaluate(postfixToEvaluate);
        System.out.println("\nWyrażenie postfix: " + postfixToEvaluate);
        System.out.println("Wynik: " + result);
    }
}
