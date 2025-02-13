package MowerProj.mow;
//Ryan Jukes
//2-3-25
//AT Java Lawn Mower Part B

import java.util.Random;
import java.util.Scanner;

public class Mower {
    public int row;
    public int col;
    public int direct;

    public Mower(int vert, int hor, int dir) {
        row = vert; 
        col = hor;
        direct = dir;
    }

    public int returnRow() {
        return row;
    }

    public int returnCol() {
        return col;
    } 
    
    public int returnDirect() {
        return direct;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setDirect(int direct) {
        this.direct = direct;
    }

    public void turnL() {
        this.direct = ((direct + 3)%4);
    }

    public void turnR() {
        this.direct = ((direct + 1)%4);
    }

    public boolean posGrassBool(Yard ryard) {
        return ryard.returnGen(row, col) == '+';
    }

    public void restrictedMow(Yard ryard) {
        if (posGrassBool(ryard)) {
            ryard.altSpace(row, col, ' ');
        }
    }

     public void mow(Yard yard){
        yard.altSpace(row, col, ' ');
    }

    public boolean checkForR(Yard ryard) {
        int nextRow = row;
        int nextCol = col;

        if (direct == 0) { 
            nextRow -= 1; 
        } else if (direct == 1) { 
            nextCol += 1; 
        } else if (direct == 2) { 
            nextRow += 1; 
        } else if (direct == 3) { 
            nextCol -= 1; 
        } 

        if (nextRow < 0 || nextRow >= ryard.returnH() + 2 ||nextCol < 0 || nextCol >= ryard.returnW() + 2) {
            return true; 
        }

        return ryard.returnGen(nextRow, nextCol) == 'R';
    }

    public boolean updateMower(Yard ryard) {
        int nRow = row;
        int nCol = col;
        if (direct == 0) {
            nRow--;
        } else if (direct == 1) {
            nCol++;
        } else if (direct == 2) {
            nRow++; 
        } else if (direct == 3) {
            nCol--; 
        } 
        if (ryard.returnGen(nRow, nCol) == 'R') {
            return false;
        }
        return true;
    }

    public boolean updateMower2(Yard ryard) {
        int[][] directions = { {0, 1}, {1, 0}, {0, -1}, {-1, 0} }; 
        int attempts = 0;

    while (attempts < 4) { 
        int nextRow = row + directions[direct][0];
        int nextCol = col + directions[direct][1];

        if (ryard.returnGen(nextRow, nextCol) == '+') {
            row = nextRow;
            col = nextCol;
            return true;
        } else { 
            direct = (direct + 1) % 4;
            attempts++;
        }
    }
    return false; 
    }

   public boolean updateMower3(Yard ryard) {
        for (int i = 1; i <= ryard.returnH(); i++) {
        for (int j = 1; j <= ryard.returnW(); j++) {
            if (ryard.returnGen(i, j) == '+') { 
                if (row < i) { 
                    setDirect(2); 
                    goethForward(ryard);
                } else if (row > i) { 
                    setDirect(0); 
                    goethForward(ryard);
                } else if (col < j) { 
                    setDirect(1); 
                    goethForward(ryard);
                } else if (col > j) { 
                    setDirect(3); 
                    goethForward(ryard);
                }
                return true; 
            }
        }
    }
    return false;
    }
 
    public char getDirectionSymbol() {
        if (direct == 0) {
            return '^'; 
        } else if (direct == 1) {
            return '>'; 
        } else if (direct == 2) {
            return 'v'; 
        } else {
            return '<'; 
        }
    }

    public static int randH(Yard yard){
        Random rand= new Random();
        int x = rand.nextInt(2);
        if (x == 1){
            return yard.returnH();
        } else {
            return 1;
        }
   }

   public static int randW(Yard yard){
        Random rand= new Random();
        int y = rand.nextInt(2);
        if (y == 1){
            return yard.returnW();
        } else {
            return 1;
        }
   }
   public static int randD(){
        Random rand = new Random();
        int dir = rand.nextInt(4);
        return dir;
   }

    public void goForward (Yard ryard) {
        if (updateMower(ryard)) {
        if (direct == 0) {
            row--;
        } else if (direct == 1) {
            col++;
        } else if (direct == 2) {
            row++; 
        } else if (direct == 3) {
            col--; 
        } else {
            turnR();
        }
    }
}

 public void goethForward(Yard yard){
        if (!checkForR(yard)){
            if(direct == 0){
                row--;
            } else if(direct ==1 ){
                col++;
            } else if (direct == 2){
                row++;
            } else if (direct == 3){
                col--;
            }
        }
    }

public static void clearScreen() {
     System.out.print("\033[H\033[2J");
     System.out.flush();
    }

    public static void delay(long mseconds) {
       try {
           Thread.sleep(mseconds);
       } catch (InterruptedException e) {
           System.err.println("InterruptedException received!");
       }
   }

private final Random rand = new Random();
public void rmp(Yard ryard) {
    int xCord = ryard.returnW();
    int yCord = ryard.returnH();
    int [][] cornerList = {{1,1}, {xCord, 1}, {1,yCord}, {xCord, yCord}};
    int [] trueCorner = cornerList[rand.nextInt(4)];
    row = trueCorner[0];
    col = trueCorner[1];
    direct = rand.nextInt(4);
}

public void mowLawn(Yard ryard) {
    int zigzag = 1;
    rmp(ryard);
        while (true) {
        clearScreen();
        restrictedMow(ryard); 
        ryard.spawnYard(this);
        delay(500);
        if (updateMower(ryard)) {
            goForward(ryard);  
        } else { 
            if (zigzag % 2 != 0) {
                turnR();
                goForward(ryard);
                turnR();
                zigzag++; 
            } else {
                turnL();
                goForward(ryard);
                turnL();
                zigzag++;
            } 
        }
    } 
}
public static void main(String[] args) {
    clearScreen();
    Scanner in = new Scanner(System.in);
    System.out.print("Desired lawn height: ");
    int inpHeight = in.nextInt();
    System.out.print("Desired lawn width:  ");
    int inpWidth = in.nextInt();
    Yard yard = new Yard(inpHeight, inpWidth);
    Mower mower = new Mower(1, 1, 1);
    mower.rmp(yard);
    yard.spawnYard(mower);
    mower.mow(yard);
    delay(500);
    while (mower.updateMower3(yard)) {
        Mower.clearScreen();
        mower.mow(yard);
        yard.spawnYard2(mower);
        delay(500);
    }




}

}



