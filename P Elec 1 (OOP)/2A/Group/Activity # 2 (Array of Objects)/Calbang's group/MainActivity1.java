/**
 * @home of sweet people (medellin) 
 *  @author  : Mark Cleo Calbang
 *            Clarence Simoran
 *            John Richard Mepieza
 *            Karl Noynay 
 */

public class MainActivity1{
    public static void main(String []args){
        Doggy dogs = new Doggy();
        Doggy dog1 = new Doggy("Richard ",1000,"Golden Retriever ");
        Doggy dog2 = new Doggy("SimoRUN",800,"Pitbull");
        Doggy dog3 = new Doggy("Karl",1200,"Husky");
       
        // Print information about the dogs
		
		//information of Dog1 
   	    System.out.println("Dog 1:\n\t\tName:  " + dog1.getName() );
		System.out.println("\t\tBreed: "+ dog1.getBreed() ); 
		System.out.println("\t\tPrice :  " + dog1.getPrice());
		
		//information of Dog 2 
		System.out.println("Dog 2:\n\t\tName:  " + dog2.getName() );
		System.out.println("\t\tBreed: "+ dog2.getBreed() ); 
		System.out.println("\t\tPrice :  " + dog2.getPrice());
		
        //information of Dog 3 
		System.out.println("Dog 3:\n\t\tName:  " + dog3.getName() );
		System.out.println("\t\tBreed: "+ dog3.getBreed() ); 
		System.out.println("\t\tPrice :  " + dog3.getPrice());
    }
}