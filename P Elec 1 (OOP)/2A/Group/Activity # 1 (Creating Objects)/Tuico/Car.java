public class Car {
    private String brand;
    private String color;
    private int speed;

    public void Car(String brand, String color, int speed){
        System.out.println();

        System.out.println("Brand : "+ brand);
        System.out.println("Color : "+ color);
        System.out.println("Speed : "+ speed);

    }
    //Setters
    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    //Getters
    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public int getSpeed(){
        return speed;
    }

}
