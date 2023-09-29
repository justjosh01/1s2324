/*
    MEMBERS:
    SECUYA, JESSAH R.
    ROSELL, MARY GRACE M.
    TEJENO, JEANCIN S.
    SINANGOTE, BILMARK C.
*/
public class MainActivity1 {
    public static void main(String[] args) {
        //Object 1
        Transportation transportation1 = new Transportation();
        transportation1.setTypeOfTransportation("Sea Transportation");
        transportation1.setModeOfTransportation("Ship");
        transportation1.setRoute("Cebu to Manila");
        System.out.println("\t\tTransportation 1\n" + transportation1.getTypeOfTransportation() + " || " + transportation1.getModeOfTransportation() + " || " + transportation1.getRoute() + "\n");

        //Object 2
        Transportation transportation2 = new Transportation("Land Transportation", "Bus", "Daanbantayan to Cebu");
        transportation2.display(2);

        //Object 3
        Transportation transportation3 = new Transportation("Land Transportation", "Tricycle", "Kawit to Medellin");
        //Updating the parameters
        transportation3.setTypeOfTransportation("Air Transportation");
        transportation3.setModeOfTransportation("Airplane");
        transportation3.setRoute("Manila to Davao");
        transportation3.display(3);
    }
}