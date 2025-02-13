package strings;
import java.util.*;
public class subset {
    public static void main(String[] args) {
        int[] arr={2,2,3,4,5};
        List<List<Integer>> list=subset1(arr);
        for(List<Integer> hi: list){
            System.out.print(hi+ " ");
        }
        System.out.println();
        List<List<Integer>> list2=subsetDuplicate(arr);
        for(List<Integer> hi: list2){
            System.out.print(hi+ " ");
        }
        System.out.println();
        List<List<Integer>> list1=subsetDuplicate2(arr);
        for(List<Integer> hi: list1){
            System.out.print(hi+ " ");
        }

    }

    //normal way will print duplicates in case of duplicates
    static List<List<Integer>> subset1(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    //In case there are duplicates in the array. using .contains way. a little inefficient
    static List<List<Integer>> subsetDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                if(!outer.contains(internal)) outer.add(internal);
            }
        }
        return outer;
    }

    //second way.
    static List<List<Integer>> subsetDuplicate2(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0,end=0;

        for(int j=0;j<arr.length;j++){
            start=0;
            if(j>0 && arr[j]==arr[j-1]){
                start=end+1;
            }
            int n=outer.size();
            end=n-1;

            for(int i=start;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(arr[j]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
