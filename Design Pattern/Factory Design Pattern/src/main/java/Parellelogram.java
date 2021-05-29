public class Parellelogram implements Shape{

    private String ShapeType = "parellelogram";
    private String NumberOfSides = "4";

    @Override
    public String getShapeType() {
        return this.ShapeType;
    }

    public void setShapeType(String name) {
        this.ShapeType = name;
    }

    @Override
    public String getNumberOfSides() {
        return this.NumberOfSides;
    }

    public void setNumberOfSides(String sides) {
        this.NumberOfSides = sides;
    }
}
