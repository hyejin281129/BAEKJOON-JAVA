import java.util.Scanner;

class Backjoon_8393 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int i, a, sum;
    a = scan.nextInt();
    sum = 0;

    for (i=0; i<=a ; i++){
      sum = sum + i;
    }
    System.out.println(sum);
  }
}