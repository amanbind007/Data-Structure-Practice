import java.util.Scanner;

// Question
// Unlike normal plants, the Tak-Tak tree is not affected by weather or seasons. Instead, its fruits grow according to the cycles of the moon. Every
// month when the full moon is at its highest, each fruit on the tree shimmers and turns into two fruits. When the sun rises the villagers wake to
// find the number of fruits on the tree has doubled.

// The villagers are planning a huge feast for this year. On the day of the feast they will remove all the fruit except one from the tree. This is to be
// divided equally between the village's eleven inhabitants, as they are a fair people. (No slicing or dicing is allowed - each villager must receive a
// whole number of fruits.) Afterwards the one remaining fruit on the Tak-Tak tree is left to begin the cycle anew.

// If the villagers cannot evenly share the fruit with one left over, they shall wait until they can. They are very excited about the feast and would
// like to know how many full moons they must wait.

public class Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int currentFruitQuantity = sc.nextInt();
        int totalVillagers = 11;
        int totalFullMoons = 0;

        while(currentFruitQuantity%totalVillagers!=1){
            currentFruitQuantity = 2*currentFruitQuantity;
            totalFullMoons++;
        }

        System.out.print( totalFullMoons +" "+ currentFruitQuantity);
        sc.close();
    }
}
