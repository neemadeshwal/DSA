package Backtracking;

public class P79WordSearch {
    
    public static void main(String[] args) {

        char[][] matrix = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };

        int[][] wordArr=new int[matrix.length][matrix[0].length];
        String word="ABCCED";

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                
                if(word.charAt(0)==matrix[i][j]){
                    wordArr[i][j]=1;
                }
                System.out.print(wordArr[i][j]+" ");
            }
            System.out.println();

        }
        
        
        System.out.println(wordMatch(matrix,0,0,word,1,wordArr));
    }

    public static Boolean wordMatch(char [][] x,int rows,int cols,String word,int i,int[][] wordArr){
        boolean isWordMatch=false;

        while(rows<x.length){
            while(cols<x[0].length){

                if(wordArr[rows][cols]==1){

                    //right

                    if(cols==wordArr[0].length){
                        rows=rows+1;
                    }

                    //down

                    if(rows==wordArr.length){
                        rows=rows-1;
                    }

                    

                    //left

                    if(rows==0){
                        cols=cols-1;
                    }

                    //up

                    
                    wordMatch(x, rows, cols+1, word, i+1, wordArr);

                }
            }
        }


       

      

        return isWordMatch;
    }
}
