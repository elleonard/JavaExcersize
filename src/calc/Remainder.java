package calc;

public class Remainder {

  private static int remainder(int x, int y) {
    return x % y;
  }

  public static void main(String[] args) {
    /* 負の剰余になる */
    System.out.println(remainder(-2,3));
  }

}
