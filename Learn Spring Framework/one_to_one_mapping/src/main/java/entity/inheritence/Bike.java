package entity.inheritence;

import javax.persistence.Entity;

@Entity
public class Bike extends Vechile{

    private int numberOfTires;

    public Bike() {

    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }
}
