import java.util.Scanner;

class Backjoon_2439 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int i, j;
    int t = sc.nextInt();

    for(i=1; i<t+1; i++){
      for(j=t; j>i; j--){
        System.out.print(" ");
      }
      for(j=0; j<i; j++){
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }
}