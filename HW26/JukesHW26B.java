//Ryan Jukes
//1-31-25
//AT Java HW26 B

/*
class Item {
   private int value;
   public void setValue(int value) {
       value = value;
   }
   public int getValue() {
       return value;
   }
}

public class ThisDemo {
   public static void main(String[] args) {
       Item myItem = new Item();
       System.out.print(myItem.getValue() + " | ");
       myItem.setValue(13);
       System.out.println(myItem.getValue());
   }
}
*/

// This code outputs 0 | 0 because the iten class doesn't properly assign the value of 'value' to the instance varriable that
// it should, and this leads to the unexpected output. Below is the edited working code.


class Item {
   private int value;
   public void setValue(int value) {
       this.value = value;
   }
   public int getValue() {
       return value;
   }
}

public class JukesHW26B {
   public static void main(String[] args) {
       Item myItem = new Item();
       System.out.print(myItem.getValue() + " | ");
       myItem.setValue(13);
       System.out.println(myItem.getValue());
   }
}
