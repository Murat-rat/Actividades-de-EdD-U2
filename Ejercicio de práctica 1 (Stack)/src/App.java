public class App {
    public static void main(String[] args) throws Exception {
        ArrayStack<Integer> stack = new ArrayStack<>();

        if(stack.isPalindrome("Anita lava la tina")) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }

        if(stack.isPalindrome("Livin' la vida loca")) {
            System.out.println("Es un palíndromo");
        } else {
            System.out.println("No es un palíndromo");
        }
    }
}
