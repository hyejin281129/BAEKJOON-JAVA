import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
  public static void main(String[] args) throws IOException {
    // 입력
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
    BufferedWriter bw = new BufferedWriter(new OutputStreamReader(System.out));
    int sum;
    int t = Integer.parseInt(br.readLine());
    for(int i=1; i<=t; i++){
      System.out.printf("Case #%d: %d + %d = %d", i, a, b, sum)
    }
    bw.close();
  }
}