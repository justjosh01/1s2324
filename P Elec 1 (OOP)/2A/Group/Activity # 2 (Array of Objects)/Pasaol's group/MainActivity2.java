/**Pasaol, Keith Arleanne
 * Mondejar, Daphne 
 * Linabog, Gerlie
 * Godin, Hannah Israela
 
 **/
public class MainActivity2 {
    public static void main(String[] args) {
        Cellphones[] cellphonesArray = new Cellphones[3]; 

        cellphonesArray[0] = new Cellphones("Samsung", "$100", "Galaxy S21");
        cellphonesArray[1] = new Cellphones("Apple", "$300", "iPhone 12");
        cellphonesArray[2] = new Cellphones("Google", "$490", "Pixel 5");
 
        for (Cellphones phone : cellphonesArray) {
            System.out.println("Brand: " + phone.getPhoneBrand());
            System.out.println("Price: " + phone.getPrice());
            System.out.println("Model: " + phone.getModelName());
            System.out.println();
        }
    }
}