package MowerProj.mow;
//Ryan Jukes
//2-2-25
//AT Java Lawn Mower Part A

public class Yard {
    private int yardWidth; 
    private int yardHeight;
    private char[][] lawn;

    public int returnW() {
        return ((yardWidth - 2));
    }

    public int returnH() {
        return (yardHeight - 2);
    }

    public char returnGen(int row, int col) {
    if (row < 0 || row >= lawn.length || col < 0 || col >= lawn[0].length) {
        return 'X'; 
    }
    return lawn[row][col];
    }

    public void altSpace(int row, int col, char inputValue) {
              lawn [row][col] = inputValue;

    }

      public Yard (int x, int y) {
        x = x + 2;
        y = y + 2;
        yardWidth = x;
        yardHeight = y;

        lawn = new char [yardWidth][yardHeight];

        for (int i = 0; i < yardWidth; i++) {
            lawn[i][0] = 'R';
            lawn[i][yardHeight-1] = 'R';
        }
        for (int i = 0; i < yardHeight; i++) {
            lawn[0][i] = 'R';
            lawn[yardWidth-1][i] = 'R';
        }
        for (int i = 1; i < yardWidth-1; i++) { 
            for (int a = 1; a < yardHeight-1; a++) {
                lawn[i][a] = '+';
            } } }

    public void spawnYard(Mower mower) {
        for (int d = 0; d < yardWidth; d++) {
            for (int e = 0; e < yardHeight; e++) {
                if (d == mower.returnRow() && e == mower.returnCol()) {
                    char actualMower = '>';
                    if (mower.returnDirect() == 0) {
                        actualMower = '^';
                    } else if (mower.returnDirect() == 1) {
                        actualMower = '>';
                    } else if (mower.returnDirect() == 2) {
                        actualMower = 'v';
                    } else if (mower.returnDirect() == 3) {
                        actualMower = '<';
                    }
                    System.out.print(actualMower);
                } else {
                    System.out.print(lawn[d][e]);
                }
            } 
            System.out.println();
        }
    }

     public void spawnYard2(Mower mower){
        int mowerRow = mower.returnRow();
        int mowerCol = mower.returnCol();
        int mowerDir = mower.returnDirect(); 
        for (int i = 0; i < lawn.length; i++) {
            for (int j = 0; j < lawn[i].length; j++) {
                if (i == mowerRow && j == mowerCol) {
                    System.out.print(mower.getDirectionSymbol()); 
                } else {
                    System.out.print(lawn[i][j]); 
                }
            }
            System.out.println();
        }
    }     

}