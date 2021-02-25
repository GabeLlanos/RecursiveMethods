import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("How much money would you like to invest?");
    Scanner scan = new Scanner(System.in);
    int amountInv = scan.nextInt();
    investing(amountInv);
   

  }

  public static void investing(amountInv){
  System.out.println("Would you like to continue investing ");
  boolean keepGoing = scan.nextBoolean();
  if(keepGoing){
      investing(amountInv);
  }
  else{
    System.out.println("stop");
  }
  }
}