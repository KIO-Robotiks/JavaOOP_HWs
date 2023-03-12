public abstract class wildAnimal extends Animal{

    protected String habitat;
    protected String dataBirth;

    public wildAnimal(double height, double weight, String colorEyes,
                      String habitat, String dataBirth) {
        super(height, weight, colorEyes);
        this.habitat = habitat;
        this.dataBirth = dataBirth;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo + "\nwildAnimal{" +
                "habitat='" + habitat + '\'' +
                ", dataBirth='" + dataBirth + '\'' +
                '}';
    }
}
