class TubeLight1
{
	static boolean isConnected=false;
	public static void main(String a[])
	{
		givelight();
		givelight();
	}
	public static void givelight()
	{
		if(isConnected==false)
		{System.out.println("light is off");
	isConnected=true;}
	else{System.out.println("light is ON");}
	}
}	