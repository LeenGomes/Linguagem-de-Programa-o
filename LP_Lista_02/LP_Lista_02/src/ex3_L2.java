public class Main {
    public static void main(String [] args) {
        int number, result;

        System.out.printIn("Digite um número: ");

        Scanner in = new Scanner(System.in); // Configura o Scanner
        number = in.nextInt();

        result = number * 2;
        System.out.printIn("O dobro de " + number + "é " + result)
    }
}