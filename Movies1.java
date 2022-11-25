class Movies1
{
static String bestMovies[]={"Kanthara","Brahmastra","777 Charli","KGF","Karthikeya","Vikranth Rona","Gandhada Gudi","Vikram","Liger","Har Har Mahadev","Banaras"};
static double imbdRateing[]={9.1,5.6,8.9,8.4,7.9,7.1,9.7,8.4,2.9,2.2,8.5};
static int slNo[]={1,2,3,4,5,6,7,8,9,10,11};
public static void main(String a[])
  {
	for(int index=0;index<=slNo.length-1;index++)
	{
		System.out.print(slNo[index]+" "+bestMovies[index]  +" "+ imbdRateing[index] );
    }
//System.out.println("The Top Webseries are "+"\n"+slNo[0]+" "+bestMovies[0]+" "+imbdRateing[0]+"\n"+slNo[1]+" "+bestMovies[1]+" "+imbdRateing[1]+"\n"+slNo[2]+" "+bestMovies[2]+" "+imbdRateing[2]+"\n"+slNo[3]+" "+bestMovies[3]+" "+imbdRateing[3]+"\n"+slNo[4]+" "+bestMovies[4]+" "+imbdRateing[4]+"\n"+slNo[5]+" "+bestMovies[5]+" "+imbdRateing[5]+"\n"+slNo[6]+" "+bestMovies[6]+" "+imbdRateing[6]+"\n"+slNo[7]+" "+bestMovies[7]+" "+imbdRateing[7]+"\n"+slNo[8]+" "+bestMovies[8]+" "+imbdRateing[8]+"\n"+slNo[9]+" "+bestMovies[9]+" "+imbdRateing[9]+"\n"+slNo[10]+" "+bestMovies[10]+" "+imbdRateing[10]);
   }

}
