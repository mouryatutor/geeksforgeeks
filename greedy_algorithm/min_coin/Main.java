package greedy_algorithm.min_coin;  
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        int amount = 57;
        Integer coins[] = {5,10,2,1};
        System.out.println(findMinCoin(coins, amount));

        // Greedy algorithm may not work for all time
        //coins = {18,1,10}; amount = 20
        // Application of greedy algorithms
        /* 
         * 1. Activity Selection 
         * 2. Fractional Knapsack
         * 3. Job Sequencing 
         * 4. Prim's Algorithm
         * 5. Kruskal's Algorithm
         * 6. Dijkstra's Algorithm
         * 7. Huffman Algorithm
         */
    }

    private static int findMinCoin(Integer[] coins,int amount) {
        int numberOfCoins = 0;
        // sort the array
        // Arrays.sort(coins);
        Arrays.sort(coins,Comparator.reverseOrder());
        for (int i = 0; i < coins.length; i++) {
            if(amount >= coins[i])
            {
                System.out.println(coins[i]);
                int num = amount/coins[i];
                numberOfCoins =  numberOfCoins + num;
                amount = amount - coins[i]*num;
            }
        }


        return numberOfCoins;
    }
}