package recursion;

import java.util.ArrayList;

public class findLinearSearch {
    public static void main(String[] args) {
        int[] arr={5,5,6,8,9,5,2,78};
        System.out.println(find(arr,9,0));
        System.out.println(findIndex(arr,9,0));
        System.out.println(findIndexLast(arr,9,arr.length-1));
        findAllIndexes(arr,5,0);
        System.out.println(indexes);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(findAllIndexes(arr,5,0,list));
        System.out.println(findAllIndexes2(arr,5,0));


    }

    //returns if element exists or not
    static boolean find(int[] arr,int n, int index){
        if(index== arr.length) return false;
        return n==arr[index] || find(arr,n,index+1);
    }

    //returns the index of the element
    static int findIndex(int[] arr, int n, int index){
        if(index== arr.length) return -1;
        if(n==arr[index]) return index;
        return findIndex(arr,n,index+1);
    }

    static int findIndexLast(int[] arr, int n, int index){
        if(index<0) return -1;
        if(n==arr[index]) return index;
        return findIndexLast(arr,n,index-1);
    }

    static ArrayList<Integer> indexes = new ArrayList<>();
    static void findAllIndexes(int[] arr, int n, int index){
        if(index==arr.length) return;
        if(n==arr[index]) indexes.add(index);
        findAllIndexes(arr,n,index+1);
    }

    //returns the arraylist without using external one, its passed down
    static ArrayList<Integer> findAllIndexes(int[] arr, int n, int index, ArrayList<Integer> list){
        if(index==arr.length) return list;
        if(n==arr[index]) list.add(index);
        return findAllIndexes(arr,n,index+1,list);
    }

    //now, no one is passing any arraylist as argument. create the list
    static ArrayList<Integer> findAllIndexes2(int[] arr, int n, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index==arr.length) return list;
        if(n==arr[index]) list.add(index);
        ArrayList<Integer> newList=findAllIndexes2(arr,n,index+1);
        list.addAll(newList);
        return list;
    }


}
