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

    public void turnR() {
        this.direct = ((direct + 3)%4);
    }

    public void turnL() {
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

    public boolean forwardFramework(Yard ryard) {
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

    public boolean FFpt2(Yard ryard) {
        for (int i = 1; i < ryard.returnH(); i++) {
            for (int j = 1; j < ryard.returnW(); j++) {
                if (ryard.returnGen(i, j) == '+') {
                    return true;
                }
            }
        }
        return false;
    }
        
    public void goForward (Yard ryard) {
        if (forwardFramework(ryard)) {
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
    boolean ynmow = true;
    boolean zigzag = true;
    while (ynmow) {
        clearScreen();
        changeSymbol(ryard); 
        ryard.spawnYard(this);
        delay(500);
        if (forwardFramework(ryard)) {
            goForward(ryard);  
        } else { 
            turnL();
            if (forwardFramework(ryard)) {
                goForward(ryard);
                turnL();
                zigzag= !zigzag;
            }
        }
    }
}
}
