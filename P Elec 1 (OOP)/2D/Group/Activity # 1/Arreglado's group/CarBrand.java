public class CarBrand {
    private String brandName;
    private int yearFounded;
    private String headquartersLocation;

  
    public CarBrand(String brandName, int yearFounded, String headquartersLocation) {
        this.brandName = brandName;
        this.yearFounded = yearFounded;
        this.headquartersLocation = headquartersLocation;
    }

  
    public String getBrandName() {
        return brandName;
    }

   
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }


    public int getYearFounded() {
        return yearFounded;
    }


    public void setYearFounded(int yearFounded) {
        this.yearFounded = yearFounded;
    }


    public String getHeadquartersLocation() {
        return headquartersLocation;
    }


    public void setHeadquartersLocation(String headquartersLocation) {
        this.headquartersLocation = headquartersLocation;
    }

    @Override
    public String toString() {
        return "CarBrand{" +
                "brandName='" + brandName + '\'' +
                ", yearFounded=" + yearFounded +
                ", headquartersLocation='" + headquartersLocation + '\'' +
                '}';
    }

    public static void main(String[] args) {
        // Example usage
        CarBrand ford = new CarBrand("Ford", 1903, "Dearborn, Michigan");
        System.out.println(ford.toString());

        // Modifying the attributes using setters
        ford.setYearFounded(1902);
        ford.setHeadquartersLocation("Detroit, Michigan");
        System.out.println(ford.toString());
    }
}

