package MowerProj.mow;
//Ryan Jukes
//2-2-25
//AT Java Lawn Mower Part A

public class Yard {
    private int yardWidth; 
    private int yardHeight;
    private char[][] ryard;

    public int returnH() {
        return (yardWidth - 2);
    }

    public int returnW() {
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

    public void spawnYard() {
        for (int c = 0; c < yardWidth; c++) {
            for (int d = 0; d < yardHeight; d++) {
                System.out.print(ryard[c][d]);
            }
            System.out.println();
        } 
       
    } }