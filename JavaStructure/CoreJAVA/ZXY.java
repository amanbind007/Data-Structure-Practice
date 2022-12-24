import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();

        if(numRows == 0){
            return result;
        }

        for(int i=0; i<numRows; i++){
            List<Integer> row = new ArrayList<Integer>();
            List<Integer> prevRow = new ArrayList<Integer>();
            
            for(int j = 0; j<=i; j++){
                if(j== 0 || j== i){
                    row.add(i)
                }
                else{
                    prevRow = result.get(i-1);
                    row.add(prevRow.get(j-1)+prevRow.get(j));
                }
            }

            result.add(row);
        }

        return result;
        
    }
}