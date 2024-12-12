//Ryan Jukes
//12-11-24
//HW Lesson 17 B

public class JukesHW17B {
public static void main(String[] args) {
    
  int[][] matrixpart1 = {
   {8, 6, 7},
   {5, 3 ,0} };  

  int[][] matrixpart2 = {
   {0, 7, 6, 5},
   {2, 2, 0, 1}, 
   {8, 4, 5, 7} };  

   System.out.println("First array:");
   printmatrix(matrixpart1);
   System.out.println("");

   System.out.println("Second array:");
   printmatrix(matrixpart2);

}


public static void printmatrix(int[][] matrix) {
    for (int i = 0; i < matrix.length; i++) {
        for (int x = 0; x < matrix[i].length; x++) {
            System.out.print(matrix[i][x]);
            if (x < matrix[i].length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("");
    }
}
}