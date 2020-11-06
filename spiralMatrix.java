import java.util.*;

class Amazon{


    public void spiralPrint(int[][] matrix,int n,int m){
        int i=0,j=0,countn = n,countm = m ;
        while(i<=n && j<=m){

            if(j == countn){
                System.out.println("equal");
                System.out.println(matrix[i][j]);
                j=countn-1;
                i++;
                if(i == countm){
                    i = countm - 1;
                    System.out.println("equal2");
                    System.out.println(matrix[i][j]);
                    j--;
                }
                else if(i < countm){
                    System.out.println(matrix[i][j]);
                    i++;
                }
            }
            else if(j<countn){
                System.out.println(matrix[i][j]);
                j++;
            }
        }
    }



    public static void main(String args[]){
        int i=0,j=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = scan.nextInt();
        System.out.println("Enter the value of m:");
        int m = scan.nextInt();
        int matrix[][] = new int[n][m];
        System.out.println("Enter the matrix:");

        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        Amazon a = new Amazon();
        System.out.println("hello world");
        a.spiralPrint(matrix,n,m);
        scan.close();
    }
}
