import java.util.Scanner;

class Backjoon_2884 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int hour, minute;
    hour = scan.nextInt();
    minute = scan.nextInt();

    minute = minute - 45;
    if(minute < 0){
      hour = hour - 1;
      if(hour < 0){
        hour = 24 + hour;
      }
      minute = 60 + minute;
      System.out.printf("%d %d", hour, minute);
      // System.out.print(hour);
      // System.out.print(minute);
    }else{
      System.out.printf("%d %d", hour, minute);
      // System.out.print(hour);
      // System.out.print(minute);
    }
  }
}