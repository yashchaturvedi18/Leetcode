import java.util.*;
class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> firstRow = new ArrayList<Integer>();
        firstRow.add(1);
        res.add(firstRow);
        for(int i =1 ; i<numRows;i++){

            List<Integer> prevRow = res.get(i-1);
            List<Integer> newRow = new ArrayList<Integer>();
            newRow.add(1);
            for(int j = 1;j<i;j++){
                newRow.add(prevRow.get(j-1),prevRow.get(j));
            }
            newRow.add(1);
            res.add(newRow);
        }
        return res;
    }
}