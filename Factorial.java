public class Factorial {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java Factorial <non-negative integer>");
            return;
        }
        int n = Integer.parseInt(args[0]);
        int fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        System.out.println("Factorial of " + n + " is " + fact);
    }
}
