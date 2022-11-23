class Zomato
{
public static double findItem(String item)
   {
    System.out.println("Invoked ");
	if(item=="Biriyani"){return 255.0;}
	else{System.out.println("item not Available");}
   System.out.println("End of find item");
   return 0.0;
   
   }
}