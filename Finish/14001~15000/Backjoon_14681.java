import java.util.Scanner;

class Backjoon_14681 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int x,y;
    x = scan.nextInt();
    y = scan.nextInt();

    if(x > 0 && y > 0){
      System.out.println("1");
    }else if(x < 0 && y > 0){
      System.out.println("2");
    }else if(x < 0 && y < 0){
      System.out.println("3");
    }else if(x > 0 && y < 0){
      System.out.println("4");
    }
  }
}