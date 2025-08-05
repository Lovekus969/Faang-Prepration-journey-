import java.util.*;

public class FindMissingandRepeat{

    public static int [] repeatingAndMissed(int [][] grid ){
        //we need to traverse the entire grid and then store in the hasset and then see which repreat and which missed 
        int repeat = -1;
        int n = grid.length;
        int traverseTill = n*n;
        int missed =-1;


        Set<Integer>seen = new HashSet<>();
        for( int i=0 ; i<n; i++){
            for(int j=0; j<n ; j++){
                int num = grid[i][j];
                if(seen.contains(num)){
                    repeat = num;
                }else{
                    seen.add(num);
                }

            }
        }
        // run one more loop for missisng 
        for( int i=1; i<=traverseTill; i++){
            if(!seen.contains(i)){
                missed =i;
                break;
            }
        }

        return  new int []{ repeat,missed};
    }

    public static void main(String[] args) {

        int[][] grid = {{1,2,3},{4,5,6},{3,7,8}};
           int result[]= repeatingAndMissed(grid);
           System.out.println("Repeating and missing number get found repeating number is "+ result[0] +" and missing is "+ result[1]);

    }
}