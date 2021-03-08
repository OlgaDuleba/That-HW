public static void main (String[] args) throws java.lang.Exception
	{
		double n = 9.0;
double m = 9.0;
double k = Math.abs(n - 10.0);
double l = Math.abs(m - 10.0);

if ( k < l )
{ 
	System.out.println("К десяти ближе" +n);
	}
	else if ( k == l)
	{ 
	System.out.println("Оба значения равноудалены от 10");
	}
	else
	{
		System.out.println("К десяти ближе" +m);
	}
	}