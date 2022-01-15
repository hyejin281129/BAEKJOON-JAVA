import java.util.Scanner;

class Backjoon_2588 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a, b, c, d, e;
    a = scan.nextInt();
    b = scan.nextInt();
    c = b % 10;
    d = (b % 100) - c;
    e = (b % 1000) - (d + c);
    System.out.println(a * c);
    System.out.println(a * d / 10);
    System.out.println(a * e / 100);
    System.out.println(a * b);
  }
}