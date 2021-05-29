public class Circle implements Shape {

    private String ShapeType = "CIRCLE";
    private String NumberOfSides = "INFINITE";


    @Override
    public String getShapeType() {
        return this.ShapeType;
    }


    @Override
    public String getNumberOfSides() {
        return this.NumberOfSides;
    }
}
