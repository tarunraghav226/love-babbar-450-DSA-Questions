import java.util.ArrayList;

public class SpiralTraversal{
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
        static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
            ArrayList<Integer> arr = new ArrayList<>();
          
            int top=0, down=r-1, left=0, right=c-1;
            int dir = 0;
    
            while(top <= down && left <= right){
                if(dir == 0){
                    for(int i=top;i<=right;i++)
                        arr.add(matrix[top][i]);
                    top+=1;
                }
                else if(dir == 1){
                    for(int i=top;i<=down;i++)
                        arr.add(matrix[i][right]);
                    right -= 1;
                }
                else if(dir == 2){
                    for(int i=right;i>=left;i--)
                        arr.add(matrix[down][i]);
                    down-=1;
                }
                else{
                    for(int i=down;i>=top;i--)
                        arr.add(matrix[i][left]);
                    left+=1;
                }
                dir = (dir + 1) % 4;
            }
    
            return arr;  
    }
}