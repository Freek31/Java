/**
 * @author Kevin Lafon
 * @creation_date 10 févr. 2020
 * @last_change_date 10/02/2020 11:36:44
 */
public class MinMax 
{
	public static short Min (short a, short b)
    {
	   short min;
	   if(a < b){
		   min = a;
	   }
	   else{
		   min = b;
	   }
	   return min;
    }
	
	public static short Max (short a, short b)
    {
	   short max;
	   if(a > b)
	   {
		   max = a;
	   }
	   else
	   {
		   max = b;
	   }
	   return max;
    }
}
