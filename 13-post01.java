import java.io.*;

class post01 {
  public static void main(String args[])throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    //ここからプログラムを入力する
    int dice, num, i;

    System.out.print("振るサイコロの個数(0以下で終了)：");
    num = Integer.parseInt(br.readLine());
    

    
    if (num > 0) {
      while (num > 0) {
        i = 1;
        while (i <= num) {
          dice = (int)(Math.random() * 6) + 1;
          System.out.println(i + "個めのサイコロの目は" + dice + "です");
          i++;
        }
        System.out.print("振るサイコロの個数(0以下で終了)：");
        num = Integer.parseInt(br.readLine());
      }
    }
  }
}