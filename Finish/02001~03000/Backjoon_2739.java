import java.util.Scanner;

class Backjoon_2739 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a, i;
    a = scan.nextInt();

    for (i=1; i<10 ; i++){
      System.out.printf("%d * %d = %d \n", a, i, a * i);
    }
  }
}