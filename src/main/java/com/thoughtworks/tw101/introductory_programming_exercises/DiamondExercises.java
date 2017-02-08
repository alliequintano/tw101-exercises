package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

    //    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) { 
        int rowLength = (n * 2) - 1;  

        for (int rowNumber = 0; rowNumber < n; rowNumber++) { 
            int numberOfStarsInRow = (rowNumber * 2) + 1; 
            System.out.println(buildRow(numberOfStarsInRow, rowLength)); 
        } 
    }

    //    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *
    private static void drawADiamond(int n) {
         int totalNumberOfRows = (n * 2) - 1;
         int rowLength = (n * 2) - 1; 
        int numberOfStarsInRow;

          for (int rowNumber = 0; rowNumber < totalNumberOfRows; rowNumber++) { 
            if (rowNumber < totalNumberOfRows / 2 + 1) {
                 numberOfStarsInRow = (rowNumber * 2) + 1;
             } else { 
                numberOfStarsInRow = (totalNumberOfRows - rowNumber) * 2 - 1; 
            } 
            System.out.println(buildRow(numberOfStarsInRow, rowLength));
        }
     }

//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
// Note - name is not being centered 
    private static void drawADiamondWithYourName(int n) { 
        int totalNumberOfRows = (n * 2) - 1;
         int rowLength = (n * 2) - 1;  

        for (int rowNumber = 0; rowNumber < totalNumberOfRows; rowNumber++) { 
            if (rowNumber < totalNumberOfRows / 2) {
                 System.out.println(buildRow((rowNumber * 2) + 1, rowLength));
            }
            else if (rowNumber == totalNumberOfRows / 2) { 
                System.out.println("Allie");
            }
            else {
             System.out.println(buildRow((totalNumberOfRows - rowNumber) * 2 - 1, rowLength));
            }     
        }
    }  

    private static String buildSpaces(int numberOfSpacesInRow) {
         String spaces = "";  

        for (int i = 0; i < numberOfSpacesInRow; i++) {
             spaces += " "; 
        }
         return spaces;
     }  

    private static String buildStars(int numberOfStarsInRow) {
         String stars = "";  
        for (int i = 0; i < numberOfStarsInRow; i++) {
             stars += "*";
        }
         return stars; 
    }  

    private static String buildRow(int numberOfStarsInRow, int rowLength) { 
        String spaces = "";
         String stars = ""; 
        String row;

          int numberOfSpacesInRow = (rowLength - numberOfStarsInRow) / 2;  

        spaces += buildSpaces(numberOfSpacesInRow);
         stars += buildStars(numberOfStarsInRow);  

        row = spaces + stars + spaces; 
        return row;
    } 
}
