//stringTimes - Given a string and a non-negative int n, return a larger string that is n copies of 
//the original string.

public String stringTimes(String str, int n) 
{
	String largeString = str;
	
	if( str != "" )
		for( int ii = 0; ii <= n; ii++ )
			largeString += str;
	
	return largeString;
}


//doubleX - Given a string, return true if the first instance of "x" in the string is immediately
//followed by another "x".

public boolean doubleX(String str)
{
	boolean hasDoubleX = false;
	int xIndex = str.indexOf("x");
	
	if( str.length > xIndex + 1 )
		if( str.charAt(xIndex + 1) == 'x' )
			hasDoubleX = true;
		
	return hasDoubleX;
}


//stringBits - Give a string, return a new string made of every other char starting with the first,
//so "Hello" yields "Hlo".

public String stringBits(String str)
{
	String missingChars = "";
	
	for( int ii = 0; ii < str.length(); ii += 2 )
		missingChars += str.charAt(ii); 
	
	return missingChars;
}


//stringSplosion - Given a non-empty string like "Code" return a string like "CCoCodCode".

public String stringSplosion(String str)
{
	String splodedString = "";
	
	for(int ii = 0; ii <= str.length(); ii++)
		splodedString += str.substring(0, ii);
		
	return splodedString;
}


//arrayCount9 - Given an array of ints, return the number of 9's in the array.
{
	
}