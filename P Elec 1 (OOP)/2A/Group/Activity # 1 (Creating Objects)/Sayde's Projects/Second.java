public class Second{
    private int x;
    private int y;
}
Second(){
    System.out.println("Ok");
}
Second (int x,int y){
    System.out.println("Def");
    this.x = x;
    this.y = y;
}
//setter
protected void setX(int x){
    this.x = x;
}
protected void setY(int y){
    this.y = y;
}
peotected int getX(){
    return this.x;
}
protected int getY(){
    return this.y;
}
}