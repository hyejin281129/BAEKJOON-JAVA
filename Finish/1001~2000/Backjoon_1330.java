import java.util.Scanner;

class Backjoon_1330 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a, b;
    a = scan.nextInt();
    b = scan.nextInt();

    if(a > b){
      System.out.println(">");
    }else if(a < b){
      System.out.println("<");
    }else{
      System.out.println("==");
    }
  }
}