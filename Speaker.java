class Speaker 
{
static String brandName = "JBL";
static String frequency="50hz";
static boolean isWireless=true;
static boolean isConnected=true;
static int minVolume;
static int maxVolume =15;
static int currentVolume=15;
public static void onOrOff()
{
if(isConnected==false)
{System.out.println("speaker is in Off condition");
isConnected=true;}
else{System.out.println("speaker is in ON condition");}
}
public static void main(String a[]){
//onOrOff();
//onOrOff();
decreaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();
decreaseVolume();


}
public static void increaseVolume()
{
	if(isConnected==true)
	{
		if(currentVolume<maxVolume)
		{
			currentVolume=currentVolume+1;
				System.out.println(currentVolume);
	    }
        else {	System.out.println("You have reached Max value");}	
	}
	else{	System.out.println("Turn on the Speaker");}
}
public static void decreaseVolume()
    {
 	  if(isConnected==true)
	    {
		  if(currentVolume==minVolume)
		  {System.out.println("You have reached min Volume");}
	      else if(currentVolume<=maxVolume)
		  {
			  currentVolume=currentVolume-1;
			  System.out.println(currentVolume);
		  }
		  else{System.out.println("You have reached min Volume");}
	    }
		else{System.out.println("Turn on the speaker");}
    }
}
