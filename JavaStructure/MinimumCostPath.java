

public class MinimumCostPath {
    public static int findMinimumCost(int[][] graph, int i, int j, int cost) {
        

        
        return Math.min(findMinimumCost(graph, i-1, j), findMinimumCost(graph, i, j-1));
    }
    public static void main(String[] args) {
        int[][] graph = {   
                            {1,3,5},
                            {2,1,2},
                            {4,3,1}
                        };

        int result = findMinimumCost(graph, 0, 0, 0);

        
    }

   


    
}
