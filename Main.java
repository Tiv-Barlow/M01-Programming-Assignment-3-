//SDEV 200 - Software Development Using Java
//Professor Adam Bumgardner
//Student: Tiv Muhammad
//24 Mar 2024
// Assignment: Mod1 Programming Assignment (3) 8.29
/*-------------------------------------------------------*/
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Function requests the user to input the 1st array data.
    System.out.print("Enter list1: ");
    int[][] list1 = new int[3][3];
    for (int i = 0; i < list1.length; i++) {
      for (int j = 0; j < list1[i].length; j++) {
        list1[i][j] = input.nextInt();
      }
    }

    // Function requests the user to input the 2nd array data.
    System.out.print("Enter list2: ");
    int[][] list2 = new int[3][3];
    for (int i = 0; i < list2.length; i++) {
      for (int j = 0; j < list2[i].length; j++) {
        list2[i][j] = input.nextInt();
      }
    }

    // Function confirms whether arrays are identical and returns result.
    if (equals(list1, list2)) {
      System.out.println("The two arrays are identical");
    } else {
      System.out.println("The two arrays are not identical");
    }

    input.close();
  }

  // Method confirms whether the two arrays are identical
  public static boolean equals(int[][] m1, int[][] m2) {
    // Check if the dimensions of the arrays are the same
    if (m1.length != m2.length || m1[0].length != m2[0].length) {
      return false;
    }

    // Function checks if the ELEMENTS of the arrays are the same
    for (int i = 0; i < m1.length; i++) {
      for (int j = 0; j < m1[i].length; j++) {
        if (m1[i][j] != m2[i][j]) {
          return false;
        }
      }
    }

    return true;
  }
}
