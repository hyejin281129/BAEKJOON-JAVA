import java.util.Scanner;

class Backjoon_9498 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int score;
    score = scan.nextInt();

    if(score >= 90){
      System.out.println("A");
    }else if(score >= 80){
      System.out.println("B");
    }else if(score >= 70){
      System.out.println("C");
    }else if(score >= 60){
      System.out.println("D");
    }else{
      System.out.println("F");
    }
  }
}