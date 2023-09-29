/**
 * @home of sweet people (medellin) 
 *  @author  : Mark Cleo Calbang
 *            Clarence Simoran
 *            John Richard Mepieza
 *            Karl Noynay 
 */
public class MainActivity2
{
	public static void main(String[] args)
	{
		Dogs4Sale [] Dogs= new Dogs4Sale[3];
		Dogs4Sale doggy =new Dogs4Sale();
		Dogs[0]= new  Dogs4Sale ("Richard",1000,"Golden Retriever");
		Dogs[1]= new  Dogs4Sale ("Karl",2000,"Husky");
		Dogs[2]= new  Dogs4Sale ("SimoRun",3000,"pitbull");
		
		for( int DAll = 0 ; DAll < Dogs.length; DAll++){
			Dogs[DAll].DisplayInfo();
		}
	}
}
