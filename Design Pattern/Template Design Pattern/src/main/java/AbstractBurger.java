public abstract class AbstractBurger {

    final void makeBurger() {

    cutBun();

        if(customerWantMeat()) {
            addMeat();
        }
        if(customerWantCheeze()) {
            addCheeze();
        }if(customerWantVinegar()) {
            addVinegar();
        }if(customerWantVeggies()) {
            addVeggies();
        }

        WrapTheBurger();
    }

    void cutBun() {
        System.out.println("cut the bun");
    }


    abstract void addMeat();
    abstract void addVeggies();
    abstract void addVinegar();
    abstract void addCheeze();


    void WrapTheBurger() {
        System.out.println("packing up the burger");
    }

    public Boolean customerWantCheeze() {
        return true;
    }public Boolean customerWantVeggies() {
        return true;
    }public Boolean customerWantMeat() {
        return true;
    }
    public Boolean customerWantVinegar() {
        return true;
    }



}
