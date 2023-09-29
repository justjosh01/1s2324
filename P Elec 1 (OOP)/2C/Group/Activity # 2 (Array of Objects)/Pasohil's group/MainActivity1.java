
public class MainActivity1 {
  public static void main(String[] args) {
    Tshirt tshirt1 = new Tshirt ("adidas", "black", 20);
     tshirt1.setBrand("puma");
     tshirt1.setColor("white");
     tshirt1.setQuantity(100);

     Tshirt tshirt2= new Tshirt ();
    tshirt2.setBrand("oxygen");
    tshirt2.setColor("red");
    tshirt2.setQuantity(800);

    Tshirt tshirt3  = new Tshirt ();
    tshirt3.setBrand("levi");
   tshirt3.setColor("green");
   tshirt3.setQuantity(120);

    System.out.println("Tshirt 1: " + tshirt1.getBrand() + " with color white " + tshirt1.getBrand()
        + " and has a Quantity of " + tshirt1.getQuantity());

    System.out.println("Tshirt 2: " + tshirt2.getBrand() + " with color red " + tshirt2.getColor()
        + " and has a quantity of " + tshirt2.getQuantity());

    System.out.println("Tshirt 3: " + tshirt3.getBrand() + " with color green " + tshirt3.getColor()
        + " and has a quantity of " + tshirt3.getQuantity());
        }
      }
     