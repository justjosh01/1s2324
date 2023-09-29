public class Transportation {
    //private fields
    private String typeOfTransportation;
    private String modeOfTransportation;
    private String route;

    //Constructors
    public Transportation(){
    }

    public Transportation(String type, String mode, String route){
        this.typeOfTransportation = type;
        this.modeOfTransportation = mode;
        this.route = route;
    }

    //setters
    public void setTypeOfTransportation(String typeOfTransportation) {
        this.typeOfTransportation = typeOfTransportation;
    }

    public void setModeOfTransportation(String modeOfTransportation) {
        this.modeOfTransportation = modeOfTransportation;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    //Getters
    public String getTypeOfTransportation() {
        return this.typeOfTransportation;
    }

    public String getModeOfTransportation() {
        return this.modeOfTransportation;
    }

    public String getRoute() {
        return this.route;
    }

    //Display Method
    public void display(int number){
        System.out.println("================================");
        System.out.println("\t\tTransportation" + " " + number + "\n" +getTypeOfTransportation() + " || " + getModeOfTransportation() + " || " + getRoute());
        System.out.println("================================");
    }
}
