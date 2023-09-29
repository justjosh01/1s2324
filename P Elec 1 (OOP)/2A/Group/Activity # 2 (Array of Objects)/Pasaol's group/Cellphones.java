
/**Pasaol, Keith Arleanne
 * Mondejar, Daphne 
 * Linabog, Gerlie
 * Godin, Hannah Israela
 
 **/
public class Cellphones {

   private String PhoneBrand;
   private String Price;
   private String ModelName;
   
  public Cellphones(String PhoneBrand, String Price, String ModelName){
       this.PhoneBrand= PhoneBrand;
       this.Price= Price;
       this.ModelName= ModelName;
      
       
    }
    protected void setPhoneBrand(String PhoneBrand){
       this.PhoneBrand= PhoneBrand;
    }   

 protected void setPrice(String Price){
 this.Price= Price;
 }   
 
 protected void setModelName(String ModelName){
 this.ModelName= ModelName;
 }   

 
 String getPhoneBrand(){
 return PhoneBrand;
}
 String getPrice(){
 return Price;
}

 String getModelName(){
 return ModelName;
 }
 
}