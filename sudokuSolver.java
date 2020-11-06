import java.util.Scanner;
import java.io.*;


class InputException extends Exception{
  public InputException(String s){
    super(s);
  }
}

class sudokuSolver{
  private int[] flagRow;
  private int[] flagCol;
  private int highest;
  private int boxesToFill=0;
  private int highestCount=0;

  //this method finds out how many times each number is repeated so that some boxes can be filled easily
  private int[] mostCommon(int[][] arr){
    int[] comNumbers = new int[9];//stores the value of all the numbers when repeated
    int[] mostRepeatedNum = new int[9];//stores the highest repeated number
    int count=0;
    int number=1;
    int temp=0;
    while(number<10 && temp<9){
      count=0;
      for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
          if(arr[i][j]==number){
            count++;
          }
        }
      }
      comNumbers[temp] = count;
      number++;
      temp++;
    }
    highest = comNumbers[0];
    for(int i=0;i<9;i++){
      if(highest<=comNumbers[i]){
        highest = comNumbers[i];
        mostRepeatedNum[highestCount] = (i+1);
        highestCount++;
      }
    }
    int[] mostRepeatedNumFinal = new int[highestCount];
    System.arraycopy(mostRepeatedNum, 0 ,mostRepeatedNumFinal, 0, highestCount);
    System.out.println("no of repeatations:"+highest);
    boxesToFill = 9-highest;

    flagRow = new int[boxesToFill*highestCount];
    flagCol = new int[boxesToFill*highestCount];

    return mostRepeatedNumFinal;
  }

//places the most common number into the respected box according to the mostCommon method
  private void mostCommonCheck(int[][] board,int[] arr){
    int count = 0;
    int temp = 0,temp1=0;
    System.out.println("The commons count is"+highestCount);
    for(int c=0;c<highestCount;c++){
      for(int i=0;i<9;i++){
        count = 0;
        for(int j=0;j<9;j++){
          if(board[i][j] == arr[c]){
            break;
          }
          else{
            count++;
          }
        }
        if(count>8){
          if(temp<(boxesToFill*highestCount)){
            flagRow[temp] = i;
            temp++;
          }
        }
      }
    }
    for(int c=0;c<highestCount;c++){
      for(int j=0;j<9;j++){
        count = 0;
        for(int i=0;i<9;i++){
          if(board[i][j] == arr[c]){
            break;
          }
          else{
            count++;
          }
        }
        if(count>8){
          if(temp1<(boxesToFill*highestCount)){
            flagCol[temp1] = j;
            temp1++;
          }
        }
      }
    }
    for(int i=0;i<(boxesToFill*highestCount);i++){
      System.out.println(flagRow[i]);
    }
  }

  public void mostCommonPut(int[][] board,int[] arr){
    for(int c=0;c<highestCount;c++){

    }
    for(int i=0;i<9;i++){
      for(int j=0;j<9;j++){
        if(j%3==0){
          System.out.print("  ");
        }
        System.out.print(board[i][j]+" ");
      }
      if((i+1)%3==0){
        System.out.println();
        System.out.println();
      }
      else{
        System.out.println();
      }
    }

  }

  public void checkRow(){

  }

  public void checkCol(){

  }

  public static void main(String args[]){
    sudokuSolver ss = new sudokuSolver();
    Scanner scan =  new Scanner(System.in);
    System.out.println("please enter the empty values as zeroes");
    int[][] board = new int[9][9];
    int temp=0;
    System.out.println(board.length);
    first:
      for(int i=0;i<9;i++){
        for(int j=0;j<9;j++){
          temp = scan.nextInt();
          try{
            if(temp>=0&&temp<10){
              board[i][j] = temp;
            }
            else{
              throw new InputException("inputs for sudoku should be less than 9");
            }
          }
          catch(InputException e){
            System.out.println(e.getMessage());
            break first;
          }
        }
      }
    System.out.println("The entered Sudoku is:");
    for(int i=0;i<9;i++){
      for(int j=0;j<9;j++){
        if(j%3==0){
          System.out.print("  ");
        }
        System.out.print(board[i][j]+" ");
      }
      if((i+1)%3==0){
        System.out.println();
        System.out.println();
      }
      else{
        System.out.println();
      }
    }

    int[] arr1=ss.mostCommon(board);

    for(int i=0;i<arr1.length;i++){
        System.out.println(arr1[i]+" is the most common number");
    }

    ss.mostCommonCheck(board,arr1);
    ss.mostCommonPut(board,arr1);

  }
}
