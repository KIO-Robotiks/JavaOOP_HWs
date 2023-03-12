public abstract class homeAnimal extends Animal implements Weasel{

    protected String name;
    protected String breed;
    protected Boolean vaccination;
    protected String colorWool;
    protected String dataBirth;
    public homeAnimal(double height, double weight, String colorEyes,
                      String name, String breed, Boolean vaccination, String colorWool, String dataBirth) {
        super(height, weight, colorEyes);
        this.name = name;
        this.breed = breed;
        this.vaccination = vaccination;
        this.colorWool = colorWool;
        this.dataBirth = dataBirth;
    }

    @Override
    public String toString() {
        String baseInfo = super.toString();
        return baseInfo + "\nhomeAnimal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", vaccination='" + vaccination + '\'' +
                ", colorWool='" + colorWool + '\'' +
                ", dataBirth='" + dataBirth + '\'' +
                '}';
    }
}
