package entity.inheritence;

import javax.persistence.Entity;

@Entity
public class Car extends Vechile{

    private int numberOfTires;

    public Car() {

    }

    public int getNumberOfTires() {
        return numberOfTires;
    }

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }
}
