import java.util.Scanner;
public class main {
  public static void main(String[] args) {
    System.out.println("Major Tom: Hello player. I am here to tech you about grammar. I hope you are ready to learn. In order to make things less awkward please tell me your name.");
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    System.out.println(name + ": M' neam iz " + name + ".");
  }
}
