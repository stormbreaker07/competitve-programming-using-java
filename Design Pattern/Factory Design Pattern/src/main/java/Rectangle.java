public class Rectangle extends Parellelogram{

    private String ShapeType = "Rectangle";

    public Rectangle() {
        setShapeType(ShapeType);
        setNumberOfSides("4");
    }

    @Override
    public String getShapeType() {
        return (this.ShapeType + "ovveriden");
    }


}
