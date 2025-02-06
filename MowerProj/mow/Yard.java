package MowerProj.mow;
//Ryan Jukes
//2-2-25
//AT Java Lawn Mower Part A

public class Yard {
    private int yardWidth; 
    private int yardHeight;
    private char[][] ryard;

    public int returnW() {
        return (yardWidth - 2);
    }

    public int returnH() {
        return (yardHeight - 2);
    }

    public char returnGen(int x, int y) {
        return ryard[x][y];
    }

    public void altSpace(int x, int y, char inputValue) {
        ryard [x][y] = inputValue;
    }

    public Yard (int x, int y) {
        x = x + 2;
        y = y + 2;
        yardWidth = x;
        yardHeight = y;

        ryard = new char [yardWidth][yardHeight];

        for (int i = 0; i < yardWidth; i++) {
            ryard[i][0] = 'R';
            ryard[i][yardHeight-1] = 'R';
        }
        for (int i = 0; i < yardHeight; i++) {
            ryard[0][i] = 'R';
            ryard[yardWidth-1][i] = 'R';
        }
        for (int i = 1; i < yardWidth-1; i++) { 
            for (int a = 1; a < yardHeight-1; a++) {
                ryard[i][a] = '+';
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
                    System.out.print(ryard[d][e]);
                }
            } 
            System.out.println();
        }
    }

}