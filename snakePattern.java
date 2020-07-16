import java.util.*;

class snakePattern{

    static String matrix[][];
    static String brokenStr[];



    public static void pattern(String str){
        brokenStr = new String[str.length()];
        brokenStr = str.split("");
        int j=0,k=0,count=0;

        for(int i=1;i<=7;i++){
            int n = str.length()/i;
            matrix = new String[n+1][str.length()];
            if(n==1){
                i=8;
                break;
            }
            else{
                System.out.println("------PATTERN FOR "+(i-1)+" ROWS------");
                count=0;
                k=0;
                j=0;
                while(count<str.length()){
                    if(k<n && j<str.length()){
                        if(k==-1){
                            k = k+2;
                        }
                        while(k<=n && j<str.length()){
                            matrix[k][j] = brokenStr[j];
                            k++;
                            j++;
                        }
                    }
                    else if(k>0 && j<str.length()){
                        k=k-2;
                        while(k>=0 && j<str.length()){
                            matrix[k][j] = brokenStr[j];
                            k--;
                            j++;
                        }
                    }
                    count++;
                }
            }

            for(int i1=0;i1<=str.length()/i;i1++){
                for(int j1=0;j1<str.length();j1++){
                    if(matrix[i1][j1] == null){
                        System.out.print("   ");
                    }
                    else{
                        System.out.print("  "+matrix[i1][j1]);
                    }
                }
                System.out.println();
                System.out.println();
            }
        }
    }



    public static void main(String args[]){
        System.out.print("Enter the String for its snake pattern:");
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        System.out.println(inputString.length());
        scan.close();
        pattern(inputString);
    }

}
