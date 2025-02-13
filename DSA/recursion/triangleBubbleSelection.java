package recursion;

import java.util.Arrays;

public class triangleBubbleSelection {
    public static void main(String[] args) {
        triangle(4,0);
        triangle2(4,0);
        System.out.println();
        int[] arr = {16,4,3,5};
        bubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
        int[] arr2 = {21,1,16,4,3,5};
        selectionSort(arr2,arr2.length,0,0);
        System.out.println(Arrays.toString(arr2));
    }

    //print triangle using recursion
    static void triangle(int row,int col){
        if(row==0) return;
        if(col<row){
            System.out.print("* ");
            triangle(row,col+1);
        }else{
            System.out.println();
            triangle(row-1,0);
        }
    }

    //same as normal one, just the print statements are after the recursive call. This results in opposite triangle
    static void triangle2(int row,int col){
        if(row==0) return;
        if(col<row){
            triangle2(row,col+1);
            System.out.print("* ");

        }else{
            triangle2(row-1,0);
            System.out.println();

        }
    }

    //its arr.length-1 coz were using col+1 index, whereas in selection we are not
    static void bubbleSort(int[] arr,int row,int col){
        if(row==0) return;
        if(col<row){
            if(arr[col] > arr[col+1]){
                //swap
                int temp=arr[col];
                arr[col]=arr[col+1];
                arr[col+1]=temp;
            }
            bubbleSort(arr,row,col+1);
        }
        else{
            bubbleSort(arr,row-1,0);
        }
    }

    static void selectionSort(int[] arr,int row,int col,int max){
        if(row==0) return;
        if(col<row){
            if(arr[col] > arr[max]) selectionSort(arr,row,col+1,col);
            else selectionSort(arr,row,col+1,max);
        }else{
            int temp=arr[max];
            arr[max]=arr[row-1];
            arr[row-1]=temp;
            selectionSort(arr,row-1,0,0);
        }
    }



}
