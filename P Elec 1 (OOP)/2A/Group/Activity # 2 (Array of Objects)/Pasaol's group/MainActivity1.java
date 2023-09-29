/**Pasaol, Keith Arleanne
 * Mondejar, Daphne 
 * Linabog, Gerlie
 * Godin, Hannah Israela
 
 **/
public class MainActivity1 {

   
    public static void main(String[] args) {
        
       Cellphones m = new Cellphones("Vivo\n", "Oppo\n","Samsung\n");
       
      m.setVivo("Nokia");
       String gadgets = m.getVivo();
       
      m.setOppo("Apple");
       String gadgets1 = m.getOppo();
       
      m.setSamsung("O+");
       String gadgets2 = m.getSamsung();
       
       System.out.println("new gadget created: " + gadgets);
       System.out.println("new gadget created: " + gadgets1);
       System.out.println("new gadget created: " + gadgets2);
//Gadgets, Gadgets1, Gadgets2 Objects
       
    }
    
    
}