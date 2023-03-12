public class Wolf extends wildAnimal{
    private Boolean leader;
    public Wolf(double height, double weight, String colorEyes, String habitat, String dataBirth,
                Boolean leader) {
        super(height, weight, colorEyes, habitat, dataBirth);
        this.leader = leader;
    }

    public Boolean getLeader(){
        return leader;
    }

    @Override
    protected void makeSound() {
        System.out.println("Уууууу.");
    }
}
