import java.util.Stack;
class DecimalToBinaryStack {
    public static void main(String[] args) {
        int number = 25;
        int n = number;
        Stack<Integer> stack = new Stack<>();
        while (number > 0) {
            stack.push(number % 2);
            number = number / 2;
        }
        System.out.print("Decimal: " + n);
        System.out.print("\nBinary: ");
       while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
OUTPUT:
Decimal: 25
Binary: 11001
