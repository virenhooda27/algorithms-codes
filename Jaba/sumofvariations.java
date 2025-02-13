import java.util.Scanner;

public class sumofvariations {

    // Method to find the number of ways to achieve the target sum
    public static int countCombinations(int m, int r, int target) {
        // dp[i][j] will store the number of ways to achieve a sum j using i items
        int[][] dp = new int[m + 1][target + 1];

        // Base case: There's one way to achieve a sum of 0 with 0 items
        dp[0][0] = 1;

        // Fill the dp table
        for (int i = 1; i <= m; i++) { // for each item
            for (int sum = 0; sum <= target; sum++) { // for each possible sum
                // Try each variation for the current item (1 to r)
                for (int variation = 1; variation <= r; variation++) {
                    if (sum >= variation) {
                        dp[i][sum] += dp[i - 1][sum - variation];
                    }
                }
            }
        }

        // The result will be in dp[m][target], which is the number of ways to achieve the target sum using all m items
        return dp[m][target];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of items, number of variations, target sum
        int m = scanner.nextInt();  // number of items
        int r = scanner.nextInt();  // number of variations per item
        int target = scanner.nextInt();  // target sum

        // Calculate the number of combinations
        int result = countCombinations(m, r, target);

        // Output the result
        System.out.println(result);

        scanner.close();
    }
}

/*Sum of variations in the given object count:
You have a collection of 'm' distinct items, and each item has 'r' variations. Given three integers m, r, and target, where 'm' represents the number of items, 'r' represents the number of variations for each item, and target is the desired total, determine the number of unique combinations to obtain the target sum.

Example with Explanation:

Suppose you have 2 different types of coins, each coin with 4 variations (m = 2, r = 4). If the target sum is 7, calculate the number of ways to obtain this sum by selecting different variations of the coins.

So the item count is 2 that means we write the variations like (1,2,3,4) and (1,2,3,4), the target sum is 7. so (3+4), (4+3) then the output is 2

Next example is
Input:
2
3
4
**Output: **
3

Explanation:
If you have two items, each with a minimum of three variations, there are three ways to get a sum of 4: (1+3), (2+2),(3+1). So the total count of combinations are 3

Next example is
Input:
2
5
10
Output:
1

Explanation:
With two different items, each combination are having five variations, there are 1 way to achieve a sum of 10.

Note:
First line of the INPUT represent item count (m)
The second line of the INPUT represent variation of the items(r)
Third line of the INPUT represent target value

First line of the OUTPUT represent total combination count.

Sample Exercise -1:

Input:
1
8
8
Output:
1

Sample Exercise -2:

Input:
2
3
3
Output:
2 */
