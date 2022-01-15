import java.util.Scanner;

class Backjoon_10950 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t, a, b, i;
    t = scan.nextInt();

    for (i=0; i<t ; i++){
      a = scan.nextInt();
      b = scan.nextInt();
      System.out.println(a + b);
    }
  }
}