//Ryan Jukes
//11-3-24
//Lesson 10 HW Part D 

public class JukesHW10D {
public static void main(String[] args) {
    int totalRows = 5; 
    for (int x = 1; x <= totalRows; x++) {
        for (int y = 1; y <= totalRows-x; y++) {
            System.out.print(".");
        }
        for (int z = 1; z<=x; z++) {
            System.out.print(x);
        }
        System.out.println();
    }
}
}