package recursion.backtracking;
import java.util.*;
public class maze_noBkTrk {
    public static void main(String[] args) {
        System.out.println(count(3,3));
        System.out.println(paths("",3,3));
        System.out.println(pathsD("",3,3));
        boolean[][] board = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        System.out.println(pathsObs("",board,0,0));


    }
    //only right and down moves allowed
    //count the number of ways
    static int count(int row,int col){
        if(row==1||col==1){
            return 1;//base condition, if either reaches 1, there is only one path there
        }
        int right=count(row,col-1);
        int down=count(row-1,col);
        return right+down;
    }

    static ArrayList<String> paths(String p,int r,int c){
        ArrayList<String> list=new ArrayList<>();
        if(r==1&&c==1){
            list.add(p);
            return list;
        }
        if(r>1){
            list.addAll(paths(p+"D",r-1,c));
        }
        if(c>1){
            list.addAll(paths(p+"R",r,c-1));
        }
        return list;
    }

    //u can go right,dow,and diagonally down
    static ArrayList<String> pathsD(String p,int r,int c){
        ArrayList<String> list=new ArrayList<>();
        if(r==1&&c==1){
            list.add(p);
            return list;
        }
        if(r>1 && c>1){
            list.addAll(pathsD(p+"Diag",r-1,c-1));
        }
        if(r>1){
            list.addAll(pathsD(p+"Down",r-1,c));
        }
        if(c>1){
            list.addAll(pathsD(p+"Right",r,c-1));
        }
        return list;
    }

    //if there are obstacles in the paths, using a boolean matrix
    static ArrayList<String> pathsObs(String p,boolean[][] maze,int r,int c){
        ArrayList<String> list=new ArrayList<>();
        int r1= maze.length-1;
        int c1= maze[0].length-1;

        if(!maze[r][c]) return list;

        if(r==r1&&c==c1){
            list.add(p);
            return list;
        }

        if(r<r1){
            list.addAll(pathsObs(p+"D",maze,r+1,c));
        }
        if(c<c1){
            list.addAll(pathsObs(p+"R",maze,r,c+1));
        }
        return list;
    }
}
