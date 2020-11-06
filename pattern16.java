import java.util.Scanner;
import java.io.*;

class pattern16{
  public void pattern(int size){

  }

  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the initial size of the pattern:");
    int size = scan.nextInt();
    for(int i=size;i<=0;i--){
      pattern(i);
    }

  }
}
