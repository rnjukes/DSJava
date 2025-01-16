/*

Ryan Jukes
1-16-24
AT Java HW 23 B



public static int getInt() {
    try {
        return 1;
    } catch (Exception e) {
        return 2;
    } finally {
        return 3;
    }
}

public static void main(String[] args) {
    System.out.println(getInt());
}

 

The code here would output the value 3. This is because the 'finally' part of the statement will
always go last and overide the other parts ('catch' and 'try') if needed. Thus, 3 would be printed
when the code is ran.

 */