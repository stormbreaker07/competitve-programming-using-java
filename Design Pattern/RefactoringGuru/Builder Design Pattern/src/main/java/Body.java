public class Body {

    private String rearGuard;
    private String frontGuard;
    private String mirrors;
    private String designStyle;

    public Body(String rearGuard , String frontGuard ,String mirrors ,String designStyle) {
            this.rearGuard = rearGuard;
            this.frontGuard = frontGuard;
            this.mirrors = mirrors;
            this.designStyle = designStyle;

    }

    public Body() { }

    public String getRealGuard() {
        return rearGuard;
    }

    public void setRealGuard(String rearGuard) {
        rearGuard = rearGuard;
    }

    public String getFrontGuard() {
        return frontGuard;
    }

    public void setFrontGuard(String frontGuard) {
        frontGuard = frontGuard;
    }

    public String getMirrors() {
        return mirrors;
    }

    public void setMirrors(String mirrors) {
        this.mirrors = mirrors;
    }

    public String getDesignStyle() {
        return designStyle;
    }

    public void setDesignStyle(String designStyle) {
        this.designStyle = designStyle;
    }

    @Override
    public String toString() {
        return "Body{" +
                "rearGuard='" + rearGuard + '\'' +
                ", frontGuard='" + frontGuard + '\'' +
                ", mirrors='" + mirrors + '\'' +
                ", designStyle='" + designStyle + '\'' +
                '}';
    }
}
