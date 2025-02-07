package MowerProj.mow;
//Ryan Jukes
//2-3-25
//AT Java Lawn Mower Part B

public class Mower {
    public int row;
    public int col;
    public int direct;

    public Mower(int firstRPos, int firstCPos) {
        this.row = firstRPos; 
        this.col = firstCPos;
        this.direct = 1;
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

    public void changeSymbol(Yard ryard) {
        if (posGrassBool(ryard)) {
            ryard.altSpace(row, col, ' ');
        }
    }

    public boolean checkNext(Yard ryard) {
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
        
   /* 
   public boolean lawnExists(Yard ryard) {
        for (int x = 1; x < ryard.returnH()- 1; x++) {
            for (int y = 1; y < ryard.returnW() - 1; y++) {
                if (ryard.returnGen(x, y) == '+') {
                    return true;
                } 
            }
        }
        return false;
    }
   */

    public void goForward (Yard ryard) {
        if (checkNext(ryard)) {
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

public void mowLawn(Yard ryard) {
    int zigzag = 1;
    while (true) {
        clearScreen();
        changeSymbol(ryard); 
        ryard.spawnYard(this);
        delay(500);
        if (checkNext(ryard)) {
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
}
