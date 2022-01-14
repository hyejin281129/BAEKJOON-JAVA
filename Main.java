import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a, b, c, d, e;
    a = scan.nextInt();
    b = scan.nextInt();
    c = b % 10;
    d = (b % 100) - (b % 10);
    e = (b % 1000) - (b % 100) - (b % 10);
    System.out.println(a * c);
    System.out.println(a * d / 10);
    System.out.println(a * e / 10);
    System.out.println(a * b);
    // System.out.println(((a % c) * (b % c)) % c);
  }
}