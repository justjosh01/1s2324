public class Main {
    public static void main(String[] args) {
        // Creating three Color objects
        Color color1 = new Color(1, 2, 3); // Red
        Color color2 = new Color(4, 5, 6); // Green
        Color color3 = new Color(7, 8, 9); // Blue
        Color color4 = new Color();
        // Using getters to access and output color values
        System.out.println("Color 1: Red - " + color1.getRed() + ", Green - " + color1.getGreen() + ", Blue - "
                + color1.getBlue());
        System.out.println("Color 2: Red - " + color2.getRed() + ", Green - " + color2.getGreen() + ", Blue - "
                + color2.getBlue());
        System.out.println("Color 3: Red - " + color3.getRed() + ", Green - " + color3.getGreen() + ", Blue - "
                + color3.getBlue());
    }

    public static class Color {
        private int red;
        private int green;
        private int blue;

        // Constructor

        public Color(int red, int green, int blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        // Getter for 'red'
        public int getRed() {
            return red;
        }

        // Setter for 'red'
        public void setRed(int red) {
            this.red = red;
        }

        // Getter for 'green'
        public int getGreen() {
            return green;
        }

        // Setter for 'green'
        public void setGreen(int green) {
            this.green = green;
        }

        // Getter for 'blue'
        public int getBlue() {
            return blue;
        }

        // Setter for 'blue'
        public void setBlue(int blue) {
            this.blue = blue;
        }
    }
}
