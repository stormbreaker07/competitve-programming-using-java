package ModelStructure;

public class YearAndSem {

    private int year;
    private int sem;

    public YearAndSem() {
        year = 0;
        sem = 0;

    }

    @Override
    public String toString() {
        return "YearAndSem{" +
                "year=" + year +
                ", sem=" + sem +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }
}
