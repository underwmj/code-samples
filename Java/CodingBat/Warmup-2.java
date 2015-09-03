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
	
	for( int ii = 0; ii <= str.length(); ii++ )
		splodedString += str.substring(0, ii);
		
	return splodedString;
}


//arrayCount9 - Given an array of ints, return the number of 9's in the array.

public int arrayCount9(int[] nums)
{
    int count = 0;

    for( int ii = 0; ii < nums.length; ii++ )
        if( nums[ii] == 9 )
            count++;
   
    return count;
}


//arryFront9 - Given an array of ints, return true if one of the first 4 elements in the array
//is a 9. The array length may be less than 4.

public boolean arrayFront9(int[] nums) 
{
    int index = 0;
    boolean has9 = false;

    for( int ii = 0; ii < nums.length; ii++ )
    {
        if( index < 4 && nums[ii] == 9 )
            has9 = true;

        index ++;
    }

    return has9;
}



