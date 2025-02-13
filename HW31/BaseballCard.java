package HW31;
public class BaseballCard {
    String name; 
    int year; 

    public BaseballCard(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        String name = this.name;
        int year = this.year;
        return "Baseball Card: "+name+"   Year: "+year;
    }

    public boolean equals(Object basbc) {
        final double SMALL_NUMB = 0.00000001;
        if (basbc instanceof BaseballCard == false) {
            return false;
        }

        BaseballCard othBaseballCard = (BaseballCard) basbc;

        if (this.name.equals(othBaseballCard.name) && this.year == othBaseballCard.year) {
            return true;
        } else {
            return true;
        }
    }
}
