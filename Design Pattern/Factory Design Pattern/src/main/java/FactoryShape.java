public class FactoryShape {

    private String shapeType;
    private Shape shape = null;

    public Shape chooseShape(String shapeType) {
            this.shapeType = shapeType;
            if(shapeType.equals("C")) {
                this.shape = new Circle();
            }
            else if(shapeType.equals("R")) {
                System.out.println(shapeType);
                this.shape = new Rectangle();
            }
            else if(shapeType.equals("S")) {
                this.shape = new Square();
            }
            return this.shape;
    }

}
