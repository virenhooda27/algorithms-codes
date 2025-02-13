import java.util.Scanner;

public class legoblocks {
    
    // Modulo constant
    private static final int MOD = 1000000007;
    
    // Precomputes number of ways to build a row of width m
    private static long[] computeRowWays(int m) {
        long[] rowWays = new long[m + 1];
        rowWays[0] = 1; // One way to build a wall of width 0 (no bricks)
        
        for (int i = 1; i <= m; i++) {
            rowWays[i] = rowWays[i - 1]; // 1x1 brick
            if (i >= 2) rowWays[i] = (rowWays[i] + rowWays[i - 2]) % MOD; // 1x2 brick
            if (i >= 3) rowWays[i] = (rowWays[i] + rowWays[i - 3]) % MOD; // 1x3 brick
            if (i >= 4) rowWays[i] = (rowWays[i] + rowWays[i - 4]) % MOD; // 1x4 brick
        }
        
        return rowWays;
    }
    
    // Function to calculate modular exponentiation
    private static long modPow(long base, int exp, int mod) {
        long result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp /= 2;
        }
        return result;
    }
    
    public static int legoWall(int n, int m) {
        long[] rowWays = computeRowWays(m);
        
        // Total ways to build a wall of height 1 and width m
        long[] totalWays = new long[m + 1];
        for (int i = 1; i <= m; i++) {
            totalWays[i] = modPow(rowWays[i], n, MOD); // rowWays[i]^n % MOD
        }
        
        // Subtract invalid walls that have vertical splits using inclusion-exclusion
        long[] validWalls = new long[m + 1];
        validWalls[0] = 1;
        for (int i = 1; i <= m; i++) {
            validWalls[i] = totalWays[i];
            for (int j = 1; j < i; j++) {
                validWalls[i] = (validWalls[i] - validWalls[j] * totalWays[i - j] % MOD + MOD) % MOD;
            }
        }
        
        return (int) validWalls[m];
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        
        // Output the result
        System.out.println(legoWall(n, m));
        
        scanner.close();
    }
}

/*Build a wall with lego blocks
How many different ways can you build a wall of height 'n' and width 'm' using an infinite number of Lego bricks of four types, each with different dimensions (depth x height x width)? The types of Lego bricks available are:

Depth: 1, Height: 1, Width: 1
Depth: 1, Height: 1, Width: 2
Depth: 1, Height: 1, Width: 3
Depth: 1, Height: 1, Width: 4
The wall should satisfy the following conditions:

There should be no holes in the wall.
The wall should be a single solid structure without a straight vertical break across all rows of bricks.
The bricks must be laid horizontally.
Provide the number of ways to build the wall, considering that the result should be output modulo 1000000007.

Example:

For n = 2 and m = 2, the output should be legoWall(n, m) = 3.
For n = 3 and m = 2, the output should be legoWall(n, m) = 7.
For n = 2 and m = 3, the output should be legoWall(n, m) = 9.

Input/Output:

1.The input consists of two integers: n and m, representing the desired height and width of the wall, respectively.
2.The output is a long integer representing the number of ways to build the wall, modulo 1000000007.

Exercise-1
Input:
2
2

Here
First row - n value
Second row - m value

Output:
3

Exercise-2
Input:
4
4

Output:
3375*/