public class WheelAndRims {

    private String wheels;
    private String rubberQuality;
    private String rimsColor;
    private String rimType;

    public WheelAndRims() {}

    public WheelAndRims(String wheels , String rubberQuality , String rimsColor , String rimType) {
        this.rimsColor = rimsColor;
        this.rimType = rimType;
        this.rubberQuality = rubberQuality;
        this.wheels = wheels;
    }

    public String getWheels() {
        return wheels;
    }

    public void setWheels(String wheels) {
        this.wheels = wheels;
    }

    public String getRubberQuality() {
        return rubberQuality;
    }

    public void setRubberQuality(String rubberQuality) {
        this.rubberQuality = rubberQuality;
    }

    public String getRimsColor() {
        return rimsColor;
    }

    public void setRimsColor(String rimsColor) {
        this.rimsColor = rimsColor;
    }

    public String getRimType() {
        return rimType;
    }

    public void setRimType(String rimType) {
        this.rimType = rimType;
    }

    @Override
    public String toString() {
        return "WheelAndRims{" +
                "wheels='" + wheels + '\'' +
                ", rubberQuality='" + rubberQuality + '\'' +
                ", rimsColor='" + rimsColor + '\'' +
                ", rimType='" + rimType + '\'' +
                '}';
    }
}
