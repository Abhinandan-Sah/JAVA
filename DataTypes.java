/*
By default, every Number is int and every floating point number is double.

				WIDENING
	assigning lower precision value to a higher precision variable. It is automatic.
	------------------------------------------------------------>
 byte	short	int		long		float		double
 <------------------------------------------------------------
				NARROWING
	assigning a higher precision value to a lower precision variable. It is explicitly done.
*/
public class DataTypes
{
 static public void main(String[] args)
 {
	long mobile = 8437360391L;
	
	//System.out.println(Long.MAX_VALUE);

	//byte b = 100;	//Explicit typecasting is not required when the value is in the range in case of Integer types
	//	byte b = (byte)130;
	//double b = 10;		//widening
	//int b =(int) 10.0;

//Floating Point Numbers
	
//	float b = (float)1.5;	//Explicit typecasting
//	float b = 1.5f;
	//System.out.println(b);

	//char x = '_';			//Single character inside ' ' is a valid character literal
	char x = 65; 
	short a = (short)x;		//Char to byte and short is Explicit typecasting
	System.out.println(a);

	int b = 65;
	char c = 65;
	c+=1;
	System.out.println(c);

 }
}