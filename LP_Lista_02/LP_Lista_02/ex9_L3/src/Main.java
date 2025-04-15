import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, c;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite os três lados do triângulo, separados por espaço: ");
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        int x = a-b;
        if

        if(a<(b+c) && b<(a+c) && c<(b+a) && a>Math.abs(b-c) && b>Math.abs(a-c) && c>Math.abs(a-b)) {
            System.out.printIn("a, b e c formam um triângulo");
        }
    }
}