

import java.util.Scanner;

public class extra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of rows and columns
        int n = sc.nextInt();

        // Original matrix with diagonal elements filled as per question4
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            mat[i][i] = i + 1;
        }

        // Print the original matrix
        System.out.println("Original Matrix:");
        printMatrix(mat);

        // Fetch input for another matrix
        System.out.println("Enter the number of rows and columns for the second matrix:");
        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] num_arr = new int[row][col];

        // Fetch input from the user for the second matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                num_arr[i][j] = sc.nextInt();
            }
        }

        // Print the second matrix
        System.out.println("Second Matrix:");
        printMatrix(num_arr);

        // Modify the second matrix with new values
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                // Modify each element in the second matrix
                // You can apply your logic or computation here
                num_arr[i][j] =sc.nextInt(); /* Your logic here */;
            }
        }

        // Print the modified second matrix
        System.out.println("Modified Second Matrix:");
        printMatrix(num_arr);
    }

    // Utility method to print a matrix
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

// String[] arr = {"T", "A", "P", "A", "c", "A", "D", "E", "M", "y"};
//     String[] Lower_arr = Arrays.copyOf(arr, arr.length);
//     String[] Vowels = {"a", "e", "i", "o", "u"};
//     String[] result = {}; // Empty array

//     for (int i = 0; i < Lower_arr.length; i++) {
//         Lower_arr[i] = Lower_arr[i].toLowerCase();
//     }
//     System.out.println(Arrays.toString(Lower_arr));

//     for (int i = 0; i < Lower_arr.length; i++) {
//         boolean isVowel = false;

//         for (int j = 0; j < Vowels.length; j++) {
//             if (Lower_arr[i].equals(Vowels[j])) {
//                 isVowel = true;
//                 break; // No need to check other vowels
//             }
//         }

//         // If the current element is not a vowel, add it to the result array
//         if (!isVowel) {
//             result = Arrays.copyOf(result, result.length + 1);
//             result[result.length - 1] = Lower_arr[i];
//         }
//     }

//     System.out.println(Arrays.toString(result));
// }