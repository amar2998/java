import java.util.Scanner;
import java.util.*;
class Recusion2{
    static void permutation(List<Integer> list,int index,List<List<Integer>> res){
        if( index==list.size()){
            res.add(new ArrayList<>(list));

        }
        else
        {
            for(int i=index;i<list.size();i++){
                Collections.swap(list,index,i);
                
                permutation(list,index+1,res);
                Collections.swap(list,index,i);

            }
        }
    }

    static boolean isSafe(List<List<Integer>> board, int row, int col, int n) {

        // Check column
        for (int i = 0; i < row; i++) {
            if (board.get(i).get(col) == 1) {
                return false;
            }
        }

        // Check upper-left diagonal
        int r = row;
        int c = col;

        while (r >= 0 && c >= 0) {
            if (board.get(r).get(c) == 1) {
                return false;
            }
            r--;
            c--;
        }

        // Check upper-right diagonal
        r = row;
        c = col;

        while (r >= 0 && c < n) {
            if (board.get(r).get(c) == 1) {
                return false;
            }
            r--;
            c++;
        }

        return true;
    }
    static void nQueen(List<List<Integer>> board, int row,int n,List<List<List<Integer>>> ans){
        if(n==row){

            List<List<Integer>> temp=new ArrayList<>();
            for(List<Integer> i:board){
                temp.add(new ArrayList<>(i));
            }
            ans.add(temp);
        }
        else{
            for(int i=0;i<n;i++){
                if(isSafe(board,row,i,n)){
                    board.get(row).set(i,1);
                    nQueen(board,row+1,n,ans);
                    board.get(row).set(i,0);
                }
            }
        }
    }   
    public static void main(String []args){
       

    //    List <Integer> list =new ArrayList<> ();
    //    list.add(1);
    //    list.add(2);
    //    list.add(3);
    //    List<List<Integer>> ans =new ArrayList<>();
    //     permutation(list,0,ans);
    //     for( List<Integer> i:ans){
    //         for(int j:i){
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
        List<List<Integer>> matrix = new ArrayList<>();
        int n=4;
        for (int i = 0; i < n; i++) {
            matrix.add(new ArrayList<>(Collections.nCopies(n, 0)));
        }
        List<List<List<Integer>>> ans = new ArrayList<>();
        nQueen(matrix, 0, n, ans);
        for(List<List<Integer>> i : ans) {
            for (List<Integer> j : i) {
                for (int k : j) {
                    System.out.print(k + " ");
                }
                System.out.println();
            }
            System.out.println();
        }





    }
}