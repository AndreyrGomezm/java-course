public class Motor {
    private double displacement;
    private TypeMotor type;

    public Motor() {
    }

    public Motor(double displacement, TypeMotor type) {
        this.displacement = displacement;
        this.type = type;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public TypeMotor getType() {
        return type;
    }

    public void setType(TypeMotor type) {
        this.type = type;
    }
}
