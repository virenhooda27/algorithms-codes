import java.util.*;

public class q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println("ENter the Elements");
        int row_start=0;
        int column_start=0;
        int row_end=n-1;
        int column_end=m-1;
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        while(row_start<=row_end && column_start<=column_end){
            for(int i=column_start;i<column_end;i++){
                System.out.println(arr[row_start][i]);
            }
            row_start++;
            for(int i=row_start;i<row_end;i++){
                System.out.println(arr[i][column_end]);
            }
            column_end--;
            for(int i=column_end;i>=column_start;i--){
                System.out.println(arr[row_end][i]);
            }
            row_end--;
            for(int i=row_end;i>=row_start;i--){
                System.out.println(arr[i][column_start]);
            }
            column_start++;
        }
        sc.close();
    }
}
